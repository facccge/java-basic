package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List result = new ArrayList();
        for(String string1:collection1){
            for (List<String> valueList : collection2.values()) {
                for(String string2:valueList){
                    if(string1.equals(string2)){
                        result.add(string1);
                    }
                }
            }
        }
        return result;
    }
}
