package String.java;

import javax.xml.transform.Source;
import java.lang.ref.SoftReference;

public class StringEx1 {
    public static void main(String[] args) {
        String name = "ravi"; //litral String initialisation
        String name1 = "ravi";//litral String initialisation
        if(name == name1){ //Address compare
            System.out.println("these are equal");
        }else{
            System.out.println("these are different");
        }
        if(name.equals(name1)){ //values compare
            System.out.println("these are equal");
        }else {
            System.out.println("these are different ");
        }

        String str1 = new String("ravi");
        String str2 = new String("ravi");
        if(str1 == str2){//address compare
            System.out.println("these are equal");

        }else {
            System.out.println("these are different");
        }
        if (str1.equals(str2)){ //values compare
            System.out.println("these are equal");

        }else {
            System.out.println("these are different");
        }


    }
}
