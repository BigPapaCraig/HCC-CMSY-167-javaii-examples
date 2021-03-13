package edu.howardcc.javaii.examples;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Add demo of the flatMap operation
 */
public class FlatMapDemo {

    public static void main(String[] args) {

        // Split each string into individual words with flatMap
        Stream.of("one fish", "two fish", "red fish", "blue fish")
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .forEach(System.out::println);

    }

}
