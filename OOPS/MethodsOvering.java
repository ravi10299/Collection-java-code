package OOPS;

public class MethodsOvering {
    public static void main(String[] args) {
        Clild c1 = new Clild();
        c1.Qualification();
    }
}
class Parent{
    public void Properties(){
        System.out.println("land,paisa");
    }
    public void Qualification(){
        System.out.println("post graduate");
    }
}
class Clild extends Parent{
    @Override
    public void Qualification() {
        super.Properties();
        super.Qualification();

        System.out.println("only for graduation");
    }
}
