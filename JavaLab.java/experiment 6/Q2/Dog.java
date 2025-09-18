// Dog.java
// Q2. 

class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

interface Pet {
    void play();
}

interface Trainable {
    void train();
}

public class Dog extends Animal implements Pet, Trainable {
    Dog() {
        super(); // call Animal constructor
        System.out.println("Dog constructor called");
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog loves to play fetch");
    }

    @Override
    public void train() {
        System.out.println("Dog is being trained");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();   // Overridden method
        d.play();    // Interface method
        d.train();   // Interface method
    }
}
