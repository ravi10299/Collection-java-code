package Exaception;

public class ThrowEx1 {
    static void Getvalid(int age) {
        if (18 > age) {

            throw new ArithmeticException("not valid for the vote....");

        }else {
            System.out.println("this eligible for the vote.... ");
        }
    }
    public static void main(String[] args) {
        Getvalid(10);

    }
}
