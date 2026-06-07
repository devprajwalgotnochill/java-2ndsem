
/*A default constructor has no parameters.
It’s used to assign default values to an object.
If no constructor is explicitly defined,
Java provides a default constructor. */ 

class Geeks{

    // Default Constructor
    Geeks(){
        
        System.out.println("Default constructor"); 
        
    }
    public static void main(String[] args){
        
        Geeks hello = new Geeks();
    }
}