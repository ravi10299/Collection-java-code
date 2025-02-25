import java.util.Collections;
import java.util.*;

public class ArrayListEx3 {
    public static void main(String[] args) {
  ArrayList<String> mystr = new ArrayList<>();
        Collections.addAll(mystr, "apple","mango","banana");
        for(String s : mystr){
            System.out.print(s+ " ");
        }
        System.out.println();


        System.out.println("print by lambda expression sort the element");

        mystr.sort((a,b)->a.compareTo(b));
        System.out.println(mystr);

        System.out.println("print by lambda expression for each loop");
        mystr.forEach((i)->System.out.println(i+" "));
        
    }
    
}
