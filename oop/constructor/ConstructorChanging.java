package constructor;

public class ConstructorChanging {
    public static void main(String[] args) {
        new Student();
    }
}
 
class Student {
    String name;
    int id;

    Student(){
        this(123);
        System.out.println("Default");
    }

    Student(String name,int id){
        System.out.println("Name :" + name);
        System.out.println("ID :" + id);

    }

    Student(int id){
        this("Prajwal" ,123);
        System.out.println("Id ");
    }
}
