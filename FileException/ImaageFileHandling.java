package FileException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImaageFileHandling {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream  =new FileInputStream("C:\\Users\\raviv\\Desktop\\core java10\\java code\\src\\FileException\\Untitled design (4)_2.jpg");
        FileOutputStream fileOutputStream  = new FileOutputStream("ravi.jpg");

        int c;
        while ((c = fileInputStream.read()) != -1){
            fileOutputStream.write(c);

        }
    }
}
