package edu.howardcc.javaii.examples.interfaces;

/**
 * Implementation of Greeter that uses a StringBuilder
 */
public class StringBuilderGreeter implements Greeter {

    @Override
    public String greet(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ");
        stringBuilder.append(name);
        stringBuilder.append("!");
        return  stringBuilder.toString();
    }

}
