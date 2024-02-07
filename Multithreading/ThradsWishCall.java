package Multithreading;

public class ThradsWishCall {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 my1 = new MyThread1();
        MyThred2 my2 =  new MyThred2();
        MyThred3 my3 =  new MyThred3();
        my1.start();
//        my1.join();

        my2.start();

        my3.start();




    }
}
