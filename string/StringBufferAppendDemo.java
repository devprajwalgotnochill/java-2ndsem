public class StringBufferAppendDemo {
    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("Java");
        sb.append("Programming");
        sb.append("Language");
        sb.append("Tutorial");

        System.out.println("Result: "+ sb.toString());

    }
}
