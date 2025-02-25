import java.util.HashSet;

public class SortedSetEx5 {

    // A hash table is a data structure that implements an associative array, a structure that can map keys to values. It uses a hash function to compute an index into an array of buckets or slots, from which the desired value can be found.

    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(12);
        mySet.add(1);
        mySet.add(5);
        mySet.add(3);
        mySet.add(4);
        mySet.add(2);
        mySet.add(1);
        mySet.add(10);


        System.out.println(mySet);
        mySet.forEach((i)->System.out.println(i));

    }
}