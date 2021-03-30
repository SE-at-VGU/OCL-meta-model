/**************************************************************************
Copyright 2019 Vietnamese-German-University

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

@author: ngpbh
***************************************************************************/

package org.vgu.se.ocl.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.vgu.dm2schema.dm.DataModel;
import org.vgu.se.ocl.classifier.parser.ClassifierParser;
import org.vgu.se.ocl.dm.parser.DMParser;

import com.vgu.se.jocl.expressions.AssociationClassCallExp;
import com.vgu.se.jocl.expressions.BooleanLiteralExp;
import com.vgu.se.jocl.expressions.CallExp;
import com.vgu.se.jocl.expressions.Expression;
import com.vgu.se.jocl.expressions.FeatureCallExp;
import com.vgu.se.jocl.expressions.IntegerLiteralExp;
import com.vgu.se.jocl.expressions.IteratorExp;
import com.vgu.se.jocl.expressions.LiteralExp;
import com.vgu.se.jocl.expressions.LoopExp;
import com.vgu.se.jocl.expressions.M2MAssociationClassCallExp;
import com.vgu.se.jocl.expressions.NavigationCallExp;
import com.vgu.se.jocl.expressions.NumericLiteralExp;
import com.vgu.se.jocl.expressions.Operation;
import com.vgu.se.jocl.expressions.OperationCallExp;
import com.vgu.se.jocl.expressions.PrimitiveLiteralExp;
import com.vgu.se.jocl.expressions.PropertyCallExp;
import com.vgu.se.jocl.expressions.StringLiteralExp;
import com.vgu.se.jocl.expressions.TypeExp;
import com.vgu.se.jocl.expressions.Variable;
import com.vgu.se.jocl.expressions.VariableExp;
import com.vgu.se.jocl.types.Type;

import ocl.dm.AssociationEnd;
import ocl.exp.ExpPackage;

public class OCLParser {
    public static Expression convertToExp(String filePath) {
        ocl.exp.OclExpression oclExpXMI = extractEOclExp(filePath);
        Expression oclExpJSON = transform(oclExpXMI);
        return oclExpJSON;
    }

    public static DataModel extractDataModel(String filePath) {
        // Initialize the model
        ExpPackage.eINSTANCE.eClass();

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        resSet.getResource(URI.createFileURI(filePath), true);

        // This is for loading proxy resources
        EcoreUtil.resolveAll(resSet);
        Optional<ocl.dm.DataModel> dataModelXMI = Optional.of(resSet)
            .map(ResourceSet::getResources)
            .map(resources -> resources.size() == 1 ? null : resources.get(1))
            .map(Resource::getContents)
            .map(contents -> (ocl.dm.DataModel) contents.get(0));

        return dataModelXMI.isPresent() ? DMParser.transform(dataModelXMI.get())
            : null;
    }

    private static Expression transform(ocl.exp.OclExpression oclXMI) {
        if (oclXMI instanceof ocl.exp.CallExp) {
            return transformCallExp((ocl.exp.CallExp) oclXMI);
        } else if (oclXMI instanceof ocl.exp.LiteralExp) {
            return transformLiteralExp((ocl.exp.LiteralExp) oclXMI);
        } else if (oclXMI instanceof ocl.exp.TypeExp) {
            return transformTypeExp((ocl.exp.TypeExp) oclXMI);
        } else {
            return transformVariableExp((ocl.exp.VariableExp) oclXMI);
        }
    }

    private static Expression transformVariableExp(ocl.exp.VariableExp oclXMI) {
        return new VariableExp(transformVariable(oclXMI.getReferredVariable()));
    }

    private static TypeExp transformTypeExp(ocl.exp.TypeExp oclXMI) {
        String referredType = ClassifierParser
            .transform(oclXMI.getReferredType());
        return new TypeExp(referredType);
    }

    private static CallExp transformCallExp(ocl.exp.CallExp oclXMI) {
        if (oclXMI instanceof ocl.exp.FeatureCallExp) {
            return transformFeatureCallExp((ocl.exp.FeatureCallExp) oclXMI);
        } else {
            return transformLoopExp((ocl.exp.LoopExp) oclXMI);
        }
    }

    private static LoopExp transformLoopExp(ocl.exp.LoopExp oclXMI) {
        if (oclXMI instanceof ocl.exp.IteratorExp) {
            return transformIteratorExp((ocl.exp.IteratorExp) oclXMI);
        } else {
            return null;
        }
    }

    private static LoopExp transformIteratorExp(ocl.exp.IteratorExp oclXMI) {
        return new IteratorExp(transform(oclXMI.getSource()),
            transform(oclXMI.getKind()),
            transformIterators(oclXMI.getIterator()),
            transform(oclXMI.getBody()));
    }

    private static Variable transformIterators(EList<ocl.exp.Variable> iterators) {
        // TODO For now, we only apply having one variable per iterator
        // For that reason, the input and output of this method is inconsistent.
        List<Variable> variables = new ArrayList<Variable>();
        for (ocl.exp.Variable iterator : iterators) {
            Variable variable = transformVariable(iterator);
            variables.add(variable);
        }
        return variables.get(0);
    }

    private static Expression transformIteratorSource(EObject eContainer) {
        if (eContainer instanceof ocl.exp.IteratorExp) {
            return transform(((ocl.exp.IteratorExp) eContainer).getSource());
        } else {
            // TODO: For now, we assume that iterator can only come out of
            // iteratorExp.
            return null;
        }
    }

