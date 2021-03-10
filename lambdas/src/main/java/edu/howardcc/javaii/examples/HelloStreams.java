package edu.howardcc.javaii.examples;

import java.util.stream.Stream;

/**
 * Demonstrates basic stream operations
 */
public class HelloStreams {

    public static void main(String[] args) {

        // Double each element in a stream and print it
        System.out.println("Doubling Stream:");
        Stream.of(5,5,5,5,5,5,5,5).map(x -> x * 2).forEach(System.out::println);

        // Drop each element that is smaller than 5 and add one, then print it
        System.out.println("Filter and Add One Stream:");
        Stream.of(6,5,4,3,6,5,4,3,6,5,4,3,6,5,4,3).filter(x -> x < 5).map(x -> x + 1).forEach(System.out::println);

    }

}
