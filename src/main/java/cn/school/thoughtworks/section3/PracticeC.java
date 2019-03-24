package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        HashMap<String, Integer> collection3 = new HashMap<>();
        for(String key:collectionA){
            if(collection3.containsKey(key)){
                collection3.put(key, collection3.get(key) + 1);
            }else{
                collection3.put(key, 1);
            }
        }
        Map result = collection3;
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
