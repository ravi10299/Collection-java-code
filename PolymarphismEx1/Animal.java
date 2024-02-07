package PolymarphismEx1;

//parent class
public class Animal {
    public void SoundAnimal(){
        System.out.println("Animal is sound is .......");
    }
}
//subclass1
class Dogs extends Animal{
    @Override
    public void SoundAnimal() {
        super.SoundAnimal(); // the super key word is used to call to parent methods
        System.out.println("the dogs is the barking ,,,,,");
    }
}
//subclass2
class Cat extends Animal {
    @Override
    public void SoundAnimal() {
        super.SoundAnimal();
        System.out.println("the cat is meow meow...");
    }
}
class Display{
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        Cat c1 = new Cat();
//        d1.SoundAnimal();
        c1.SoundAnimal();
    }
}