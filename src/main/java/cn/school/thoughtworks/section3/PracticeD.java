package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        HashMap<String, Integer> collection3 = new HashMap<>();
        for (String string : collectionA) {
            String key;
            int quality;
            if (string.contains("-")) {
                int startIndex = string.indexOf("-") + 1;
                key = string.charAt(0) + "";
                quality = Integer.parseInt(string.substring(startIndex, string.length()) + "");
            } else {
                key = string;
                quality = 1;
            }
            if (collection3.containsKey(key)) {
                collection3.put(key, collection3.get(key) + quality);
            } else {
                collection3.put(key, quality);
            }
        }
        String valueProp = "value";
        for (String key : object.get(valueProp)) {
            if (collection3.containsKey(key)) {
                int count = collection3.get(key);
                int newCount = count - count / 3;
                collection3.put(key, newCount);
            }
        }
        return collection3;
    }
}
