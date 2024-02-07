package SpringAdvanceJava;


interface Rinding{
    void Ride();

}
class TwoViler implements Rinding{
    @Override
    public void Ride() {
        System.out.println("the rinding twoViler in happy travel........");
    }
}
class FourViler implements Rinding {

    @Override
    public void Ride() {
        System.out.println(" the rinding FourViler in happy travel........");
    }
}

class Vehicle{
   Rinding rinding;
}

public class BeanClassEx4 extends Vehicle{
    public static void main(String[] args) {
        Vehicle v1 =new Vehicle();
        v1.rinding = new FourViler();
        v1.rinding.Ride();
    }
}
