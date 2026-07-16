class Animal {

    // compiletime polymorphism (Method overloading )
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void sound(String name) {
        System.out.println(name + "makes a sound");
    }
}

class Dog extends Animal {

    // Run-time polumorphism(Method overriding)
    @Override
    void sound(P) {
        System.out.println("dog barks");
    }
}
