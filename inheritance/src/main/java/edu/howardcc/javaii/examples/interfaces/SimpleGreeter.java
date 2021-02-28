package edu.howardcc.javaii.examples.interfaces;

/**
 * Implementation of Greeter that uses simple String concatenation
 */
public class SimpleGreeter implements Greeter {

    @Override
    public String greet(String name) {
        return "Hello " + name + "!";
    }

}
