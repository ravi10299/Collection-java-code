import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class HashSetEx1{
    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(145);
        mySet.add(20);
        mySet.add(20);
        mySet.add(552);
        mySet.add(12);
        mySet.add(19);
      


        mySet.forEach((i) -> System.out.println(i));//lambda expretion

        for(Integer i :mySet){//for each loop
            System.out.println(i);
        }

        
        List<Integer> sortedList = new ArrayList<>(mySet);//converting hashset to list
        sortedList.sort((a,b)->a.compareTo(b));
        sortedList.forEach((i) -> System.out.print(i+" "));


    }
}