package hasset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class StudentHashset {
    public static void main(String[] args) {
        StudentHashsetEx2 x  = new StudentHashsetEx2("ravi",1001,"kit");
        StudentHashsetEx2 y  = new StudentHashsetEx2("shashi",1002,"kit");
        StudentHashsetEx2 z  = new StudentHashsetEx2("ravindra",1003,"kit");

        HashSet<StudentHashsetEx2> s1= new HashSet<StudentHashsetEx2>(List.of(x,y,z,new StudentHashsetEx2("azad",8001,"kit")));
        for(StudentHashsetEx2 temp:s1){
            System.out.println(temp.name+ "  "+ temp.id+"  "+temp.colleges);
        }
        StudentHashsetEx2 x1  = new StudentHashsetEx2("kumar",1004,"kit");
        StudentHashsetEx2 y1  = new StudentHashsetEx2("rahit",1005,"kit");
        StudentHashsetEx2 z1  = new StudentHashsetEx2("rosan",1006,"kit");
        StudentHashsetEx2 z11  = new StudentHashsetEx2("rosan",1006,"kit");

        System.out.println("***********************");

        HashSet<StudentHashsetEx2> s2  = new HashSet<>();
        s2.add(x1);
        s2.add(y1);
        s2.add(z1);
        s2.add(z11);
        for(StudentHashsetEx2 temp1:s2){
            System.out.println(temp1.name+ "  "+ temp1.id+"  "+temp1.colleges);
        }
        System.out.println("****************");

        //LinkdinHashset maintain the insertion order
        LinkedHashSet<StudentHashsetEx2> s3  = new LinkedHashSet<>();
        s3.add(x1);
        s3.add(y1);
        s3.add(z1);
        s3.add(z1);
        s3.add(z11);
        for(StudentHashsetEx2 temp2:s3){
            System.out.println(temp2.name+ "  "+ temp2.id+"  "+temp2.colleges);


            //treeHashset

            TreeSet<String> tr = new TreeSet<>();
            tr.add("ravi");
            tr.add("ravi");
            tr.add("ravindra");
            tr.add("shashi");
            tr.add("shashi");
            tr.add("shashi");
            System.out.println(tr);

        }


    }
}
