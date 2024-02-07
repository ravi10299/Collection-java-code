package Exaception;

import java.io.*;

public class CheckedExceptionEx1 {
    public static void main(String[] args) {
        //Checked exceptions in Java are exceptions that are checked at compile time.
        try {
            BufferedReader buffer  = new BufferedReader(new FileReader("Example.txt"));
            String reader  = buffer.readLine();
            System.out.println(reader);
            buffer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
