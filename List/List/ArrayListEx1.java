package List;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListEx1{
    public static void main(String[] args) {
        
        ArrayList<Integer> list  = new ArrayList<>();
        Collections.addAll(list, 1, 20, 23, 14, 5);    // addAll() method is used to add multiple elements to the list.
   
    
        System.out.println("List: " + list);// print the list.

        for(int i = 0; i < list.size(); i++){ // size() method is used to get the size of the list.
            System.out.println("Element at index " + i + " : " + list.get(i));
        }

        Collections.sort(list); // sort() method is used to sort the list.
   
        for(Integer i : list){ // for-each loop is used to iterate through the list.
            System.out.print(i+" ");
        }


        System.out.println();
           list.sort((a1,a2) -> a1.compareTo(a2)); // lambda expression is used to sort the list.
           System.out.println("Sorted List: " + list);


           System.out.println(list.contains(20)); // contains() method is used to check if the list contains the specified element.


           System.out.println(list.get(1)); // get() method is used to get the element at the specified index.
   

           System.out.println(list.indexOf(20)); // indexOf() method is used to get the index of the specified element.
        }



    
    
} 