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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.vgu.dm2schema.dm.Attribute;
import org.vgu.dm2schema.dm.DataModel;
import org.vgu.dm2schema.dm.End;
import org.vgu.dm2schema.dm.Entity;
import org.vgu.dm2schema.dm.Multiplicity;
import org.vgu.se.ocl.dm.DMFactory;
import org.vgu.se.ocl.dm.EAssociationEnd;
import org.vgu.se.ocl.dm.EAttribute;
import org.vgu.se.ocl.dm.EDataModel;
import org.vgu.se.ocl.dm.EEntity;
import org.vgu.se.ocl.dm.EMultiplicity;

public class J2XMI {
    private static DMFactory factory = DMFactory.eINSTANCE;

    public static EDataModel transform(DataModel dataModel) {
        EDataModel dataModelXMI = factory.createEDataModel();
        if (dataModel == null)
            return null;
        dataModelXMI.getClasses()
            .addAll(transformEntities(dataModel.getEntities()));
        linkAssociationEnds(dataModelXMI);
        return dataModelXMI;
    }

    private static void linkAssociationEnds(EDataModel dataModelXMI) {
        List<EEntity> entitiesXMI = dataModelXMI.getClasses();
        for (EEntity entityXMI : entitiesXMI) {
            if (entityXMI.getEnds() == null && entityXMI.getEnds().isEmpty()) {
                continue;
            }
            List<EAssociationEnd> endsXMI = entityXMI.getEnds();
            for (EAssociationEnd endXMI : endsXMI) {
                if (endXMI.getOpp() != null && endXMI.getTarget() != null) {
                    continue;
                } else {
                    linkAssociationEnd(endXMI, entityXMI, entitiesXMI);
                    break;
                }
            }
        }
    }

    private static void linkAssociationEnd(EAssociationEnd endXMI,
        EEntity entityXMI, List<EEntity> entitiesXMI) {
        for (EEntity otherEntityXMI : entitiesXMI) {
            if (otherEntityXMI.getEnds() == null && otherEntityXMI.getEnds().isEmpty()) {
                continue;
            }
            List<EAssociationEnd> endsXMI = otherEntityXMI.getEnds();
            for (EAssociationEnd otherEndXMI : endsXMI) {
                if (otherEndXMI == endXMI) {
                    continue;
                }
                else if (otherEndXMI.getTarget() != null) {
                    continue;
                }
                else if (otherEndXMI.getOpp().getName().equals(endXMI.getName())){
                    endXMI.setOpp(otherEndXMI);
                    endXMI.setTarget(otherEntityXMI);
                    otherEndXMI.setOpp(endXMI);
                    otherEndXMI.setTarget(entityXMI);
                    break;
                }
            }
        }
    }

    private static List<EEntity> transformEntities(
        Map<String, Entity> entities) {
        List<EEntity> entitiesXMI = new ArrayList<EEntity>();
        if (entities != null) {
            for (Entity entity : entities.values()) {
                EEntity entityXMI = transformEntity(entity);
                entitiesXMI.add(entityXMI);
            }
        }
        return entitiesXMI;
    }

    private static EEntity transformEntity(Entity entity) {
        if (entity == null)
            return null;
        EEntity entityXMI = factory.createEEntity();
        entityXMI.setName(entity.getName());
        entityXMI.getAttributes()
            .addAll(transformAttributes(entity.getAttributes()));
        entityXMI.getEnds().addAll(transformEnds(entity.getEnds()));
        return entityXMI;
    }

    private static List<EAssociationEnd> transformEnds(Set<End> ends) {
        List<EAssociationEnd> endsXMI = new ArrayList<EAssociationEnd>();
        if (ends != null) {
            for (End end : ends) {
                EAssociationEnd endXMI = transformEnd(end);
                endsXMI.add(endXMI);
            }
        }
        return endsXMI;
    }

    private static EAssociationEnd transformEnd(End end) {
        if (end == null)
            return null;
        EAssociationEnd endXMI = factory.createEAssociationEnd();
        endXMI.setMult(transformMultiplicity(end.getMult()));
        endXMI.setName(end.getName());
        endXMI.setOpp(createDummyAssociationEnd(end.getOpp()));
        return endXMI;
    }

    private static EAssociationEnd createDummyAssociationEnd(String opp) {
        EAssociationEnd endXMI = factory.createEAssociationEnd();
        endXMI.setName(opp);
        return endXMI;
    }

    private static EMultiplicity transformMultiplicity(Multiplicity mult) {
        if (mult == null)
            return null;
        if (mult == Multiplicity.MANY)
            return EMultiplicity.MANY;
        else
            return EMultiplicity.ONE;
    }

    private static List<EAttribute> transformAttributes(
        Set<Attribute> attributes) {
        List<EAttribute> attributesXMI = new ArrayList<EAttribute>();
        if (attributes != null) {
            for (Attribute attribute : attributes) {
                EAttribute attributeXMI = transformAttribute(attribute);
                attributesXMI.add(attributeXMI);
            }
        }
        return attributesXMI;
    }

    private static EAttribute transformAttribute(Attribute attribute) {
        if (attribute == null)
            return null;
        EAttribute attributeXMI = factory.createEAttribute();
        attributeXMI.setName(attribute.getName());
        attributeXMI.setType(attribute.getType());
        return attributeXMI;
    }
}
