package Coupling_In_Java;

public class TightCouplingEx2 {
    public static void main(String[] args) {

        Traveler t =new Traveler();
        t.StartJourney();

    }
}

//Dependency object................
class Bike{
    public void move(){
        System.out.println("the Travel bike is Moving ......");
    }
}
//Dependency object...................
class Car{
    public void move(){
        System.out.println("the Travel car is moving ........");
    }
}
//dependent  object.................
class Traveler{

    //the traveler is dependent to the car and bike...........
    Car c = new Car();
    Bike b = new Bike();

    public void StartJourney(){
        c.move();
        b.move();
    }
}
