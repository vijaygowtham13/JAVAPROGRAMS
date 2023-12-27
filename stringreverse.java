

//we are reversing using  reverse() method using StringBuilderclass 
public class stringreverse{

    public static void main(String[] args) {
        // Example string
        String originalString = "Hello, World!";

        // Reversing the string using StringBuilder
        String reversedString = reverseString(originalString);

        // Displaying the original and reversed strings
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    // Method to reverse a string using StringBuilder
    private static String reverseString(String str) {
        // Convert the string to a StringBuilder
        StringBuilder s = new StringBuilder(str);

        // Use the reverse() method of the StringBuilder class
        s.reverse();

        // Convert the StringBuilder back to a string
        return s.toString();
    }
}
