package edu.howardcc.javaii.examples;

public class BasicStringDemo {

    public static void main(String[] args) {

        // Create a String variable and assign it to a literal value
        String quote = "Education is what remains after one has forgotten what one has learned in school.";
        System.out.printf("Quote: \"%s\"\n", quote);

        // Print the length of the  String
        int length = quote.length();
        System.out.printf("Length: %d\n", length);

        // Find the ninth character (index 8)
        char ninth = quote.charAt(8);
        System.out.printf("The ninth character is: %c\n", ninth);

        // Find the index of the first 'a'
        int firstAIndex = quote.indexOf('a');
        System.out.printf("The index of the first 'a' is: %d\n", firstAIndex);

        // Find the index of the first 'a'
        int lastAIndex = quote.lastIndexOf('a');
        System.out.printf("The index of the first 'a' is: %d\n", lastAIndex);

    }
}
