package collector;

public class EmployeeData {
    int id;
    String name;
    double salary;
    public EmployeeData(int id ,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void Display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
