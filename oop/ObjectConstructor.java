package oop;

class Example{
    String name;
    int id;

    // constructor
    Example(String name , int id){
        this.id = id;
        this.name = name;
    }

    // method
    void display(){
        System.out.println("Name "+name+" ID: "+id);
    }
}


public class ObjectConstructor{
    public static void main(String[] args) {
        Example ex = new Example("Prajwal", 12);
        ex.display();
    }

}