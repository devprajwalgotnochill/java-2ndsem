class Student {

    private String name;
    private int lcid;
    private int year;
    private double gpa;

    // Parameterized constructor
    Student(String name, int lcid, int year, double gpa) {
        this.name = name;
        this.lcid = lcid;
        this.year = year;
        this.gpa = gpa;
    }

    // Default constructor
    Student() {
        this.name = "Unknown";
        this.lcid = 0;
        this.year = 1;
        this.gpa = 0.0;
    }

    // Getters
    String getName() {
        return name;
    }

    int getLcid() {
        return lcid;
    }

    int getYear() {
        return year;
    }

    double getGpa() {
        return gpa;
    }

    // Setters
    void setName(String name) {
        this.name = name;
    }

    void setLcid(int lcid) {
        this.lcid = lcid;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Display method
    void displayInfo() {
        System.out.println(
            "Name: " +
                name +
                ", LCID: " +
                lcid +
                ", Year: " +
                year +
                ", GPA: " +
                gpa
        );
    }
}

public class StudentDemo {

    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Prajwal", 1001, 2, 3.8);
        students[1] = new Student("Rahul", 1002, 3, 3.5);
        students[2] = new Student("Sangam", 1003, 1, 3.2);
        students[3] = new Student("Rojan", 1004, 2, 3.9);
        students[4] = new Student(); // uses default constructor

        System.out.println("Student Records:");
        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }
    }
}
