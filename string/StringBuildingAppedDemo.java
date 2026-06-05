public class StringBuildingAppedDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
    
        sb.append("Java");
        sb.append("Programming");
        sb.append("Language");
        sb.append("Tutorial");

        System.out.println("Result: "+ sb.toString());
    }
}
