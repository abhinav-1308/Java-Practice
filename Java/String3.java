import java.util.Scanner;

public class String3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Enter the string ");
        str = sc.next();
        System.out.println("The Lenght Of string is " + str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        String convertedString = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                convertedString += Character.toUpperCase(currentChar);
            } else {
                convertedString += Character.toLowerCase(currentChar);
            }
        }
        
        System.out.println("Converted str: " + convertedString);

    }
}
