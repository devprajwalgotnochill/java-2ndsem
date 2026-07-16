public class CheckedExceptionDemo {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("my_secrets.txt");
            System.out.println("File opened successfully!");
            file.close();
        } catch (FileNotFoundException e) {
            //
            System.out.println(
                "Error: The file could not be found. Please check the path."
            );
        } catch (IOException e) {
            System.out.println("Error: Something went wrong.");
        }
    }
}
