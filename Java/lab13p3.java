/*Write a program in java to take two strings from user and check whether one string is
present in the other string */

import java.util.Scanner;

public class lab13p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in the two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the first string is present in the second string
        if (str2.contains(str1)) {
            System.out.println(str1 + " is present in " + str2);
        } else {
            System.out.println(str1 + " is not present in " + str2);
        }

        scanner.close();
    }
}

