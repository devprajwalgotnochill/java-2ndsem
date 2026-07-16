/**
 * Employee
 */
public class Employee {

    
    private String employee_post;
    private int employee_id;
    private int employee_salary;

    // default constructor
    public Employee() {
        first_name = "";
        last_name = "";
        employee_id = 0;
        employee_salary = 0;
    }

    // pararameter constructor
    public Employee(
        String firstName,
        String lastName,
        String employeePost,
        int employeeId,
        int employeeSalary
    ) {
        this.first_name = firstName;
        this.last_name = lastName;
        this.employee_post = employeePost;
        this.employee_id = employeeId;
        this.employee_salary = employeeSalary;
    }

    // getter

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getEmployeePost() {
        return employee_post;
    }

    public int getEmployeeId() {
        return employee_id;
    }

    public int EmployeeSalary() {
        return employee_salary;
    }

    // setter
    //
    public void setFirstName(String FirstName) {
        this.first_name = FirstName;
    }

    public void setLastName(String LastName) {
        this.last_name = LastName;
    }

    public void setEmployeePost(String EmployeePost) {
        this.employee_post = EmployeePost;
    }

    public void setEmployeeId(int EmployeeId) {
        this.employee_id = EmployeeId;
    }

    public void set(int EmployeeSalary) {
        this.employee_salary = EmployeeSalary;
    }

    public void display() {
        System.out.println("FirstName           : " + first_name);
        System.out.println("LastName            : " + last_name);
        System.out.println("EmployeePost        : " + employee_post);
        System.out.println("EmployeeId          : " + employee_id);
        System.out.println("EmployeeSalary      : " + employee_salary);
        System.out.println();
    }
}
