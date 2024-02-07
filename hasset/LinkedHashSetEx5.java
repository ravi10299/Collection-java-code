package hasset;

import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetEx5 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> MySet = new LinkedHashSet<>(List.of(1,2,4,10));
        MySet.add(126);
        MySet.add(125);
        MySet.add(112);
        MySet.add(124);
        System.out.println(MySet);
        System.out.println("**************For Each methods****************");

        for (Integer temp:MySet){
            System.out.print(temp+" ");
        }
        System.out.println();
        System.out.println("****************Lambda Expression******************");
        MySet.forEach(temp-> System.out.print(temp+" "));



    }
}
