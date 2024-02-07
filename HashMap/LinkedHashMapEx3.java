package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx3 {


    public static void main(String[] args) {

        Student s1 = new Student(101,"ravi");
        Student s2 = new Student(102,"ravindra");
        Student s3 = new Student(103,"shasi");
        LinkedHashMap<Student,Integer> onh =  new LinkedHashMap<>(Map.of(s1,1,s2,2,s3,3));

        for (Map.Entry<Student,Integer>temp : onh.entrySet()){
            Student s  = temp.getKey();
            System.out.println("key:  "+temp.getValue()+"  "+"name:  "+s.name+"  "+"id: "+  s.id );

        }
        onh.forEach((k,v) ->System.out.println(k.id +" " +k.name + "     "+v));

    }
}

class Student{
    int id ;
    String name;
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    public void Display(){
        System.out.println(id+"  "+ name);
    }
}
