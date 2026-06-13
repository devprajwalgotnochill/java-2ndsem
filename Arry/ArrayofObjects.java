class Student {

    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

public class ArrayofObjects {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 101);
        students[1] = new Student("Bob", 102);
        students[2] = new Student("Charlie", 103);

        for (int i = 0; i < students.length; i++) {
            students[i].display();
            System.out.println();
        }
    }
}
