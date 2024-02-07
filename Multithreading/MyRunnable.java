package Multithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("good morning");

        }
    }

    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my);
        t1.start();

    }
}
