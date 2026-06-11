package constructor;

class Example {
    String name;
    int id;

    Example(String name, int id) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Name " + name + " ID: " + id);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Example ex = new Example("Prajwal", 12);
        ex.display();
    }
}