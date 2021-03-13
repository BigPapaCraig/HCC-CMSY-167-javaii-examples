package edu.howardcc.javaii.examples;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Demonstrates basic stream operations
 */
public class BasicStreamDemo {

    public static void main(String[] args) {

        // Create a stream and collect it as a list
        System.out.println("Stream:" + Stream.of(1,2,3,4,5,6).collect(Collectors.toList()));

        // Create a numeric stream and print stats
        System.out.println("Numeric Stream:" + IntStream.of(1,2,3,4,5,6).summaryStatistics());

        // Double each element in a stream and print it
        System.out.println("Doubling Stream:" + Stream.of(5,5,5,5,5,5,5,5).map(x -> x * 2).collect(Collectors.toList()));

        // Drop each element that is smaller than 5 and add one, then print it
        System.out.println("Filter and Add One Stream:" +
                Stream.of(6,5,4,3,6,5,4,3,6,5,4,3,6,5,4,3).filter(x -> x < 5).map(x -> x + 1).collect(Collectors.toList()));

    }

}
