package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteEx4 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader  = new FileReader("file02.txt");
        FileWriter fileWriter = new FileWriter("C:\\Users\\raviv\\Desktop\\core java10\\java code\\src\\file04.txt");
        try {
            Scanner sc =  new Scanner(fileReader);
            while (sc.hasNextLine()){
                String line  = sc.nextLine();
                fileWriter.write(line);
                System.out.println(line);

            }
            sc.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            fileWriter.close();
            fileReader.close();
        }
    }
}
