package edu.howardcc.javaii.examples.interfaces;

/**
 * Demonstrate using an interface with several different implementations
 */
public class GreeterDemo {

    public static void main(String[] args) {

        // Create an array and fill it with three different implementations of Greeter
        Greeter[] greeters = new Greeter[3];
        greeters[0] = new SimpleGreeter();
        greeters[1] = new StringBuilderGreeter();
        greeters[2] = new FormatterGreeter();

        // Loop through the array and call the greet method
        for (int i = 0; i < greeters.length; i++) {
            // Different implementations all used in the same way and produce the same result
            Greeter currentGreeter = greeters[i];
            System.out.println(currentGreeter.greet("Chris"));
        }

    }

}
