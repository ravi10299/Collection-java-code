package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSetEx1 {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<>();
        t1.add("ravi");
        t1.add("ravindra");
        t1.add("shashi");
        t1.add("Azad");
        System.out.println(t1);
        //traversing elements
        Iterator<String> itr = t1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
