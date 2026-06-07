package constructor;
/*
A constructor in Java is a special member that is called when an object is created. It initializes the new object’s state. It is used to set default or user-defined values for the object's attributes

A constructor has the same name as the class.
It does not have a return type, not even void.
It can accept parameters to initialize object properties.
*/

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


public class Constructor{
    public static void main(String[] args) {
        Example ex = new Example("Prajwal", 12);
        ex.display();
    }

}