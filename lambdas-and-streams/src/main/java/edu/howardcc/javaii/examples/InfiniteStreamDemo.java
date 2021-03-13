package edu.howardcc.javaii.examples;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Demonstrate creating an infinite stream
 */
public class InfiniteStreamDemo {

    public static void main(String[] args) {

        // Count by fives with an infinite stream
        System.out.println(Stream.iterate(5, i -> i + 5).limit(20).map(Object::toString)
                .collect(Collectors.joining(", ")));

    }

}
