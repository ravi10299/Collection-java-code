public class Main {
    static int   fuctorial(int n){
        if(n==1){
            return 1;
        }
        int fuct = 1;
         return  fuct = n*fuctorial(n-1);

    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        natural s1 = new natural();
        s1.sum(10);

//        int n =5;
//        int fuct = 1;
//        for(int i=1;i<=n;i++){
//            fuct  = fuct*i;
//        }
//        System.out.println(fuct);
        System.out.println(fuctorial(5));



        natural1 s2 = new natural1();
        System.out.println( s2.sum1(10));


    }
}
class natural{
    public void sum(int n){
        int sum = 0;
        for (int i=1;i<=n;i++){
           sum  =sum+i;
        }
        System.out.println(sum);
    }
}


class natural1{
    public int sum1(int n){
        int sum = 1;
        if(n==0){
            return 0;

        }
        sum = n+sum1(n-1);
        return sum;
    }
}