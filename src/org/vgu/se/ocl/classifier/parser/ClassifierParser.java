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


package org.vgu.se.ocl.classifier.parser;

public class ClassifierParser {

    public static String transform(ocl.type.Classifier referredType) {
        if(referredType instanceof ocl.dm.Entity) {
            return transformEntity((ocl.dm.Entity) referredType);
        }
        else {
            //TODO: Implement for other classifiers
            return null;
        }
    }

    private static String transformEntity(ocl.dm.Entity referredType) {
        return referredType.getName();
    }
}
