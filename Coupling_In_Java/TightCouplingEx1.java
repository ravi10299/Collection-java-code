package Coupling_In_Java;

import javax.management.MBeanAttributeInfo;

public class TightCouplingEx1 {
    public static void main(String[] args) {
        Faculty f = new Faculty();
        f.Teaching();
    }

}

class Student{
    void Learn(){
        System.out.println("Learn to Student..............");

    }
}
class Employee{
    void Learn(){
        System.out.println("Learn to the Employee..............");
    }
}
//dependent object.....
class Faculty{
    Student s = new Student();
    Employee e =new Employee();
    void Teaching(){
        s.Learn();
        e.Learn();
    }
}
