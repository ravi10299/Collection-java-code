package String.java;

public class StringSpacing {
    public static void main(String[] args) {
        String name = "ravi kumar verma ";
        String [] str = name.split(" ");
        String name1 = String.join("", str);
        System.out.println(name1);
        System.out.println(name1.length());
        for (int i =0;i<name1.length();i++){
            System.out.print(name1.charAt(i)+ " ");
        }

    }
}
