package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List result = new ArrayList();
        for(String string1:collection1){
            for(List<String> childList:collection2){
                for(String string2:childList){
                    if (string1.equals(string2)) {
                        result.add(string1);
                    }
                }
            }
        }
        return result;
    }
}
