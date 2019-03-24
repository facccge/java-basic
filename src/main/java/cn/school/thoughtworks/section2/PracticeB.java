package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map result = new HashMap<String,Integer>(1);
        for(String string:collection1){
            String key="";
            int quality=0;
            if(string.length()==1){
                key = string;
                quality =1;
            }else{
                key = string.charAt(0)+"";
                quality = Integer.parseInt(string.charAt(2)+"");
            }
            if(result.containsKey(key)){
                result.put(key,(Integer)(result.get(key))+quality);
            }else{
                result.put(key,quality);
            }
        }
        return result;
    }
}
