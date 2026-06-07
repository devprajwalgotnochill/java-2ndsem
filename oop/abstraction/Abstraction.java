package abstraction;
// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void makeSound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Concrete class
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog says Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Animal a = new Dog(); // Upcasting

        a.makeSound(); // Calls Dog's implementation
        a.sleep();     // Calls Animal's method
    }
}