/*Write a program to swap two string variables without using third variable*/

public class lab13p4 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping: str1 = " + str1 + ", str2 = " + str2);

        // Swap the strings without using a third variable
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);
    }
}