    private static Variable transformVariable(ocl.exp.Variable eVariable) {
        return new Variable(eVariable.getName(),
            transformIteratorSource(eVariable.eContainer()));
    }

    private static String transform(ocl.exp.IteratorKind kind) {
        return kind.getLiteral();
    }
    
    private static FeatureCallExp transformFeatureCallExp(
    		ocl.exp.FeatureCallExp oclXMI) {
        if (oclXMI instanceof ocl.exp.NavigationCallExp) {
            return transformNavigationCallExp((ocl.exp.NavigationCallExp) oclXMI);
        } else {
            return transformOperationCallExp((ocl.exp.OperationCallExp) oclXMI);
        }
    }

    private static OperationCallExp transformOperationCallExp(
    		ocl.exp.OperationCallExp oclXMI) {
        return new OperationCallExp(transform(oclXMI.getSource()),
            transform(oclXMI.getReferredOperation()),
            transform(oclXMI.getArgument()));
    }

    private static Operation transform(ocl.exp.Operator referredOperation) {
        return new Operation(referredOperation.getLiteral());
    }

    private static List<Expression> transform(
        EList<ocl.exp.OclExpression> argumentsXMI) {
        return argumentsXMI.stream().map(OCLParser::transform)
            .collect(Collectors.toList());
    }

    private static NavigationCallExp transformNavigationCallExp(
    		ocl.exp.NavigationCallExp oclXMI) {
        if (oclXMI instanceof ocl.exp.AssociationClassCallExp) {
            return transformAssociationClassCallExp(
                (ocl.exp.AssociationClassCallExp) oclXMI);
        } else {
            return transformPropertyCallExp((ocl.exp.PropertyCallExp) oclXMI);
        }
    }

    private static PropertyCallExp transformPropertyCallExp(
    		ocl.exp.PropertyCallExp oclXMI) {
        PropertyCallExp propertyCallExp = new PropertyCallExp(
            transform(oclXMI.getSource()),
            oclXMI.getReferredProperty().getName());
        propertyCallExp
            .setType(new Type(oclXMI.getReferredProperty().getType()));
        return propertyCallExp;
    }

    private static AssociationClassCallExp transformAssociationClassCallExp(
    		ocl.exp.AssociationClassCallExp oclXMI) {
    	AssociationEnd referredAssociationEnd = oclXMI
            .getReferredAssociationEnds();
        AssociationClassCallExp associationClassCallExp = new M2MAssociationClassCallExp(
            transform(oclXMI.getSource()), referredAssociationEnd.getName());
        associationClassCallExp.setType(new Type("Col("
            .concat(referredAssociationEnd.getTarget().getName()).concat(")")));
        associationClassCallExp.setReferredAssociationEndType(
            new Type(referredAssociationEnd.getTarget().getName()));
        associationClassCallExp.setOppositeAssociationEnd(
            referredAssociationEnd.getOpp().getName());
        associationClassCallExp.setOppositeAssociationEndType(
            new Type(referredAssociationEnd.getOpp().getTarget().getName()));
//        associationClassCallExp.parseAssociationName();
        associationClassCallExp.setAssociation(oclXMI.getReferredAssociationEnds().getAssociation());
        return associationClassCallExp;
    }

    private static LiteralExp transformLiteralExp(ocl.exp.LiteralExp oclXMI) {
        if (oclXMI instanceof ocl.exp.PrimitiveType) {
            return transformPrimitiveTypeExp((ocl.exp.PrimitiveType) oclXMI);
        } else {
            // TODO: Implement other types later...
            return null;
        }
    }

    private static PrimitiveLiteralExp<?> transformPrimitiveTypeExp(
    		ocl.exp.PrimitiveType oclXMI) {
        if (oclXMI instanceof ocl.exp.BooleanLiteralExp) {
            return transformBooleanLiteralExp((ocl.exp.BooleanLiteralExp) oclXMI);
        } else if (oclXMI instanceof ocl.exp.NumericLiteralExp) {
            return transformNumericLiteralExp((ocl.exp.NumericLiteralExp) oclXMI);
        } else {
            return transformStringLiteralExp((ocl.exp.StringLiteralExp) oclXMI);
        }
    }

    private static NumericLiteralExp<?> transformNumericLiteralExp(
    		ocl.exp.NumericLiteralExp oclXMI) {
        if (oclXMI instanceof ocl.exp.IntegerLiteralExp) {
            return transformIntegerLiteralExp((ocl.exp.IntegerLiteralExp) oclXMI);
        } else {
            // TODO: Implement other types later...
            return null;
        }
    }

    private static IntegerLiteralExp transformIntegerLiteralExp(
    		ocl.exp.IntegerLiteralExp oclXMI) {
        return new IntegerLiteralExp(oclXMI.getIntegerValue());
    }

    private static StringLiteralExp transformStringLiteralExp(
    		ocl.exp.StringLiteralExp oclXMI) {
        return new StringLiteralExp(oclXMI.getStringValue());
    }

    private static BooleanLiteralExp transformBooleanLiteralExp(
    		ocl.exp.BooleanLiteralExp oclXMI) {
        return new BooleanLiteralExp(oclXMI.getBooleanValue());
    }

    private static ocl.exp.OclExpression extractEOclExp(String filePath) {
        // Initialize the model
        ExpPackage.eINSTANCE.eClass();

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI.createFileURI(filePath),
            true);

        // This is for loading proxy resources
        EcoreUtil.resolveAll(resSet);

        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        return (ocl.exp.OclExpression) resource.getContents().get(0);
    }
}
