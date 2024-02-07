package GarvageColletors;

public class GarvageObject {
    public static void main(String[] args) {
        String name1  = new String("ravi");
        String name2 = new String("kumar");
        //print the  name1 and name2 values...
        System.out.println(name1+"   "+  name2);

        System.out.println(name1.hashCode()+ "  "+ name2.hashCode());
        name1 = name2;
        System.out.println(name1);

        System.out.println(name1.hashCode()+ "  "+ name2.hashCode());


    }
}
