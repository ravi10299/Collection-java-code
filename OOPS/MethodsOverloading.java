package OOPS;

public class MethodsOverloading {
    public  void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b ,int c){
        System.out.println(a+b+c);

    }
    public void add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    public void hello(String name){
        System.out.println("hello"+ name);
    }
    public static void main(String[] args) {
        MethodsOverloading o1 = new MethodsOverloading();
        o1.add(12,13);
        o1.add(12,13,20);
        o1.add(12,13,23,51);

    }
}
