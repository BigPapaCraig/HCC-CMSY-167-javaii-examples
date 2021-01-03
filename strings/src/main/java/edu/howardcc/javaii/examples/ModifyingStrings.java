package edu.howardcc.javaii.examples;

public class ModifyingStrings {

    public static void main(String[] args) {

        // Create a String variable and assign it to a literal value
        String yes = "You say yes, ";
        String no = "I say no.";
        String stop = " You say stop, ";
        String go = "But I say go, go, go!";

        System.out.printf("substring: %s\n", yes.substring(4, 11));
        System.out.printf("concat: %s\n", yes.concat(no).concat(stop).concat(go));
        System.out.printf("toUpperCase: %s\n", yes.toUpperCase());
        System.out.printf("toLowerCase: %s\n", no.toLowerCase());
        System.out.printf("stop:\t|%s|\n", stop);
        System.out.printf("trim:\t|%s|\n", stop.trim());
        System.out.printf("replace: %s\n", go.replace("go", "stop"));

    }
}
