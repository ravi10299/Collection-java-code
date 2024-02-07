package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteEx1 {
    public FileWriteEx1() throws FileNotFoundException {
    }

       public static void main(String[] args) throws IOException {

            //write the file
           FileWriter fileWriter = new FileWriter("File02.txt");


           try {
               fileWriter.write("this is the java file write file\nwrite the second line");
               System.out.println("Execution successful write the file....");
           } catch (IOException e) {

               System.out.println(e.getMessage());
           } finally {
               fileWriter.close();
           }

       }

}
