package Exaception;

import java.util.Scanner;

public class ExceptionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  name ="";

        try {
            int Length1 = name.length();
            try {
                System.out.println("java1");
                System.out.println("java2");


                System.out.println(Length1);
                System.out.println(10 / 0);

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());

            }catch (NullPointerException e1){
                System.out.println(e1.getMessage());
            }

        }catch (Exception E){
            System.out.println(E.getMessage());
        }
        finally { //the finally black code is the always Executed
            sc.close();
            System.out.println("hava1");
            System.out.println("hava2");

        }
    }
}
