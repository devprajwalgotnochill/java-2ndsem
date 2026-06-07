package constructor;
class Student{
    String name;
    int id;

    Student(String name){
        System.out.println("Name :"+name);

    }

    Student(String name,int id){
        System.out.println("Name :" + name);
        System.out.println("ID :" + id);

    }

    Student(int id){
        System.out.println("Id :" +id);
    }
}

public class ConstroctorOverloading {
    public static void main(String[] args) {

        Student s1 = new Student("Prajwal");

        Student s2 = new Student("Prajwal" ,123);

        Student s3 = new Student(123);
    }
    
}