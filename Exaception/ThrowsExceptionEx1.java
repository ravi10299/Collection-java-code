package Exaception;

import static java.lang.Class.forName;

public class ThrowsExceptionEx1 {
    public void GetNumber() throws ArithmeticException , ClassNotFoundException{
        System.out.println(10/0);
//        class c = class.forName("file name");
    }

}
class Demo{
    public static void main(String[] args) {
        ThrowsExceptionEx1 s1 = new ThrowsExceptionEx1();
        try {
            s1.GetNumber();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}