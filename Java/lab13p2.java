/*Write a program in java to perform following operations on two user entered strings -
1. Append one string with another string.
2. Replace one part of the string with another string.
3. Modify the string by replacing one character with another.
4. Insert one string into another string.
 */
import java.util.Scanner;

public class lab13p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in the two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // 1. Append one string with another string
        String concatenatedString = str1.concat(str2);
        System.out.println("Concatenated string: " + concatenatedString);

        // 2. Replace one part of the string with another string
        System.out.print("Enter the part of the first string to be replaced: ");
        String toReplace = scanner.nextLine();
        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();
        String replacedString = str1.replace(toReplace, replacement);
        System.out.println("Replaced string: " + replacedString);

        // 3. Modify the string by replacing one character with another
        System.out.print("Enter the character to replace: ");
        char toReplaceChar = scanner.nextLine().charAt(0);
        System.out.print("Enter the replacement character: ");
        char replacementChar = scanner.nextLine().charAt(0);
        String modifiedString = str1.replace(toReplaceChar, replacementChar);
        System.out.println("Modified string: " + modifiedString);

        // 4. Insert one string into another string
        System.out.print("Enter the index where the second string should be inserted: ");
        int index = scanner.nextInt();
        String insertedString = new StringBuilder(str1).insert(index, str2).toString();
        System.out.println("Inserted string: " + insertedString);

        scanner.close();
    }
}
