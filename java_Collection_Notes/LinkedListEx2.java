package java_Collection_Notes;

import java.util.LinkedList;

public class LinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<String> MyList1  =new LinkedList<>();
        MyList1.add("ravi");
        MyList1.add("shashi");
        MyList1.add("ravindra");
        MyList1.add("Azad");
        System.out.println(MyList1);

        //contain the specific element of the LinkedList.
        System.out.println(MyList1.contains("ravindra"));//return true or false...

        //get the index of the element of the LinkedList array.....
        System.out.println(MyList1.get(1));


        //remove of the element in LinkedList
        MyList1.remove("azad");
        System.out.println(MyList1);


    }
}
