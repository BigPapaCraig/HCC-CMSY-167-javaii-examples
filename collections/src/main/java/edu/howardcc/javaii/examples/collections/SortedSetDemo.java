package edu.howardcc.javaii.examples.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * Demonstrate working with Sorted Sets
 */
public class SortedSetDemo {

    public static void main(String[] args) {

        // Create and populate a TreeSet(which is a SortedSet)
        Set<String> states = new TreeSet<>();
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
