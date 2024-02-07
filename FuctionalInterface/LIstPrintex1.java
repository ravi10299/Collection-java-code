package FuctionalInterface;

import java.util.List;

public class LIstPrintex1 {
    public static void main(String[] args) {
        List<String> MyList  = List.of("ravi","shashi","ravingra");
       // System.out.println(MyList);

//        for(String temp:MyList){
//            System.out.println(temp);
//        }

        MyList.forEach( a-> System.out.println(a));


    }
}
