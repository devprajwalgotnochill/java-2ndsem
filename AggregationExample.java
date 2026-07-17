class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("Empluyee Name: " + name);
    }
}

class Department {

    String departmentName;
    Employee employee; //aggregation

    Department(String departmentName, Employee employee) {
        this.departmentName = departmentName;
        this.employee = employee;
    }

    void displayDepartment() { 
        System.out.println("Department: " + departmentName);
        employee.displayEmployee();
    }
}

/**
 * AggregationExample
 */
public class AggregationExample {

    public static void main(String[] args) {
        Employee emp = new Employee("Prajwal");

        Department dept = new Department("IT", emp);

        dept.displayDepartment();

        System.out.println("\nEmp still exist:");
        emp.displayEmployee();
    }
}
