package org.vgu.se.ocl.dm.parser;

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
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.vgu.dm2schema.dm.Attribute;
import org.vgu.dm2schema.dm.DataModel;
import org.vgu.dm2schema.dm.End;
import org.vgu.dm2schema.dm.Entity;
import org.vgu.dm2schema.dm.Multiplicity;
import org.vgu.se.ocl.dm.DMPackage;
import org.vgu.se.ocl.dm.EAssociationEnd;
import org.vgu.se.ocl.dm.EDataModel;
import org.vgu.se.ocl.dm.EEntity;

public class DMParser {
    public static DataModel convertToDataModel(String filePath) {
        EDataModel dataModelXMI = extractEDataModel(filePath);
        DataModel dataModelJSON = transform(dataModelXMI);
        return dataModelJSON;
    }

    public static DataModel transform(EDataModel dataModelXMI) {
        DataModel dataModel = new DataModel();

        Map<String, Entity> entitiesJSON = dataModel.getEntities();

        for (EEntity entityXMI : dataModelXMI.getClasses()) {
            Entity entityJSON = transformEntity(entityXMI);
            entitiesJSON.put(entityXMI.getName(), entityJSON);
        }

        dataModel.formAssociations();
        return dataModel;

    }

    private static Entity transformEntity(EEntity entityXMI) {
        Entity entityJSON = new Entity();
        entityJSON.setClazz(entityXMI.getName());
        transformAttribute(entityXMI, entityJSON);
        transformAssociationEnds(entityXMI, entityJSON);
        return entityJSON;
    }

    private static void transformAssociationEnds(EEntity entityXMI,
        Entity entityJSON) {
        Set<End> endsJSON = entityJSON.getEnds();
        for (EAssociationEnd endXMI : entityXMI.getEnds()) {
            End endJSON = new End();
            endJSON.setName(endXMI.getName());
            endJSON.setCurrentClass(entityXMI.getName());
            endJSON.setTargetClass(endXMI.getTarget().getName());
            endJSON.setOpp(endXMI.getOpp().getName());
            endJSON.setMult(endXMI.getMult().getName().equalsIgnoreCase("ONE")
                ? Multiplicity.ONE
                : Multiplicity.MANY);
            endsJSON.add(endJSON);
        }
    }

    private static void transformAttribute(EEntity entityXMI,
        Entity entityJSON) {
        Set<Attribute> attributesJSON = entityJSON.getAttributes();
        for (org.vgu.se.ocl.dm.EAttribute attributeXMI : entityXMI
            .getAttributes()) {
            Attribute attributeJSON = new Attribute();
            attributeJSON.setName(attributeXMI.getName());
            attributeJSON.setType(attributeXMI.getType());
            attributesJSON.add(attributeJSON);
        }
    }

    private static EDataModel extractEDataModel(String filePath) {
        // Initialize the model
        DMPackage.eINSTANCE.eClass();

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI.createFileURI(filePath),
            true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        return (EDataModel) resource.getContents().get(0);
    }

}
