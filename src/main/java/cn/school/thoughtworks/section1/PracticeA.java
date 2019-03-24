package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List result = new ArrayList<String>();
        for(String string1:collection1){
            for(String string2:collection2){
                if(string1.equals(string2)){
                    result.add(string1);
                }
            }
        }
        return result;
    }
}
