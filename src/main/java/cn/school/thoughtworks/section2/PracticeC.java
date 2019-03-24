package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map result = new HashMap<String, Integer>(1);
        for (String string : collection1) {
            String key = "";
            int quality = 0;
            if (string.contains("-")) {
                int startIndex = string.indexOf("-") + 1;
                key = string.charAt(0) + "";
                quality = Integer.parseInt(string.substring(startIndex, string.length()) + "");
            } else if (string.contains("[")) {
                int startIndex = string.indexOf("[") + 1;
                int endIndex = string.indexOf("]");
                key = string.charAt(0) + "";
                quality = Integer.parseInt(string.substring(startIndex, endIndex) + "");
            } else if (string.contains(":")) {
                int qualityIndex = string.indexOf(":") + 1;
                key = string.charAt(0) + "";
                quality = Integer.parseInt(string.substring(qualityIndex, string.length()) + "");
            } else {
                key = string;
                quality = 1;
            }
            if (result.containsKey(key)) {
                result.put(key, (Integer) (result.get(key)) + quality);
            } else {
                result.put(key, quality);
            }
        }
        return result;
    }
}
