class Employee {

    private int empId;
    private String department;

    public Employee(int empId, String department) {
        this.empId = empId;
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return true;

        Employee emp = (Employee) obj;

        return empId == emp.empId && department.equals(emp.department);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(empId);
        result = 31 * result + department.hashCode();
        return result;
    }
}

public class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "IT");
        Employee e2 = new Employee(102, "IT");
        Employee e3 = new Employee(101, "HR");

        System.out.println("e1 equal e2 " + e1.equals(e2));
        System.out.println("e1 Hash code " + e1.hashCode());
        System.out.println("e2 Hash code " + e1.hashCode());
        System.out.println();
        System.out.println("e1 equal e3 " + e1.equals(e3));
        System.out.println("e3 hashCode Code " + e3.hashCode());
    }
}
