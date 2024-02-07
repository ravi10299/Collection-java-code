package SpringAdvanceJava;
//pojo class
public class PojoClassEx1 {
   private String name;
  private   int id;
  private  double salary;
  public void SetName(String name){
      this.name= name;
  }
  public void SetId(int id){
      this.id = id;

  }
  public void SetSalary(double salary){
      this.salary = salary;
  }
  public String GetName(){
      return name;

  }
  public int GetId(){
      return id;
  }
  public double GetSalary(){
      return salary;
  }

    public static void main(String[] args) {
        PojoClassEx1 obj= new PojoClassEx1();
        obj.SetName("ravi kumar verma");
        obj.SetId(8001);
        obj.SetSalary(20000.20);
        System.out.println(obj.GetId());
        System.out.println(obj.GetName());
        System.out.println(obj.GetSalary());
    }


}
