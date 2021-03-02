package edu.howardcc.javaii.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates using the static Collections methods
 */
public class CollectionsDemo {

    public static void main(String[] args) {

        // Populate a list
        List<String> authors = new ArrayList<>(List.of("Larson", "Tolkien", "Dubner", "Rothfuss", "Gaiman", "Rowling"));
        System.out.printf("Original List: %s\n", authors);

        // Sort the list (Alphabetically)
        Collections.sort(authors);
        System.out.printf("Sorted List: %s\n", authors);

        // Reverse the list
        Collections.reverse(authors);
        System.out.printf("Reversed List: %s\n", authors);

        // Shuffle the list
        Collections.shuffle(authors);
        System.out.printf("Shuffled List: %s\n", authors);

        // Find the first author alphabetically with min
        System.out.printf("First author(min): %s\n", Collections.min(authors));
        // Find the last author alphabetically with max
        System.out.printf("Last author(max): %s\n", Collections.max(authors));

        // Replace all the elements of the list
        Collections.fill(authors, "Howey");
        System.out.printf("Filled List: %s\n", authors);

    }
}
