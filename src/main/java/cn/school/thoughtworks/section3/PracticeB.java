package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map result = collectionA;
        String valueProp = "value";
        for(String key:object.get(valueProp)){
            if(result.containsKey(key)){
                int count = (Integer)(result.get(key));
                int newCount = count - count/3;
                result.put(key,newCount);
            }
        }
        return result;
    }
}
