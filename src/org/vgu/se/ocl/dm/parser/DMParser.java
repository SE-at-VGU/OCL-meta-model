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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.vgu.dm2schema.dm.DataModel;
import org.vgu.se.ocl.dm.DMPackage;
import org.vgu.se.ocl.dm.EDataModel;

public class DMParser {
    public static DataModel convertToDataModel(String filePath) {
        EDataModel dataModelXMI = extractEDataModel(filePath);
        DataModel dataModelJSON = transform(dataModelXMI);
        return dataModelJSON;
    }

    public static DataModel transform(EDataModel dataModelXMI) {
        return XMI2J.transform(dataModelXMI);
    }
    
    public static EDataModel transform(DataModel dataModel) {
        return J2XMI.transform(dataModel);
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
