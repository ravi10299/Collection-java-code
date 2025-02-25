package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<String> myTree = new TreeSet<>();
        myTree.add("ravi");
        myTree.add("vijay");
        myTree.add("ravi");
        myTree.add("vijay");


        //interator
        Iterator<String> myIterator = myTree.iterator();
        
        while (myIterator.hasNext()) 
        
        {
        System.out.println(myIterator.next());    
        }


    }
}
