public record StringImmutabilityDemo() {
    public static void main(String[] args) {
        
        String str = "Prajwal"; //store in SCP


        System.out.println("Org String :" +str);
        System.out.println("Memory address before :"+ System.identityHashCode(str));

        //attemt to modify
        str.concat("Gharti");
       
   
        System.out.println("\nAfter concat() without assignment: ");
        System.out.println("String "+ str);
        System.out.println("Memory adress :" +System.identityHashCode(str));

        //Assigment the resut to str
        str = str.concat("Gharti");

        System.out.println("\nAfter concat() without assignment: ");
        System.out.println("String "+ str);e
        System.out.println("Memory adress :" +System.identityHashCode(str));
    }
    
}
