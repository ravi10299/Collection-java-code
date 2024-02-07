package CollectionsNotes;

import java.util.*;


public class ListSetMapEx1 {
    public static void main(String[] args) {

        //List: An ordered collection that allows duplicate elements (e.g., ArrayList, LinkedList).
         List<String> MyList =  new ArrayList<>();
        MyList.add("apple");
        MyList.add("banana");
        MyList.add("mango");
        System.out.println(MyList);
        for (String temp: MyList){
            System.out.println(temp);
        }


        System.out.println("*********************************");

        //Set: An unordered collection that does not allow duplicate elements (e.g., HashSet, TreeSet).
        Set<String> MySet = new HashSet<>();
        MySet.add("apple");
        MySet.add("banana");
        MySet.add("mango");
        System.out.println(MySet);
//        for(String temp1:MySet){
//            System.out.println(temp1);
//        }

        System.out.println("*********************************");

        //Map: An object that maps keys to values (e.g., HashMap, TreeMap).
        Map<String ,Integer> MyMap = new HashMap<>();
        MyMap.put("apple",201);
        MyMap.put("banana",206);
        MyMap.put("mango",204);
        System.out.println(MyMap);
//        for (Map.Entry<String ,Integer> temp2:MyMap.entrySet()){
//            System.out.println(temp2.getKey()+   "  "+  temp2.getValue());
//        }


    }
}
