package SpringAdvanceJava;

//public interface People{
//    void Learn();
//
//}

class Student implements People{

    @Override
    public void Learn() {
        System.out.println("Student training the java");
    }
}
class Employee implements People{

    @Override
    public void Learn() {
        System.out.println("training the employee in java");
    }
}
class Faculty{
  People people;

}

public class BeanClassEx3{
    public static void main(String[] args) {
        Faculty f1= new Faculty();
        //Faculty train to the Student......


//                    f1.people = new Student();
//                    f1.people.Learn();


        //Faculty train to the employee....


                      f1.people  = new Employee();
                      f1.people.Learn();


    }
}
