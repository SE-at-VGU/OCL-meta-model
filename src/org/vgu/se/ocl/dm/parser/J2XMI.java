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

import ocl.dm.DmFactory;

public class J2XMI {
    private static DmFactory factory = DmFactory.eINSTANCE;

    public static ocl.dm.DataModel transform(DataModel dataModel) {
    	ocl.dm.DataModel dataModelXMI = factory.createDataModel();
        if (dataModel == null)
            return null;
        dataModelXMI.getClasses()
            .addAll(transformEntities(dataModel.getEntities()));
        linkAssociationEnds(dataModelXMI);
        return dataModelXMI;
    }

    private static void linkAssociationEnds(ocl.dm.DataModel dataModelXMI) {
        List<ocl.dm.Entity> entitiesXMI = dataModelXMI.getClasses();
        for (ocl.dm.Entity entityXMI : entitiesXMI) {
            if (entityXMI.getEnds() == null && entityXMI.getEnds().isEmpty()) {
                continue;
            }
            List<ocl.dm.AssociationEnd> endsXMI = entityXMI.getEnds();
            for (ocl.dm.AssociationEnd endXMI : endsXMI) {
                if (endXMI.getOpp() != null && endXMI.getTarget() != null) {
                    continue;
                } else {
                    linkAssociationEnd(endXMI, entityXMI, entitiesXMI);
                    break;
                }
            }
        }
    }

    private static void linkAssociationEnd(ocl.dm.AssociationEnd endXMI,
    		ocl.dm.Entity entityXMI, List<ocl.dm.Entity> entitiesXMI) {
        for (ocl.dm.Entity otherEntityXMI : entitiesXMI) {
            if (otherEntityXMI.getEnds() == null && otherEntityXMI.getEnds().isEmpty()) {
                continue;
            }
            List<ocl.dm.AssociationEnd> endsXMI = otherEntityXMI.getEnds();
            for (ocl.dm.AssociationEnd otherEndXMI : endsXMI) {
                if (otherEndXMI == endXMI) {
                    continue;
                }
                else if (otherEndXMI.getTarget() != null) {
                    continue;
                }
                else if (otherEndXMI.getOpp().getName().equals(endXMI.getName())){
                	endXMI.setAssociation(otherEndXMI.getAssociation());
                    endXMI.setOpp(otherEndXMI);
                    endXMI.setTarget(otherEntityXMI);
                    otherEndXMI.setOpp(endXMI);
                    otherEndXMI.setTarget(entityXMI);
                    break;
                }
            }
        }
    }

    private static List<ocl.dm.Entity> transformEntities(
        Map<String, Entity> entities) {
        List<ocl.dm.Entity> entitiesXMI = new ArrayList<ocl.dm.Entity>();
        if (entities != null) {
            for (Entity entity : entities.values()) {
            	ocl.dm.Entity entityXMI = transformEntity(entity);
                entitiesXMI.add(entityXMI);
            }
        }
        return entitiesXMI;
    }

    private static ocl.dm.Entity transformEntity(Entity entity) {
        if (entity == null)
            return null;
        ocl.dm.Entity entityXMI = factory.createEntity();
        entityXMI.setName(entity.getName());
        entityXMI.getAttributes()
            .addAll(transformAttributes(entity.getAttributes()));
        entityXMI.getEnds().addAll(transformEnds(entity.getEnds()));
        return entityXMI;
    }

    private static List<ocl.dm.AssociationEnd> transformEnds(Set<End> ends) {
        List<ocl.dm.AssociationEnd> endsXMI = new ArrayList<ocl.dm.AssociationEnd>();
        if (ends != null) {
            for (End end : ends) {
            	ocl.dm.AssociationEnd endXMI = transformEnd(end);
                endsXMI.add(endXMI);
            }
        }
        return endsXMI;
    }

    private static ocl.dm.AssociationEnd transformEnd(End end) {
        if (end == null)
            return null;
        ocl.dm.AssociationEnd endXMI = factory.createAssociationEnd();
        endXMI.setAssociation(end.getAssociation());
        endXMI.setMult(transformMultiplicity(end.getMult()));
        endXMI.setName(end.getName());
        endXMI.setOpp(createDummyAssociationEnd(end.getOpp()));
        return endXMI;
    }

    private static ocl.dm.AssociationEnd createDummyAssociationEnd(String opp) {
    	ocl.dm.AssociationEnd endXMI = factory.createAssociationEnd();
        endXMI.setName(opp);
        return endXMI;
    }

    private static ocl.dm.Multiplicity transformMultiplicity(Multiplicity mult) {
        if (mult == null)
            return null;
        if (mult == Multiplicity.MANY)
            return ocl.dm.Multiplicity.MANY;
        else
            return ocl.dm.Multiplicity.ONE;
    }

    private static List<ocl.dm.Attribute> transformAttributes(
        Set<Attribute> attributes) {
        List<ocl.dm.Attribute> attributesXMI = new ArrayList<ocl.dm.Attribute>();
        if (attributes != null) {
            for (Attribute attribute : attributes) {
            	ocl.dm.Attribute attributeXMI = transformAttribute(attribute);
                attributesXMI.add(attributeXMI);
            }
        }
        return attributesXMI;
    }

    private static ocl.dm.Attribute transformAttribute(Attribute attribute) {
        if (attribute == null)
            return null;
        ocl.dm.Attribute attributeXMI = factory.createAttribute();
        attributeXMI.setName(attribute.getName());
        attributeXMI.setType(attribute.getType());
        return attributeXMI;
    }
}
