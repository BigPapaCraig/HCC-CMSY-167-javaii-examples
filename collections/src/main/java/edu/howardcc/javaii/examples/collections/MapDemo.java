package edu.howardcc.javaii.examples.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrate using a Map
 */
public class MapDemo {

    public static void main(String[] args) {

        // Create and populate a map
        Map<String, String> courses = new HashMap<>();

        courses.put("CMSY-128", "Introduction to HTML");
        courses.put("CMSY-141", "Computer Science I");
        courses.put("CMSY-166", "Java I");
        courses.put("CMSY-167", "Java II");
        courses.put("CMSY-171", "Computer Science I");

        // Print the whole map
        System.out.printf("courses:%s\n", courses);

        // Retrieve specific entries
        System.out.printf("courses.get(\"CMSY-167\"): %s\n", courses.get("CMSY-167"));
        System.out.printf("courses.get(\"CMSY-171\"): %s\n", courses.get("CMSY-171"));

        // Try to retrieve something that isn't there
        System.out.printf("courses.get(\"CMSY-99\"): %s\n", courses.get("CMSY-99"));

    }

}
