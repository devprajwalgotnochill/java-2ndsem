
package oop;

class Student{

    int id ;
    String name;

    void insertData(int id ,String name){
        this.id = id;
        this.name = name;
    }

    void Display(){
        System.out.println(id + " " + name);
    }
}

public class MethodVariable {

    public static void main(String[] args) {

        // init of variable through refrence 
        Student s1 = new Student();
        s1.insertData(12,"Prajwal");
        s1.Display();
         
    }
}
