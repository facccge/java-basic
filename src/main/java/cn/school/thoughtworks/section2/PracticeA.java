package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap(1);
        for (String string : collection1) {
            if (result.containsKey(string)) {
                result.put(string, result.get(string) + 1);
            } else {
                result.put(string, 1);
            }
        }
        return result;
    }
}
