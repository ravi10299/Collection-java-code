package java_Collection_Notes;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListUserDefineEx11 {
    public static void main(String[] args) {
        ArrayList<Student11> s1 = new ArrayList<>();
        s1.add(new Student11("ravi",8001));
        s1.add(new Student11("ravindra",8005));
        s1.add(new Student11("shashi",8004));
        s1.add(new Student11("azad",8002));
        s1.add(new Student11("gautam",8006));
        //print
        for(Student11 temp: s1){
            System.out.println(temp.name+"    "+temp.id);
        }


        //sorting by the help of name(String) in increasing order............
        s1.stream().sorted(Comparator.comparing(temp->temp.name)).forEach(temp11-> System.out.println(temp11.name));
        System.out.println("***********************************");
        //sorting by the help of id(integer) in increasing order............
        s1.stream().sorted(Comparator.comparingInt(temp->temp.id)).forEach(temp11-> System.out.println(temp11.id));
        System.out.println("************************************");
        //sorting by the help of name(String) in descending order............
        s1.stream().sorted(Comparator.comparing(temp->temp.name,Comparator.reverseOrder())).forEach(temp22-> System.out.println(temp22.name));
        System.out.println("*************************************");
        //sorting by the help of id(integer) in descending order............
        s1.stream().sorted(Comparator.comparingInt(temp->-temp.id)).forEach(temp22-> System.out.println(temp22.id));
    }
}
class Student11{
    String name;
    int id;
    public Student11(String name,int id){
        this.name = name;
        this.id = id;

    }
}
