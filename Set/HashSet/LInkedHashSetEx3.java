import java.util.LinkedHashSet;
import java.util.List;

public class LInkedHashSetEx3 {
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> mySet = new LinkedHashSet<>(List.of(1,2,2,3,4,5,6,7,8,9,10));

        //lambda expration
        System.out.println("lambda expration");
        mySet.forEach((i) -> System.out.println(i));


        //remove element...
        mySet.remove(1);
        mySet.remove(2);

        System.out.println("After removing 1");

        //for each loop
        System.out.println("for each loop");
        for(Integer i : mySet){
            System.out.println(i);
        }

        System.out.println(mySet.contains(10));
    }
}
