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
import org.vgu.se.ocl.dm.EDataModel;
import org.vgu.se.ocl.dm.parser.DMParser;
import org.vgu.se.ocl.exp.EAssociationClassCallExp;
import org.vgu.se.ocl.exp.EBooleanLiteralExp;
import org.vgu.se.ocl.exp.ECallExp;
import org.vgu.se.ocl.exp.EFeatureCallExp;
import org.vgu.se.ocl.exp.EIfExp;
import org.vgu.se.ocl.exp.EIntegerLiteralExp;
import org.vgu.se.ocl.exp.EIterateExp;
import org.vgu.se.ocl.exp.EIteratorExp;
import org.vgu.se.ocl.exp.EIteratorKind;
import org.vgu.se.ocl.exp.ELiteralExp;
import org.vgu.se.ocl.exp.ELoopExp;
import org.vgu.se.ocl.exp.EMessageExp;
import org.vgu.se.ocl.exp.ENavigationCallExp;
import org.vgu.se.ocl.exp.ENumericLiteralExp;
import org.vgu.se.ocl.exp.EOclExpression;
import org.vgu.se.ocl.exp.EOperationCallExp;
import org.vgu.se.ocl.exp.EOperator;
import org.vgu.se.ocl.exp.EPrimitiveType;
import org.vgu.se.ocl.exp.EPropertyCallExp;
import org.vgu.se.ocl.exp.EStateExp;
import org.vgu.se.ocl.exp.EStringLiteralExp;
import org.vgu.se.ocl.exp.ETypeExp;
import org.vgu.se.ocl.exp.EVariable;
import org.vgu.se.ocl.exp.EVariableExp;
import org.vgu.se.ocl.exp.EXPPackage;

import com.vgu.se.jocl.expressions.AssociationClassCallExp;
import com.vgu.se.jocl.expressions.BooleanLiteralExp;
import com.vgu.se.jocl.expressions.CallExp;
import com.vgu.se.jocl.expressions.Expression;
import com.vgu.se.jocl.expressions.FeatureCallExp;
import com.vgu.se.jocl.expressions.IntegerLiteralExp;
import com.vgu.se.jocl.expressions.IteratorExp;
import com.vgu.se.jocl.expressions.LiteralExp;
import com.vgu.se.jocl.expressions.LoopExp;
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

public class OCLParser {
    public static Expression convertToExp(String filePath) {
        EOclExpression oclExpXMI = extractEOclExp(filePath);
        Expression oclExpJSON = transform(oclExpXMI);
        return oclExpJSON;
    }

    public static DataModel extractDataModel(String filePath) {
        // Initialize the model
        EXPPackage.eINSTANCE.eClass();

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        resSet.getResource(URI.createFileURI(filePath), true);

        // This is for loading proxy resources
        EcoreUtil.resolveAll(resSet);
        return DMParser.transform((EDataModel) resSet.getResources().get(1).getContents().get(0));
    }

    private static Expression transform(EOclExpression oclXMI) {
        if (oclXMI instanceof ECallExp) {
            return transformCallExp((ECallExp) oclXMI);
        } else if (oclXMI instanceof EIfExp) {
            // TODO: Implement other types later...
            return null;
        } else if (oclXMI instanceof ELiteralExp) {
            return transformLiteralExp((ELiteralExp) oclXMI);
        } else if (oclXMI instanceof EMessageExp) {
            // TODO: Implement other types later...
            return null;
        } else if (oclXMI instanceof EStateExp) {
            // TODO: Implement other types later...
            return null;
        } else if (oclXMI instanceof ETypeExp) {
            return transformTypeExp((ETypeExp) oclXMI);
        } else {
            return transformVariableExp((EVariableExp) oclXMI);
        }
    }

    private static Expression transformVariableExp(EVariableExp oclXMI) {
        return new VariableExp(transformVariable(oclXMI.getReferredVariable()));
    }

    private static TypeExp transformTypeExp(ETypeExp oclXMI) {
        String referredType = ClassifierParser
            .transform(oclXMI.getReferredType());
        return new TypeExp(referredType);
    }

    private static CallExp transformCallExp(ECallExp oclXMI) {
        if (oclXMI instanceof EFeatureCallExp) {
            return transformFeatureCallExp((EFeatureCallExp) oclXMI);
        } else {
            return transformLoopExp((ELoopExp) oclXMI);
        }
    }

    private static LoopExp transformLoopExp(ELoopExp oclXMI) {
        if (oclXMI instanceof EIteratorExp) {
            return transformIteratorExp((EIteratorExp) oclXMI);
        } else {
            return transformIterateExp((EIterateExp) oclXMI);
        }
    }

    private static LoopExp transformIteratorExp(EIteratorExp oclXMI) {
        return new IteratorExp(transform(oclXMI.getSource()),
            transform(oclXMI.getKind()),
            transformIterators(oclXMI.getIterator()),
            transform(oclXMI.getBody()));
    }

