package edu.howardcc.javaii.examples;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Demonstrate using the map operation on a stream
 */
public class MapOperationDemo {

    public static void main(String[] args) {

        // Map operation with a method reference
        System.out.println("Method reference: " +
                getIntStream().map(MapOperationDemo::multiplyByTwo).collect(Collectors.toList()));

        // Full-body lambda syntax
        System.out.println("Lambda: " +
                getIntStream().map((x) -> {return x*2;}).collect(Collectors.toList()));
        // Omit brackets because body is only one statement
        System.out.println("Shorter Lambda: " +
                getIntStream().map((x) -> x*2).collect(Collectors.toList()));
        // Omit parenthesis because there is is only one parameter
        System.out.println("Shortest Lambda: " +
                getIntStream().map(x -> x*2).collect(Collectors.toList()));

    }

    // Traditional method
    private static int multiplyByTwo(int number) {
        return number * 2;
    }

    // Create a stream of Integers
    private static Stream<Integer> getIntStream() {
        return Stream.of(3, 4, 5, 6, 3, 4, 5, 6, 3, 4, 5, 6);
    }

}
