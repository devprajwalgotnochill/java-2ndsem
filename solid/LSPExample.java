class Bird {

    void fly() {
        System.out.println("Bird Flying");
    }
}

class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow Flying");
    }
}

/**
 * LSPExample
 */
public class LSPExample {

    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.fly();
    }
}
