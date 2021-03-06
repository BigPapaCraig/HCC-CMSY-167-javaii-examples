package edu.howardcc.javaii.examples.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Demonstrate working with Sets
 */
public class SetDemo {

    public static void main(String[] args) {

        // Create and populate set
        Set<String> states = new HashSet<>();
        states.add("Maryland");
        states.add("Pennsylvania");
        states.add("Virginia");
        states.add("Delaware");
        states.add("West Virginia");
        states.add("New York");
        System.out.printf("states: %s\n", states);

        // Add duplicates - no effect!
        states.add("Maryland");
        states.add("Pennsylvania");
        System.out.printf("states: %s\n", states);

    }

}
