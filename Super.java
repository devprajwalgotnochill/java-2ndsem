class Base{
    String name;
    int id;
Base(){
        System.out.println("Base class default constructor called");
    }

    Base(String name, int id){
        this();
        System.out.println("Name: " + name + ", ID: " + id);
        
    }
    
}

public class Super extends Base{

    Super(){
        super();
        System.out.println("Derived class default constructor called");
    }

    Super(String name, int id){
        super(name, id);
        System.out.println("Derived class constructor called");
    }
    public static void main(String[] args) {
        Super obj1 = new Super();
        Super obj2 = new Super("Prajwal", 123);

        System.out.println("prawal is a good boy");
    }
}