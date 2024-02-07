package GarvageColletors;

public class GarvageRuntimeEx2 {
    public static void main(String[] args) {
        Runtime r1 = Runtime.getRuntime();
        System.out.println("total memory  "+r1.totalMemory());
        System.out.println("free memory  "+r1.freeMemory());

        for(int i=1;i<=1000;i++){
            new GarvageRuntimeEx2();
        }
        System.out.println("total memory after object creation.. "+r1.totalMemory());
        r1.gc();
        System.out.println("free memory after gc called..  "+r1.freeMemory());

    }
}
