package FuctionalInterface;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<books> client1 = new ArrayList<>();
        client1.add(new books(101,"java","jams gosling"));
        client1.add(new books(101,"java","jams gosling"));
       System.out.println(client1);
       //for each methods......
       for (books temp:client1){
           System.out.println(temp);
       }

        System.out.println("******************************");
       // by using lambda expression.............
        client1.forEach((booksx -> System.out.println(booksx)));


        System.out.println("******************************");
        //by using method expression
       client1.forEach(System.out::println);
    }
}
