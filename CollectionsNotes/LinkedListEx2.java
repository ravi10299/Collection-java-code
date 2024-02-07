package CollectionsNotes;

import java.util.LinkedList;

public class LinkedListEx2 {
    public static void main(String[] args) {
        //list is an order collection that allow the duplicate element....
        LinkedList<Integer> MyList = new LinkedList<>();//maintenance the insertion oder.......

        MyList.add(10);
        MyList.add(50);
        MyList.add(40);
        MyList.add(20);
        MyList.add(30);
        MyList.add(60);
        System.out.println(MyList);
    }
}
