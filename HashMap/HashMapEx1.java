package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
    public static void main(String[] args) {

        /*HashMap is a class that implements the Map interface,
         which is part of the Java Collections Framework.
         It is used to store key-value pairs, and it allows you to associate a value with a unique key.
          Here's a basic overview of how to use HashMap in Java:
         */
        HashMap<String ,Integer> hm = new HashMap<>();
        //add to the value pair
        hm.put("rvai",10001);
        hm.put("rvaindra",10002);
        hm.put("shashi",10003);
        hm.put("Azad",10004);
        hm.put("Azad",10005);//update the Azad key
        System.out.println(hm);
        hm.remove("Azad"); //remove the Azad key
        System.out.println(hm);


        for(Map.Entry<String,Integer> onj:hm.entrySet()){
            System.out.println(onj.getKey()+"  "+onj.getValue());
        }


        System.out.println("******************************");


        Set<String> s = hm.keySet();
        for (String key:s){
            System.out.println(key+" "+ hm.get(key));
        }



        System.out.println("*****************************");
         for(Map.Entry<String ,Integer> str:hm.entrySet()){
         System.out.println(str.getKey());
     }
    }
}
