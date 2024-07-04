/*Write a program to determine whether a given string is palindrome or not.*/

import java.util.Scanner;

public class lab13p1 {
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase and remove spaces
        str = str.toLowerCase().replaceAll(" ", "");
        // Reverse the string
        String reversedStr = new StringBuilder(str).reverse().toString();
        // Check if the string is equal to its reverse
        if (str.equals(reversedStr)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        scanner.close();
    }
}
