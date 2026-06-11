
public class ParameterizedConstructor { 
    public static void main(String[] args) {
        StudentID s1  = new StudentID("Prajwal", 12);
    }
}

class StudentID{

    StudentID(String name , int id){
        System.out.println("Name :" + name);
        System.out.println("Name :" + id);
    }

}