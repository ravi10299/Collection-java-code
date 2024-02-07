package PolymarphismEx1;



//In Java, an abstract method is a method that is declared without an implementation in an abstract class or an interface.
// Abstract methods are meant to be overridden (implemented) by the concrete subclasses that extend the abstract class or implement the interface.
// Here are the key points related to abstract methods in Java:

public abstract class AbstractMethods {
   abstract void Display();
   public void print(){
       System.out.println("print the type of motor");
   }

}
class bike extends AbstractMethods{
    @Override
    void Display() {
        super.print();
        System.out.println("this is the bike riding ");
    }
}
class motor extends AbstractMethods{
    @Override
    void Display() {
        System.out.println("this is the car riding ");
    }
}
class Print{
    public static void main(String[] args) {
        bike b1 =new bike();
        motor m1 =new motor();
        b1.Display();
        m1.Display();
    }
}
