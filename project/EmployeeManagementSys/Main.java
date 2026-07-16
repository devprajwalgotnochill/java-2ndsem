/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(
            "Prajwal",
            "Gharti",
            "SoftwareEng",
            9982,
            25000
        );

        e1.display();
        e2.display();
    }
}
