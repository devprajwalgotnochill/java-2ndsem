package oop;

class Student{
    int id;
    String name;
}

public class RefVariables {

    public static void main(String[] args) {

        // init of variable through refrence 
        Student s1 = new Student();
        s1.id = 2323;
        s1.name = "Prajwal";

        System.out.println(s1.id +" "+s1.name);
    }
}
