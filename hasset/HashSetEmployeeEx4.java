package hasset;

import java.util.HashSet;
import java.util.List;

public class HashSetEmployeeEx4 {
    public static void main(String[] args) {
        EmployeeEx3 e = new EmployeeEx3("ravi",200,22000.2);
        EmployeeEx3 e1 = new EmployeeEx3("ravi1",201,2200.2);
        EmployeeEx3 e2 = new EmployeeEx3("ravi2",202,22020.2);
        HashSet<EmployeeEx3> MyHashSet = new HashSet<>(List.of(e,e1,e2));
        for(EmployeeEx3 temp:MyHashSet){
            System.out.println(temp.name+" "+temp.id+" "+temp.salary);

        }
        System.out.println("*******************************");
        HashSet<EmployeeEx3> MyHashSet1 =new HashSet<>();
        MyHashSet1.add(e);
        MyHashSet1.add(e1);
        MyHashSet1.add(e2);


        for(EmployeeEx3 temp:MyHashSet){
            System.out.println(temp.name+" "+temp.id+" "+temp.salary);

        }

        HashSet<Integer> s =new HashSet<>();
        s.add(9);
        s.add(5);
        s.add(8);
        s.add(3);
        s.clear();
        System.out.println(s);




    }
}
