package edu.howardcc.javaii.examples.interfaces;

/**
 * Simple interface for greeting a person by name
 */
public interface Greeter {

    /**
     * Returns a greeting for a given name.
     * @param name The name of the person to be greeted.
     * @return A greeting in the following format: "Hello {name}!"
     */
    public String greet(String name);

}
