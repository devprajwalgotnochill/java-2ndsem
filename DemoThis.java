//this call another constructor of the same class that takes an int
class DemoThis {
    DemoThis() {
        this(10);
        System.out.println("No-arg constructor");
    }
    DemoThis(int a) {
        System.out.println("Parameterized constructor");
    }
    public static void main(String[] args) {
        new DemoThis();
    }
}
s