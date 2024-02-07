package OOPS;

public class MethodsOveridingEx1 {
    public static void main(String[] args) {
        Child1 c2 = new Child1();//this is the parent o args contractor called...

    }
}
class Parent1{
    Parent1(){
        this(10);
        System.out.println("this is parent o args contractor called");
    }
    Parent1(int a){
        System.out.println("this is parent one args contractor called "+ a);

    }
    public void Properties1(){
        System.out.println("this is  the parent properties");
    }
    public void Properties2(String name){
        System.out.println("this is  the parent properties" + name);
    }
}
class Child1 extends Parent1{
    @Override
    public void Properties1() {
        super.Properties2("ravi");// called the parent method for the one args pass method is called
        System.out.println("this is the parent methods overing to the child class");
    }
}
