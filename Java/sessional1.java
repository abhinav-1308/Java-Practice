/* two string from user - one cmd other key broard .position difference amongst character among these two string
*/
public class sessional1 {
    
    import java.util.Scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Calculate the position difference
        int indexDiff = str1.indexOf(str2) - str2.indexOf(str1);

        // Output the position difference
        System.out.println("Position difference between the two strings: " + Math.abs(indexDiff));
    }
}

}
