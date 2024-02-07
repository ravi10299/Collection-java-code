package OOPS;

import java.sql.SQLOutput;

public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println(" 0 argument constructor called");
    }
    ConstructorOverloading(int a){
        System.out.println(a);
    }
    ConstructorOverloading(String name){
        System.out.println(name);

    }
    ConstructorOverloading(String name,int id){
        System.out.println(name+" "+ id);
    }
    ConstructorOverloading(String name,String college){
        System.out.println(name+"  "+ college);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(20);
        ConstructorOverloading obj3 = new ConstructorOverloading("ravi");
        ConstructorOverloading obj4 = new ConstructorOverloading("ravi",1001);
        ConstructorOverloading obj5 =new ConstructorOverloading("ravi","kit");
    }
}
