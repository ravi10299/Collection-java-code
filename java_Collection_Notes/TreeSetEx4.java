package java_Collection_Notes;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx4 {
    public static <number1> void main(String[] args) {
        TreeSet<String> MySet1 = new TreeSet<>();
        MySet1.add("Apple");
        MySet1.add("banana");
        MySet1.add("mango");
        MySet1.add("papaya");
        MySet1.add("Apple");
        System.out.println(MySet1);
        System.out.println(MySet1.contains("papaya"));

        System.out.println(MySet1.add("ravi"));
        System.out.println(MySet1);

        // Iterating through the HashSet using an iterator
        Iterator<String> iterator = MySet1.iterator();
        while (iterator.hasNext()){
            String Fruits = iterator.next();
            System.out.println(Fruits);

        }
        System.out.println("*************************");
        // Alternatively, iterating through the HashSet using enhanced for loop
        for (String temp:MySet1){
            System.out.println(temp);
        }

        ArrayList<Integer> number1  =new ArrayList<>();
        number1.add(10);
        number1.add(5);
        number1.add(6);
        number1.add(3);

        System.out.println("**********************");
        number1.stream().sorted(Comparator.comparingInt(temp1 ->temp1)).forEach(temp11-> System.out.println(temp11));

        TreeSet<Integer> number  = new TreeSet<>();
        number.add(1);
        number.add(12);
        number.add(5);
        number.add(7);
        number.add(4);
        System.out.println(number);

        ArrayList<number1> temp =  new ArrayList<number1>();
        System.out.println(temp);

    }
}
