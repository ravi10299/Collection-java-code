package GarvageColletors;

import java.io.IOException;

public class FuctoriesCollectors {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("calc");
        Runtime.getRuntime().exec("note");
        Runtime.getRuntime().exec("mspaint");

        //system shutdown...................

//        Runtime.getRuntime().exec("shutdown -s -t 0");
//        Runtime.getRuntime().exec("shutdown -r -t 0");


    }
}
