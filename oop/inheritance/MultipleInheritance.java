/*
Java does not support multiple inheritances with classes
 */
// it can be achieved using interface
//
//

public interface Father {
    void showFather();
}

public interface Mother {
    void showMother();
}

public class Child implements Father, Mother {

    public void showFather() {
        System.out.println("FAther");
    }

    public void showMother() {
        System.out.println("MOther");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        Child c = new Child();
        c.showFather();
        c.showMother();
    }
}
