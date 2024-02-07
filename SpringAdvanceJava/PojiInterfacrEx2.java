package SpringAdvanceJava;
//poji interface
public interface PojiInterfacrEx2 {
    void AnimalSound();//java Abstract methods........

}
class Dogs implements PojiInterfacrEx2{
    @Override
    public void AnimalSound() {
        System.out.println("the dog is the barking......");
    }
}
class Cat implements PojiInterfacrEx2{

    @Override
    public void AnimalSound() {
        System.out.println("the cat is Meow Meow.....");
    }

}
class Cow implements PojiInterfacrEx2{
    public void AnimalSound(){
        System.out.println("the cow is the sound .......");
    }
}
class Display{
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.AnimalSound();
        Cat c1 = new Cat();
        c1.AnimalSound();
        Cow w1 = new Cow();
        w1.AnimalSound();
    }
}
