
/*A default constructor has no parameters.
It’s used to assign default values to an object.
If no constructor is explicitly defined,
Java provides a default constructor. */ 

class DefaultConstructor{

    // Default Constructor
    DefaultConstructor(){
        
        System.out.println("Default constructor"); 
        
    }
    public static void main(String[] args){
        
        DefaultConstructor hello = new DefaultConstructor();
    }
}