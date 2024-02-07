package FuctionalInterface;

public interface FuctionalinterEx1 {
    //void Display();
//    int add(int a,int b);
    String Validuser(String name,String password);

}
class Demo{
    public static void main(String[] args) {
//        FuctionalinterEx1 d1 = () -> {
//            System.out.println("good afternoon");
//        };
//        d1.Display();
//
//       FuctionalinterEx1 d2 = (a,b) ->{return (a+b);};
//        System.out.println(d2.add(20,30));


        FuctionalinterEx1 d3 = (name , password) -> {return name.equalsIgnoreCase("java") && password.equalsIgnoreCase("Ravi123") ? "valid user": "Invalid Password";};
        System.out.println(d3.Validuser("java","ravi123"));

    }
}