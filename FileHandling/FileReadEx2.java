package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadEx2 {
    public static void main(String[] args) {
        //read the file
        File MyFile = new File("file02.txt");
        try {
            Scanner sc = new Scanner(MyFile);
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            System.out.println("read the file successfully...");
            sc.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
