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

package org.vgu.se.ocl.test;

import java.util.Arrays;
import java.util.List;

import org.vgu.se.ocl.parser.OCLParser;

import com.vgu.se.jocl.expressions.Expression;

public class ApplicationTest {

    public static void main(String[] args) {
        List<String> filePaths = Arrays.asList(
            "C:\\Users\\ngpbh\\eclipse-modelling-workspace\\OCLmt\\model\\Stage0Challenge0.xmi"
//        	,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase0Challenge2.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase0Challenge3.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase1Challenge1.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase1Challenge2.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase1Challenge3.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase2Challenge1.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase3Challenge1.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase4Challenge1.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase4Challenge2.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase4Challenge3.xmi"
            ,"C:\\Users\\ngpbh\\eclipse-modelling-workspace\\OCLmt\\model\\Stage5Challenge1.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase5Challenge2.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase6Challenge1.xmi"
//            ,"C:\\Users\\ngpbh\\eclipse-workspace\\org.vgu.se.ocl\\model\\Phase6Challenge2.xmi"
            );
        for (String filePath : filePaths) {
            Expression exp = OCLParser.convertToExp(filePath);
            System.out.println(exp);
        }
    }
}
