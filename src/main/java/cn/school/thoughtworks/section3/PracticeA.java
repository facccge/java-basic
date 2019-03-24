package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        Map<String, Integer> result = collectionA;
        String valueProp = "value";
        for (String key : object.get(valueProp)) {
            if (result.containsKey(key)) {
                result.put(key, result.get(key) - 1);
            }
        }
        return result;
    }
}
