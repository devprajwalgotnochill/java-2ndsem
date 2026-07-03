abstract class Empolyee {

    protected int empID;
    protected String name;
    protected double salary;

    // constructor
    Empolyee(int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    // abstract method
    abstract void displayDetails();
}

interface Bonus {
    void calculateBonus();
}

// manager class
class Manager extends Empolyee implements Bonus {

    Manager(int empID, String name, double salary) {
        super(empID, name, salary);
    }

    // Implementing
    @Override
    void displayDetails() {
        System.out.println("Employee ID:" + empID);
        System.out.println("Name :" + name);
        System.out.println("Salary :" + salary);
    }

    @Override
    public void calculateBonus() {
        double bonus = salary * 0.20; //20
        System.out.println("Bonus (20%) ; $" + bonus);
    }
}

// main class

public class EmployeeDemo {

    public static void main(String[] args) {
        Manager manager = new Manager(101, "Prajwal", 50000);

        manager.displayDetails();
        manager.calculateBonus();
    }
}
