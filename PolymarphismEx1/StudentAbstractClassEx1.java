package PolymarphismEx1;

public abstract class StudentAbstractClassEx1 {
    abstract void College();//without implementation
    void print(){
        System.out.println("this is the college..");
    }



}
class Student extends StudentAbstractClassEx1{
    @Override
    void College() {
        super.print();
        System.out.println("this is the first Student");
    }
}
class Student2 extends StudentAbstractClassEx1{
    @Override
    void College() {
        System.out.println("this is the second student..");

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student2 s2 = new Student2();

        s1.College();
        s2.College();

    }
}
