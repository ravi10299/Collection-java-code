package CollectionSEx1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers  =new ArrayList<>(List.of(1,2,3,10,4));

        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);
    }
}
