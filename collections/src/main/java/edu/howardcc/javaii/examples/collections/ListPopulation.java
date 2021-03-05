package edu.howardcc.javaii.examples.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Demonstrate different ways of populating a list
 */
public class ListPopulation {

    public static void main(String[] args) {

        System.out.println("Create mutable list and add elements: " + createListAndAddElements());
        System.out.println("Create immutable list with Arrays.asList(): " + createListWithArraysAsList());
        System.out.println("Create immutable list with List.of(): " + createListWithListOf());
        System.out.println("Create mutable list with List.of(): " + createMutableListWithListOf());

    }

    /**
     * Create a new list and populate it one element at a time
     */
    private static List<String> createListAndAddElements() {
        List<String> list = new ArrayList<>();
        list.add("Larson");
        list.add("Tolkien");
        list.add("Dubner");
        list.add("Rothfuss");
        return list;
    }

    /**
     * Create an immutable(not modifiable) list using Arrays.asList (JDK 8+)
     */
    private static List<String> createListWithArraysAsList() {
        List<String> list = Arrays.asList("Larson", "Tolkien", "Dubner", "Rothfuss");
        return list;
    }

    /**
     * Create an immutable(not modifiable) list using List.of (JDK 9+)
     */
    private static List<String> createListWithListOf() {
        List<String> list = List.of("Larson", "Tolkien", "Dubner", "Rothfuss");
        return list;
    }

    /**
     * Create an mutable(modifiable) list using List.of (JDK 9+)
     */
    private static List<String> createMutableListWithListOf() {
        List<String> list = new ArrayList<>(List.of("Larson", "Tolkien", "Dubner", "Rothfuss"));
        return list;
    }

}
