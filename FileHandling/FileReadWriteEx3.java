package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteEx3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader  =  new FileReader("File02.txt");
        FileWriter fileWriter  = new FileWriter("file03.txt");

        try{
            int c;
            while ((c=fileReader.read()) != -1){
                fileWriter.write(c);
            }
            System.out.println("file write the successfully....");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            fileWriter.close();
            fileReader.close();
        }

    }
}
