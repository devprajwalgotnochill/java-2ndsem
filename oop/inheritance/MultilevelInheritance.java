class Animal{
    void eat(){
        System.out.println("Animal is eating.");
    }
}
// child class
class dog extends Animal{
    void bark(){
        System.out.println("Dog is barking.");
    }
}

// grand child class

class Puppy extends dog{
    void weep(){
        System.out.println("Puppy is weeping.");
    }
}

// mainclass
public class MultilevelInheritance{
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}