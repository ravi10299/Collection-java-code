import java.util.LinkedHashMap;

public class LinkedhashMapEx2{
    public static void main(String[] args) {
        // Check the initial capacity of the list.
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(11);
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        System.out.println("Size: " + map.size());
        
        System.out.println("print the map using lambda expression");
        map.forEach((k,v)-> System.out.println(k + " : " + v));

        
    }
}