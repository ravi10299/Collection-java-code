package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx2 {
    public static void main(String[] args) {

        //linked hash map is the maintain the insertion order
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(111,"ravi1");//1
        lhm.put(112,"ravi2");//2
        lhm.put(113,"ravi3");//3
        lhm.put(114,"ravi4");//4
        lhm.put(115,"ravi5");//5
        lhm.put(110,"ravi6");//6
        lhm.put(null,null);//7
        lhm.put(null,null);//8
        lhm.put(null,"ravi8");//9
        System.out.println(lhm);
        for (Map.Entry<Integer,String> obj :lhm.entrySet()){
            System.out.println(obj.getKey()+"   "+obj.getValue());
        }
        System.out.println("**********************");
        System.out.println("by using lambda enterprise ");
        lhm.forEach((k,v) ->System.out.println(k+ "     "+v));

    }
}
