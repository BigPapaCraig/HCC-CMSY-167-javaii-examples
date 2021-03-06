package edu.howardcc.javaii.examples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrate creating special wrapped lists
 */
public class ListWrappers {

    public static void main(String[] args) {

        // Create and populate a List
        List<String> list = new ArrayList<>(List.of("Larson", "Tolkien", "Dubner", "Rothfuss", "Gaiman", "Rowling"));

        // Now we're thread-safe!
        List<String> synchronizedList = Collections.synchronizedList(list);

        // Modifying this will throw an exception!
        List<String> unmodifiableList = Collections.unmodifiableList(list);

    }

}
