package java02;
import java.util.ArrayList;
import java.util.*;
public class ArrayStringEx1 {
 //   public static void main(String[] args) {
//        ArrayList<String>  str  =new ArrayList<String>();
//        str.add("ravi");
//        str.add("shashi");
//        str.add("ravindra");
//        str.add("Azad");
//        str.add("Arvind");
//        System.out.println(str);
//
//        for (String name :str){
//            System.out.print(name +" ");
//        }
//
//        System.out.println("*************");
//        //iterator methods
//        Iterator<String> onj1 = str.Iterator();
//        Iterator<String> obj5 = Iterator<String>();
//
//        while (onj1.hasnext()){
//            System.out.println(onj1.next());
//        }
//        import java.util.ArrayList;
//import java.util.Iterator;


            public static void main(String[] args) {
                ArrayList<String> list = new ArrayList<>();
                // Add some elements to the list
                list.add("Element 1");
                list.add("Element 2");
                list.add("Element 3");

                // Create an iterator for the list
                Iterator<String> obj5 = list.iterator();

                // Now you can use the iterator to iterate over the elements
                while (obj5.hasNext()) {
                    String element = obj5.next();
                    System.out.println(element);
                }
            }
        }



//    }
//}
