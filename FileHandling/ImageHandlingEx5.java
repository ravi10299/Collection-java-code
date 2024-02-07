package FileHandling;

import javax.imageio.ImageReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageHandlingEx5 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream  = new FileInputStream("C:\\Users\\raviv\\Desktop\\core java10\\java code\\god.jpg");
        FileOutputStream fileOutputStream =  new FileOutputStream("krishna.jpg");
        try{
            int c;
            while ((c=fileInputStream.read()) != -1){
                fileOutputStream.write(c);

            }
            System.out.println("this file is executed");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