    private static Variable transformIterators(EList<EVariable> iterators) {
        // TODO For now, we only apply having one variable per iterator
        // For that reason, the input and output of this method is inconsistent.
        List<Variable> variables = new ArrayList<Variable>();
        for (EVariable iterator : iterators) {
            Variable variable = transformVariable(iterator);
            variables.add(variable);
        }
        return variables.get(0);
    }

    private static Expression transformIteratorSource(EObject eContainer) {
        if (eContainer instanceof EIteratorExp) {
            return transform(((EIteratorExp) eContainer).getSource());
        } else {
            // TODO: For now, we assume that iterator can only come out of
            // iteratorExp.
            return null;
        }
    }

    private static Variable transformVariable(EVariable eVariable) {
        Variable variable = new Variable(eVariable.getName(), null);
        variable.setSource(transformIteratorSource(eVariable.eContainer()));
        return variable;
    }

    private static String transform(EIteratorKind kind) {
        return kind.getLiteral();
    }

    private static LoopExp transformIterateExp(EIterateExp oclXMI) {
        // TODO Auto-generated method stub
        return null;
    }

    private static FeatureCallExp transformFeatureCallExp(
        EFeatureCallExp oclXMI) {
        if (oclXMI instanceof ENavigationCallExp) {
            return transformNavigationCallExp((ENavigationCallExp) oclXMI);
        } else {
            return transformOperationCallExp((EOperationCallExp) oclXMI);
        }
    }

    private static OperationCallExp transformOperationCallExp(
        EOperationCallExp oclXMI) {
        return new OperationCallExp(transform(oclXMI.getSource()),
            transform(oclXMI.getReferredOperation()),
            transform(oclXMI.getArgument()));
    }

    private static Operation transform(EOperator referredOperation) {
        return new Operation(referredOperation.getLiteral());
    }

    private static List<Expression> transform(
        EList<EOclExpression> argumentsXMI) {
        return argumentsXMI.stream().map(OCLParser::transform)
            .collect(Collectors.toList());
    }

    private static NavigationCallExp transformNavigationCallExp(
        ENavigationCallExp oclXMI) {
        if (oclXMI instanceof EAssociationClassCallExp) {
            return transformAssociationClassCallExp(
                (EAssociationClassCallExp) oclXMI);
        } else {
            return transformPropertyCallExp((EPropertyCallExp) oclXMI);
        }
    }

    private static PropertyCallExp transformPropertyCallExp(
        EPropertyCallExp oclXMI) {
        // TODO Auto-generated method stub
        return new PropertyCallExp(transform(oclXMI.getSource()),
            oclXMI.getReferredProperty().getName());
    }

    private static AssociationClassCallExp transformAssociationClassCallExp(
        EAssociationClassCallExp oclXMI) {
        return new AssociationClassCallExp(transform(oclXMI.getSource()),
            oclXMI.getReferredAssociationEnds().getName());
    }

    private static LiteralExp transformLiteralExp(ELiteralExp oclXMI) {
        if (oclXMI instanceof EPrimitiveType) {
            return transformPrimitiveTypeExp((EPrimitiveType) oclXMI);
        } else {
            // TODO: Implement other types later...
            return null;
        }
    }

    private static PrimitiveLiteralExp<?> transformPrimitiveTypeExp(
        EPrimitiveType oclXMI) {
        if (oclXMI instanceof EBooleanLiteralExp) {
            return transformBooleanLiteralExp((EBooleanLiteralExp) oclXMI);
        } else if (oclXMI instanceof ENumericLiteralExp) {
            return transformNumericLiteralExp((ENumericLiteralExp) oclXMI);
        } else {
            return transformStringLiteralExp((EStringLiteralExp) oclXMI);
        }
    }

    private static NumericLiteralExp<?> transformNumericLiteralExp(
        ENumericLiteralExp oclXMI) {
        if (oclXMI instanceof EIntegerLiteralExp) {
            return transformIntegerLiteralExp((EIntegerLiteralExp) oclXMI);
        } else {
            // TODO: Implement other types later...
            return null;
        }
    }

    private static IntegerLiteralExp transformIntegerLiteralExp(
        EIntegerLiteralExp oclXMI) {
        return new IntegerLiteralExp(oclXMI.getIntegerValue());
    }

    private static StringLiteralExp transformStringLiteralExp(
        EStringLiteralExp oclXMI) {
        return new StringLiteralExp(oclXMI.getStringValue());
    }

    private static BooleanLiteralExp transformBooleanLiteralExp(
        EBooleanLiteralExp oclXMI) {
        return new BooleanLiteralExp(oclXMI.getBooleanValue());
    }

    private static EOclExpression extractEOclExp(String filePath) {
        // Initialize the model
        EXPPackage.eINSTANCE.eClass();

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
        return (EOclExpression) resource.getContents().get(0);
    }
}
