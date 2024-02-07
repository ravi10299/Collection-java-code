package FileException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FiletextExcetion {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\raviv\\Desktop\\core java10\\java code\\src\\FileException\\file.txt");
        FileWriter writer  = new FileWriter("file1.txt");

        try {
            int c;
            while ((c =reader.read())!=-1){
               // System.out.println(c);
                writer.write(c);
            }
        }catch (IOException e){
            System.out.println("code executed....");
            System.out.println(e.getMessage());
        }finally {
            reader.close();
            writer.close();
        }
    }
}
