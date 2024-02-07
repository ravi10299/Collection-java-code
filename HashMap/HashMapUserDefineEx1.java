package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefineEx1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"ravi");
        Employee e2 = new Employee(102,"ravindra");
        Employee e3 = new Employee(103,"shashi");
        Employee e4 = new Employee(104,"Azad");
        HashMap<Employee,Integer> Employee1 = new HashMap<>() ;
        Employee1.put(e1,1);
        Employee1.put(e2,2);
        Employee1.put(e3,3);
        Employee1.put(e4,4);

        System.out.println(Employee1);


        for (Map.Entry<Employee,Integer> temp : Employee1.entrySet()){
            System.out.println(temp.getKey().id+"   "+temp.getKey().name  +" "+temp.getValue());
        }

        System.out.println("*************************");

        //print the lambda expiration
        Employee1.forEach((k,v) ->System.out.println(k.id+"  "+k.name+"  "+v));


    }
}

class Employee{
    int id ;
    String name ;
    public Employee(int id ,String name){
        this.id  = id;
        this.name =  name;

    }
}
