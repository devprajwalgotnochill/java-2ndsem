class Person{
    String name;
    int age;

    // constructor
    Person(String name ,int age){
        this.name = name;
        this.age =age;
    }

    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
// child class
class Student extends Person{
    int rollNo;
    // constructor
    Student(String name,int age ,int rollNo){
        super(name , age);//calling parent class
        this.rollNo = rollNo;
    }
    // Method to display 
    void displayStudent(){
        displayPerson();
        System.out.println("Roll No : "+ rollNo);
    }

}

public class SingleInheritance {
    public static void main(String[] args) {
        Student s1 = new Student("prajwal", 19, 13);

        System.out.println("Student details: ");
        s1.displayStudent();

    }
}