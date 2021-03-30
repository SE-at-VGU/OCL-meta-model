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


package org.vgu.se.ocl.dm.parser;

import java.util.Map;
import java.util.Set;

import org.vgu.dm2schema.dm.Attribute;
import org.vgu.dm2schema.dm.DataModel;
import org.vgu.dm2schema.dm.End;
import org.vgu.dm2schema.dm.Entity;
import org.vgu.dm2schema.dm.Multiplicity;

public class XMI2J {

    public static DataModel transform(ocl.dm.DataModel dataModelXMI) {
        DataModel dataModel = new DataModel();

        Map<String, Entity> entitiesJSON = dataModel.getEntities();

        for (ocl.dm.Entity entityXMI : dataModelXMI.getClasses()) {
            Entity entityJSON = transformEntity(entityXMI);
            entitiesJSON.put(entityXMI.getName(), entityJSON);
        }

        dataModel.formAssociations();
        return dataModel;
    }
    

    private static Entity transformEntity(ocl.dm.Entity entityXMI) {
        Entity entityJSON = new Entity();
        entityJSON.setClazz(entityXMI.getName());
        transformAttribute(entityXMI, entityJSON);
        transformAssociationEnds(entityXMI, entityJSON);
        return entityJSON;
    }

    private static void transformAssociationEnds(ocl.dm.Entity entityXMI,
        Entity entityJSON) {
        Set<End> endsJSON = entityJSON.getEnds();
        for (ocl.dm.AssociationEnd endXMI : entityXMI.getEnds()) {
            End endJSON = new End();
            endJSON.setAssociation(endXMI.getAssociation());
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

    private static void transformAttribute(ocl.dm.Entity entityXMI,
        Entity entityJSON) {
        Set<Attribute> attributesJSON = entityJSON.getAttributes();
        for (ocl.dm.Attribute attributeXMI : entityXMI
            .getAttributes()) {
            Attribute attributeJSON = new Attribute();
            attributeJSON.setName(attributeXMI.getName());
            attributeJSON.setType(attributeXMI.getType());
            attributesJSON.add(attributeJSON);
        }
    }


}
