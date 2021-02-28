package edu.howardcc.javaii.examples.interfaces;

/**
 * Implementation of Greeter that uses the String.format method
 */
public class FormatterGreeter implements Greeter {

    @Override
    public String greet(String name) {
        return String.format("Hello %s!", name);
    }

}
