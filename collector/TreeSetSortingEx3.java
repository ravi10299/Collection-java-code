package collector;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSortingEx3 {
    public static void main(String[] args) {
        TreeSet<Student> s2 = new TreeSet<>(Comparator.comparingInt(Student -> Student.id));
        TreeSet<Student> s3  =new TreeSet<>(Comparator.comparing(Student ->Student.name));
                //s2 initialization
        s2.add(new Student(2004,"aaaa"));
        s2.add(new Student(2005,"bbbb"));
        s2.add(new Student(2006,"cccc"));
        s2.add(new Student(2002,"ddddd"));
        s2.add(new Student(2003,"eeeee"));
        //s3 initialization
        s3.add(new Student(2004,"dddd"));
        s3.add(new Student(2005,"cccc"));
        s3.add(new Student(2006,"eeee"));
        s3.add(new Student(2002,"aaaa"));
        s3.add(new Student(2003,"bbbb"));


        System.out.println(s2);

        System.out.println("****************************************");
        //sorting by the ascending order with the help of the student id(integer).........
        s2.stream().sorted(Comparator.comparingInt(temp1 -> temp1.id))
                .forEach(temp11 -> System.out.println(temp11.id+"  "+ temp11.name));


        System.out.println("****************************************");
        //sorting by the descending order with the help of the student id(integer).........
        s2.stream().sorted(Comparator.comparingInt(temp1 -> -temp1.id))
                .forEach(temp11 -> System.out.println(temp11.id+"  "+ temp11.name));



        //sorting by the ascending order with the help of the student name(String).........
        System.out.println("*****************************************");
        s3.stream().sorted(Comparator.comparing(temp1 -> temp1.name))
                .forEach(temp11 -> System.out.println(temp11.id+"  "+ temp11.name));



        //sorting by the ascending order with the help of the student name(String ).........
        System.out.println("*****************************************");
        s3.stream().sorted(Comparator.comparing(temp1 -> temp1.name,Comparator.reverseOrder()))
                .forEach(temp11 -> System.out.println(temp11.id+"  "+ temp11.name));
    }
}
