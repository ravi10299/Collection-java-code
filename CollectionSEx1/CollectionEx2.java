package CollectionSEx1;

import java.util.ArrayList;

public class CollectionEx2 {
    public static void main(String[] args) {
        ArrayList<Employee1> e1 = new ArrayList<>();
        e1.add(new Employee1("ravi",101, 2000));
        e1.add(new Employee1("shashi",105, 20001));
        e1.add(new Employee1("ravindra",102, 20005));
        e1.add(new Employee1("Azad",103, 20006));
        e1.add(new Employee1("kumar",104, 20002));
        e1.add(new Employee1("verma",107, 20007));
        e1.add(new Employee1("gautam",106, 20004));
//      System.out.println("without any sorting print the details...");
        e1.forEach(temp -> System.out.println(temp.id + " " + temp.salary));

        System.out.println("************************************");
        //sorting the ascending order with the help of employee1 id....
        e1.sort((temp1, temp2) -> Integer.compare(temp1.id, temp2.id));
        e1.forEach(temp11 -> System.out.println(temp11.name+"  "+temp11.id + " " + temp11.salary));


        System.out.println("**********************************");
        //sorting the descending order with the help of employee1 id....
        e1.sort((temp3, temp4) -> Integer.compare(temp4.id, temp3.id));
        e1.forEach(temp22 -> System.out.println(temp22.name+"  "+temp22.id + " " + temp22.salary));


        System.out.println("**********************************");
        //sorting the ascending order with the help of employee1 salary....
        e1.sort((temp5, temp6) -> Integer.compare(temp5.salary, temp6.salary));
        e1.forEach(temp33 -> System.out.println(temp33.name+"  "+temp33.id + "  " + temp33.salary));

        System.out.println("**********************************");
        //sorting the descending order with the help of employee1 salary....
        e1.sort((temp7, temp8) -> Integer.compare(temp8.salary, temp7.salary));
        e1.forEach(temp44 -> System.out.println(temp44.name+"  "+temp44.id + "  " + temp44.salary));


        System.out.println("**********************************");
        //sorting the descending order with the help of employee1 salary....
        // e1.sort((temp10, temp11) -> String.compare(temp10.name, temp11.name));

        e1.sort((temp10, temp11) -> temp10.name.compareTo(temp11.name));
        e1.forEach(temp55 -> System.out.println(temp55.name+"  "+temp55.id + "  " + temp55.salary));
    }
}
class Employee1 {
    String name;
    int id;
    int salary;

    Employee1(String name,int id, int salary) {
        this.id = id;
        this.salary = salary;
        this.name  = name;
    }
}

