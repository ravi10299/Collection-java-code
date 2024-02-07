package java_Collection_Notes;

import java.util.HashSet;

public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet<String> MySet = new HashSet<>();//unordered list.......
        MySet.add("apple");
        MySet.add("banana");
        MySet.add("mango");
        MySet.add("mango");
        MySet.add("orange");
        MySet.add("orange");
        System.out.println(MySet);//does not allow the duplicate element....

        //contains the element of the set
        System.out.println(MySet.contains("orange"));


//        get the element of the set
//        System.out.println(MySet.get(0));
        //The HashSet class in Java does not provide specific "get" methods to retrieve elements by index
        // because HashSet is an unordered collection,
        // and it does not maintain the order of elements
        //remove the element
        MySet.remove("mango");
        System.out.println(MySet);




    }
}
