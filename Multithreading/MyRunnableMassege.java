package Multithreading;

public class MyRunnableMassege {
    public static void GetMassege(String name){
       for (int i=1;i<=5;i++){
           System.out.println("your name is "+ name);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
