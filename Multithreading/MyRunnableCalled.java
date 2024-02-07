package Multithreading;

public class MyRunnableCalled {
    public static void main(String[] args) throws InterruptedException {
        MyRunnableEx1 r1 = new MyRunnableEx1();
        Thread t1 = new Thread(r1);
        MyRunnableEx2 r2 = new MyRunnableEx2();
        Thread t2 = new Thread(r2);
        MyRunnableEx3 r3 = new MyRunnableEx3();
        Thread t3 = new Thread(r3);
        MyRunnableEx4 r4 = new MyRunnableEx4();
        Thread t4 = new Thread(r4);
        t1.start();t1.join();
        t2.start();t2.join();
        t3.start();t3.join();
        t4.start();t4.join();


    }
}
