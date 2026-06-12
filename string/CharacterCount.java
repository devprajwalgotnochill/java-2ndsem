import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String str = sc.nextLine();
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;

        for (int i =0 ;i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                upper++;
            }
            if(Character.isLowerCase(ch)){
                lower++;
            }if(Character.isDigit(ch)){
                digit++;
            }if(Character.isWhitespace(ch)){
                special++;
            }
        }
        System.out.println("Uppercase letter :"+upper);
        System.out.println("Lowercase letter :"+lower);
        System.out.println("Digits: "+digit);
        System.out.println("Special Character: "+special);

        sc.close();
    }

}
