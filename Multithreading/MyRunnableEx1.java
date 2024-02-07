package Multithreading;

public class MyRunnableEx1 implements Runnable{
    @Override
    public void run() {
        MyRunnableMassege.GetMassege("ravi");

    }
}
class MyRunnableEx2 implements Runnable{
    @Override
    public void run() {
        MyRunnableMassege.GetMassege("Wageesha");

    }
}class MyRunnableEx3 implements Runnable{
    @Override
    public void run() {
        MyRunnableMassege.GetMassege("Prachi");

    }
}
class MyRunnableEx4 implements Runnable{
    @Override
    public void run() {
        MyRunnableMassege.GetMassege("shruti");

    }
}