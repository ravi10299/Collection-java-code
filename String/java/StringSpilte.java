package String.java;

public class StringSpilte {
    public static void main(String[] args) {
//        String name = "ravi kumar verma";
//        System.out.println(name.length());
//        String [] str = name.split(" ");//split method
//        System.out.println(str[0]);
//        System.out.println(str[1]);
//        System.out.println(str[2]);
//
//        for (int i = str.length-1;i>=0;i--){
//            System.out.print(str[i] +" ");
//        }
//        System.out.println();
//        for (int i = 0;i<name.length();i++){
//            System.out.print(name.charAt(i)+" ");
//        }


        String name = "ravi kumar verma";
        String str[]  = name.split(" ");
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);

        for(int i= 0;i<str.length;i++){
            System.out.print(str[i]);
        }
        System.out.println("");
        String name1 = String.join("",str);
        for(int i=0;i< name1.length();i++){
            System.out.print(name1.charAt(i)+"  ");
        }
    }
}
