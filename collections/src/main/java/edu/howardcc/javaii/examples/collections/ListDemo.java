package edu.howardcc.javaii.examples.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrate some basic operations on a List
 */
public class ListDemo {

    public static void main(String[] args) {

        // Create and populate a List
        List<String> authors = new ArrayList<>(List.of("Larson", "Tolkien", "Dubner", "Rothfuss", "Gaiman", "Rowling"));

        // Print some info about the List
        System.out.println("Contents:" + authors);
        System.out.println("Size: " + authors.size());
        System.out.println("First element: " + authors.get(0));
        System.out.println("Fourth element: " + authors.get(3));
        System.out.println("Index of \"Dubner\": " + authors.indexOf("Dubner"));

        // Remove an element
        System.out.println("\nRemoving \"Rothfuss\"");
        authors.remove("Rothfuss");
        System.out.println("Contents:" + authors);
        System.out.println("Size: " + authors.size());

        // Clear the list (remove everything)
        System.out.println("\nClearing the list");
        authors.clear();
        System.out.println("Contents:" + authors);
        System.out.println("Size: " + authors.size());
    }

}
