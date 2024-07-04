import java.util.Scanner;

public class last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        
        int indexDiff = str1.indexOf(str2) - str2.indexOf(str1);

        
        System.out.println("Position difference between the two strings: " + Math.abs(indexDiff));
    }
}
