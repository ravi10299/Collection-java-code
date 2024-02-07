package String.java;

public class StringBufferEx2 {
    public static void main(String[] args)
    {
        // StringBuffer class is used to create mutable strings
        StringBuffer s1 =  new StringBuffer("ravikumarverma");
        s1.insert(11,"wt");
        System.out.println(s1);
        s1.delete(6, 11);
        System.out.println("After deleting: " + s1);
        s1.append(" Class");
        System.out.println("s1 refers to " + s1);
    }
}

