package edu.howardcc.javaii.examples;

public class ComparingStrings {

    public static void main(String[] args) {

        System.out.println("Comparing Strings with equals:\n");
        String string = new String("I am a String!");
        String different = new String("I am a different string!");
        String same = new String("I am a String!");

        System.out.printf("\"%s\".equals(\"%s\"): %s\n", string, same,
                string.equals(same));
        System.out.printf("\"%s\".equals(\"%s\"): %s\n", string, different,
                string.equals(different));

        System.out.printf("\"%s\" == \"%s\": %s\n", string, same,
                string == same);

        String capString = new String("I AM A STRING!");
        System.out.printf("\"%s\".equals(\"%s\"): %s\n", string, capString,
                string.equals(capString));
        System.out.printf("\"%s\".equalsIgnoreCase(\"%s\"): %s\n", string, capString,
                string.equalsIgnoreCase(capString));

        System.out.println("\nComparing Strings with compareTo:\n");
        System.out.printf("\"cat\".compareTo(\"dog\"): %d\n", "cat".compareTo("dog"));
        System.out.printf("\"cat\".compareTo(\"cat\"): %d\n", "cat".compareTo("cat"));
        System.out.printf("\"dog\".compareTo(\"cat\"): %d\n", "dog".compareTo("cat"));

        System.out.println("\nModifying a String:\n");
        System.out.printf("\"cat\".compareTo(\"dog\"): %d\n", "cat".compareTo("dog"));




    }
}
