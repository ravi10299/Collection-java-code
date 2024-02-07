package String.java;

public class StringBuilder {
    public static void main(String[] args) {
        String name = "java"; //litral initialisation
        name.concat("core");
//        name ---> java
//                  javacore  | because not initialisation of reference variable
//
        System.out.println(name); // output is the only java

        java.lang.StringBuilder s1 = new java.lang.StringBuilder("ravi");
        s1.append("verma");
        System.out.println(s1);

        java.lang.StringBuilder s2 = new java.lang.StringBuilder("ravi");
        s2.append("kumar");
        System.out.println(s2);

    }
}
