package GarvageColletors;

public class GarvageCollectorEx1 {
    public void finalize(){
//        System.out.println(123);
        System.out.println("ravi verna");
        System.out.println(10/0);//not initializes the logical operation
    }

    public static void main(String[] args) {
        GarvageCollectorEx1 gc1 = new GarvageCollectorEx1();
        GarvageCollectorEx1 gc2  = new GarvageCollectorEx1();
        gc1=null;
        gc2=null;

        System.gc();
      //  Runtime.getRuntime().gc();

    }
}
