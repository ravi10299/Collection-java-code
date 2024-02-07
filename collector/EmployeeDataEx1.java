package collector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDataEx1 {
    public static void main(String[] args) {
        //values pass to the constructors.....
       EmployeeData e1 = new EmployeeData(1001,"ravi",50000);
       EmployeeData e2 = new EmployeeData(1001,"ravi",50000);
       EmployeeData e3 = new EmployeeData(1001,"ravi",50000);
//        e1.Display();
            //add object in list through the constructors.........................
            ArrayList<EmployeeData> obj1 = new ArrayList<>(List.of(e1,e2,e3 , new EmployeeData(104,"Kartik",80000.6),new EmployeeData(80001,"shashi",50000.2)));
            //display by the for each method..........
        for (EmployeeData temp:obj1){
            System.out.println(temp.id+ " "+temp.name+" "+temp.salary);



        }
        //add object in list by the add.methods.............
        System.out.println("add object in list by the add.methods..");
        EmployeeData e5 =new EmployeeData(20001,"ravindra",50000.2);
        EmployeeData e6 =new EmployeeData(2000,"kumar",600000.2);
        ArrayList<EmployeeData> obj2  =new ArrayList<>();
        obj2.add(e5);
        obj2.add(e6);
        for (EmployeeData temp2:obj2){
            System.out.println(temp2.id+ " "+ temp2.name+" "+temp2.salary);

        }
    }
}
