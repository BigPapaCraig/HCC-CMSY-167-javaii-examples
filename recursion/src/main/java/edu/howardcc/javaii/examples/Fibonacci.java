package edu.howardcc.javaii.examples;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Demonstrate a recursive Fibonacci sequence
 */
public class Fibonacci {

    private static final int NUMBER_OF_ELEMENTS = 43;

    public static void main(String[] args) {

        List<String> fibonacciList = new ArrayList<>();

        Instant start = Instant.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            fibonacciList.add(String.valueOf(iterativeFibonacci(i)));
        }
        Instant end = Instant.now();
        System.out.printf("Fibonacci sequence (iterative):\t%s\n", String.join(", ", fibonacciList));
        System.out.printf("Completed in %d seconds\n", Duration.between(start, end).getSeconds());

        fibonacciList.clear();

        start = Instant.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            fibonacciList.add(String.valueOf(recursiveFibonacci(i)));
        }
        end = Instant.now();
        System.out.printf("Fibonacci sequence (recursive):\t%s\n", String.join(", ", fibonacciList));
        System.out.printf("Completed in %d seconds\n", Duration.between(start, end).getSeconds());

        fibonacciList.clear();

        start = Instant.now();
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            fibonacciList = streamFibonacci(NUMBER_OF_ELEMENTS);
        }
        end = Instant.now();
        System.out.printf("Fibonacci sequence (stream):\t%s\n", String.join(", ", fibonacciList));
        System.out.printf("Completed in %d seconds\n", Duration.between(start, end).getSeconds());
    }

    /**
     * Recursively calculates the nth element of the fibonacci sequence
     */
    private static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }

    /**
     * Iteratively calculates the nth element of the fibonacci sequence
     */
    private static int iterativeFibonacci(int n) {
        int current = 0;
        int next = 1;

        for (int i = 1; i <= n; i++){
            int tmp = current + next;
            current = next;
            next = tmp;
        }

        return current;
    }

    /**
     * Calculates elements of the fibonacci sequence using a stream
     */
    private static List<String> streamFibonacci(int numElements) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]}) // Create "pairs" of the last two elements
                .limit(numElements) // Stop generating when we get enough elements
                .map(x-> x[0]) // Take only the first element of each "Pair"
                .map(String::valueOf) // Convert to a string
                .collect(Collectors.toList()); // Collect as list
    }

}
