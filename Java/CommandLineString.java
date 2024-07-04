public class CommandLineString {
    public static void main(String[] args) {
       
        String string = args[0];

        
        int length = string.length();

        
        System.out.println("Length of the string is: " + length);

       
        System.out.println("Content of the string character by character:");
        for (int i = 0; i < length; i++) {
            System.out.println(string.charAt(i));
        }

       
        StringBuilder convertedString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = string.charAt(i);
            if (Character.isLowerCase(c)) {
                convertedString.append(Character.toUpperCase(c));
            } else {
                convertedString.append(Character.toLowerCase(c));
            }
        }

       
        System.out.println("Converted string: " + convertedString);
    }
}

