package hasset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HasSetEx1 {
    public static void main(String[] args) {
        /*In Java, HashSet is a class that implements the Set interface,
         which is a part of the Java Collections Framework.
         It is used to store unique elements, and it does not allow duplicate values.
         The elements in a HashSet are not stored in any particular order.*/

        HashSet<Integer> h1 = new HashSet<Integer>();//store the unique values..
        h1.add(10);
        h1.add(20);
        h1.add(30);
        h1.add(10);
        System.out.println(h1.size());
        System.out.println(h1);

        HashSet<String> h2 =new HashSet<String>();
        h2.add("red");
        h2.add("white");
        h2.add("black");
        h2.add("red");
        System.out.println(h2.size());
        System.out.println(h2);

        System.out.println("*******************");
        System.out.println("Employee details........");
        //HashSet<LinkdinHashSetEx3> e1  = new HashSet<LinkdinHashSetEx3>(List.of((new LinkdinHashSetEx3("lokesh",2001)),new LinkdinHashSetEx3("ravi0",1234)));
        HashSet<LinkdinHashSetEx3> e1  = new HashSet<>();
        LinkdinHashSetEx3 emp = new LinkdinHashSetEx3();
        emp.setEmployeeName("ravi kumar verma");
        emp.setEid(1234);
        e1.add(emp);

        for(LinkdinHashSetEx3 temp4 : e1){
            System.out.println(temp4.EmployeeName+ " "+ temp4.Eid);
        }

    }
}
