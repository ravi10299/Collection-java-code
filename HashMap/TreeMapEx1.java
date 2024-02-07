package HashMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm  =new TreeMap<>();
        tm.put(2001,"java");
        tm.put(2005,"C++");
        tm.put(2003,"C");
        tm.put(2004,"python");
        tm.put(2004,"python");
 //       tm.put(null,null);
//        tm.put(null,"ravi");
        System.out.println(tm);

        for (Map.Entry<Integer,String> tm1:tm.entrySet()){
            System.out.println(tm1.getKey()+"  "+tm1.getValue());
        }
    }
}
