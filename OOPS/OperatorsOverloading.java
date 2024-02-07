package OOPS;

public class OperatorsOverloading {
    public void display(){
        System.out.println(20+230); // +OperatorsOverloading
        System.out.println("ravi"+20);// +OperatorsOverloading
    }
    //java only support plus (+) OperatorsOverloading

    public static void main(String[] args) {
        OperatorsOverloading o = new OperatorsOverloading();
        o.display();
    }
}
