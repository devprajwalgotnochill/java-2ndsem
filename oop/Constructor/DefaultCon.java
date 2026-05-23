
class StudentInfo {
    String name;
    int id;
    StudentInfo(){
        System.out.println("No paramater in default constructor");
    }
}
  
public class DefaultCon {
    public static void main(String[] args) {
        new StudentInfo();
    }
}
