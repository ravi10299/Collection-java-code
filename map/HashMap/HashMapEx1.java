import java.util.HashMap;
import java.util.Map;

public class HashMapEx1{
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("name","ravi");
        map.put("adddress", "varanasi");
        map.put("country", "india");
        map.put("company", "indsol sortware private limited");

        System.out.println("name : "+map.get("name"));
        System.out.println("adddress : "+ map.get("adddress"));
        System.out.println("country : "+ map.get("country"));
        System.out.println("company : "+map.get("company"));


       System.out.println(map);



       for(Map.Entry<String , String > entry : map.entrySet()){
        System.out.println(entry.getKey() + "  = " + entry.getValue());
       }



       }


}