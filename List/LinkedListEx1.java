import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        LinkedList<Integer> mylist = new LinkedList<>();
        Collections.addAll(mylist,10,20,30,60,50,40,100,90,80,70);

        for(Integer i : mylist){
            System.out.print(i+ " ");
        }
        System.out.println();
      System.out.println("sort the array using lambda expretion");
        mylist.sort((b,a)->b.compareTo(a));
        for(Integer i : mylist){
            System.out.print(i+" ");
        }
    }
}
