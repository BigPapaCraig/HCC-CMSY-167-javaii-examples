package edu.howardcc.javaii.examples;

import java.util.Random;

/**
 * Demonstrate generating random numbers with a stream
 */
public class RandomStreamDemo {

    public static void main(String[] args) {

        // Create an instance of Random
        Random random = new Random();

        // Generate 10 random integers between 100 and 999
        random.ints(100, 999).limit(10).forEach(System.out::println);

    }
}
