import java.util.LinkedHashSet;

public class LinkedHashSetEx4 {
    public static void main(String[] args) {
        LinkedHashSet<person> mySet = new LinkedHashSet<>();
        mySet.add(new person(1,"A"));
        mySet.add(new person(2,"B"));
        mySet.add(new person(2,"B"));
        mySet.add(new person(3,"C"));

        //lambda expration
           mySet.forEach((i) -> System.out.println(i.id + " = "+i.name)); 



    }
}

class person {
    String name;
    int id;
    public person(int id,String name){
        this.id = id;
        this.name = name;
    }

    
}
