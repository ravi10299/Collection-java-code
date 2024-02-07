package Multithreading;

import javax.imageio.stream.ImageInputStream;

public class Mythread extends Thread{//step1 extend the thread.

    public void Display(){
        System.out.println("user Define methods..");
    }
    @Override
    public void run() {//step2 override the run methods
        super.run();

        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);//thread sleep methode is ues the wait the jvm .
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("user define thread");
        }

    }

    public static void main(String[] args) {//main thread
        //main thread methods
        System.out.println(Thread.currentThread().getName());
        Mythread m = new Mythread();
        m.start();
        //default thread name
        System.out.println(m.getName());

        //thread name is change....
        m.setName("ravi");
        System.out.println(m.getName());
    }
}
