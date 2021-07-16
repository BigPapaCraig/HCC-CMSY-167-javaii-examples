package edu.howardcc.javaii.examples.generics.wildcards;

import edu.howardcc.javaii.examples.generics.generic.Box;

/**
 * Demonstrate using the WildcardBoxUnwrapper class
 */
public class WildcardBoxUnwrapperDemo {

    public static void main(String[] args) {

        // Put an Integer into an Integer box
        Box<Integer> integerBox = new Box<>();
        integerBox.set(5);

        // Unwrap the Box<Integer> with a WildcardBoxUnwrapper<Number>
        WildcardBoxUnwrapper<Number> numberBoxUnwrapper = new WildcardBoxUnwrapper<>();
        Number number =  numberBoxUnwrapper.unwrap(integerBox);
        System.out.printf("Unwrapped a Number: %s\n", number);

    }

}
