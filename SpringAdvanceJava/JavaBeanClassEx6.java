package SpringAdvanceJava;

public class JavaBeanClassEx6{
    private String name;
    private int id;
    private double salary;
//    public JavaBeanClassEx6(String name,int id,double salary){
//        this.name = name;
//        this.id = id;
//        this.salary = salary;
//    }
//    public void Display(){
//        System.out.print(name+ " "+id+"  "+salary);
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
class Demo {
    public static void main(String[] args) {

//            JavaBeanClassEx6 temp = new JavaBeanClassEx6("ravi",2002,50000.5);
           JavaBeanClassEx6 temp = new JavaBeanClassEx6();
//            temp.Display();
            temp.setName("ravi");
            temp.setId(123);
            temp.setSalary(2002.20);
            System.out.println(temp.getName());
            System.out.println(temp.getId());
            System.out.println(temp.getSalary());
    }
}
