package Multithreading;

public class Greating{
    //Synchronized modifier - It is only for methods.
    //By default, all threads are non-synchronized.
    public static synchronized void Wish(String name)  {
        for(int i = 0;i<=5;i++){
            System.out.println("good morning "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
