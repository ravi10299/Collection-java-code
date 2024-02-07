package SpringAdvanceJava;
//bean class..........
public class BeanClassWithConstructorEx5 {
    private String name;
    private int id;
    private double salary;
    private BeanClassWithConstructorEx5(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void Display(){
        System.out.println("employee name is  "+ name);
        System.out.println("employee id is  "+ id);
        System.out.println("employee salary is  "+salary);

    }

    public static void main(String[] args) {
        BeanClassWithConstructorEx5 obj=  new BeanClassWithConstructorEx5("ravi",123,50000);
        obj.Display();

    }
}
