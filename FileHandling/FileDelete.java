package FileHandling;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File Myfile  = new File("file03.txt");
        if (Myfile.delete()){
            System.out.println("this file is the deleted  "+Myfile.getName());
        }else {
            System.out.println("this file is not deleted facing the some error..");
        }
    }
}
