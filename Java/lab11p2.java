/*Write a Java program to illustrate multiple catch blocks- NegativeArraySizeException
 and ArrayIndexOutOfBoundsException with single try block. */

 public class lab11p2 {
    public static void main(String[] args) {
        try {
            // Example of NegativeArraySizeException
            int[] arr = new int[-5]; // Creating an array with negative size
            System.out.println("Statement will not be executed");

            // Example of ArrayIndexOutOfBoundsException
            arr[10] = 100; // Accessing index out of array bounds
            System.out.println("This statement will not be executed");
        } 
        catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
        catch (Exception e) { // Generic Exception catch block
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("Program execution completed");
    }
}


