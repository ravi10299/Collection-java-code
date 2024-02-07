package Multithreading;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        Greating.Wish("ravi");
    }
}
class MyThred2 extends Thread{
    @Override
    public void run() {
        super.run();
        Greating.Wish("shashi");
    }
}

class MyThred3 extends Thread{
    @Override
    public void run() {
        super.run();
        Greating.Wish("ravindra");
    }
}
