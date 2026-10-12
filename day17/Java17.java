package day17;

sealed class Animal permits Dog, Cat, Mammals{
    void sound(){
        System.out.println("Animal sound");
    }
}

final class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

final class Cat extends Animal{
    void sound(){
        System.out.println("Cat meow");
    }
}

// final class Monkey  extends Animal{
    // not allowed becauze animal doesn't allow Monkey to inherit it
// }

non-sealed class Mammals extends Animal{
    void sound(){
        System.out.println("Mammals sound");
    }
}

class Human extends Mammals{
    
}

public class Java17 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();

        Human h = new Human();
        h.sound();


    }
}
