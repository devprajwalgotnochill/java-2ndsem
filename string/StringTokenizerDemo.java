import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sntence: ");

        String sentence = sc.nextLine();

        int count = 0;

        StringTokenizer st = new StringTokenizer(sentence);

        // int count = st.countTokens();

        while (st.hasMoreElements()) {
            String word = st.nextToken();
            count++;
            System.out.println(word);
        }

        System.out.println("Total Words: "+ count);
        sc.close();
    }    
}
