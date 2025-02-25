import java.util.HashSet;
import java.util.List;

public class HashSetEx2 {
    public static void main(String[] args) {
        //wrraper clsss
        HashSet<InnerHashSetEx2> mySet  = new HashSet<>(List.of(new InnerHashSetEx2("A",1),new InnerHashSetEx2("B",2),new InnerHashSetEx2("C",3)));
    

        //lambda expration
        System.out.println("lambda expration");
        mySet.forEach((i) -> System.out.println(i.id + " = "+i.name));

        //for each loop
        System.out.println("for each loop");
        for(InnerHashSetEx2 i : mySet){
            System.out.println(i.id + " = "+i.name);
        }
    
    
    }
}



class InnerHashSetEx2 {
    String name;
    int id;
    public InnerHashSetEx2(String name,int id){
        this.id = id;
        this.name = name;
    }



    
}
