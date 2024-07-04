public class TokenizeString {
    public static void main(String[] args) {
        
        String s1 = "kiit university";

        
        String[] words = s1.split(" ");

       
        System.out.println("The words in the string are:");
        for (String word : words) {
            System.out.println(word);
        }

       
        String s2 = words[0];
        String s3 = words[1];

        
        System.out.println("New string s2: " + s2);
        System.out.println("New string s3: " + s3);
    }
}