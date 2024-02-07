package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();
        map.put("india",101);
        map.put("rassia",105);
        map.put("usa",106);
        map.put("dubai",108);
        map.put("australia",110);
        System.out.println(map);


        for(Map.Entry<String,Integer> map1:map.entrySet()){
            System.out.println(map1.getKey()+"  "+ map1.getValue());

        }


    }
}
