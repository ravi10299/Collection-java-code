package collector;

import java.util.Comparator;
import java.util.HashSet;

public class HashSetSortingEx1 {
    public static void main(String[] args) {
        HashSet<Student> s1 = new HashSet<>();
        s1.add(new Student(1001,"ravu1"));
        s1.add(new Student(1005,"ravu2"));
        s1.add(new Student(1009,"rav3"));
        s1.add(new Student(1004,"ravu4"));
        s1.add(new Student(1008,"ravu5"));
        s1.add(new Student(1001,"ravu6"));
        System.out.println(s1);


        //sorting by the ascending order with the help of the student id(integer).........
        s1.stream().sorted(Comparator.comparingInt(temp1 -> temp1.id))
        .forEach(temp11 -> System.out.println(temp11.id+"  "+ temp11.name));


        //sorting by the descending order with the help of the student id(integer).........
        System.out.println("*****************************************");
        s1.stream().sorted(Comparator.comparingInt(temp2 -> -temp2.id))
                .forEach(temp22 -> System.out.println(temp22.id+"  "+ temp22.name));

        //sorting by the ascending order with the help of the student name(String).........
        System.out.println("*****************************************");

        s1.stream().sorted(Comparator.comparing(temp1 -> temp1.name))
                .forEach(temp11 -> System.out.println(temp11.id+"  "+ temp11.name));
        //sorting by the descending order with the help of the student name(String).........
        System.out.println("*****************************************");
        s1.stream().sorted(Comparator.comparing(temp1 -> temp1.name,Comparator.reverseOrder()))
                .forEach(temp11 -> System.out.println(temp11.id+"  "+ temp11.name));

    }
}
class Student{
    int id;
    String name;
    public Student(int id , String name){
        this.id  =id;
        this.name = name;

    }
}
