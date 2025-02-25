package map;

import java.util.HashMap;

public class HashMapEx3 {
    public static void main(String[] args) {
        HashMap<Integer, Person> map = new HashMap<>();
        map.put(1,new Person("ravi", 25, "varanasi"));
        map.put(2,new Person("ravindra", 26, "noida"));
        map.put(3,new Person("Shashi", 27, "bangalore"));
    
    for(HashMap.Entry<Integer, Person> entry : map.entrySet()){
        System.out.println(entry.getKey() + "  = " + entry.getValue().name + " " + entry.getValue().age + " " + entry.getValue().address);
    }
}
}

class Person{
     String name;
     int age;
     String address;
    public  Person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
}
