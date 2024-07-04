/*Write a Java program to generate an ArrayIndexOutOfBoundsException and
 handle it using catch statement.*/

 public class lab11p3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        try {
            // Trying to access an index outside of the array
            int num = arr[10];
        } catch(ArrayIndexOutOfBoundsException e) {
            // Catching the exception and printing the error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}

