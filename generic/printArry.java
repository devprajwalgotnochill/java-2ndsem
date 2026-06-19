public class printArry {

    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4 };
        String[] strArray = { "hello", "world" };
        Double[] douArray = { 1.12, 3.14, 2.22 };

        printArray(intArray);
        printArray(strArray);
        printArray(douArray);
    }
}
