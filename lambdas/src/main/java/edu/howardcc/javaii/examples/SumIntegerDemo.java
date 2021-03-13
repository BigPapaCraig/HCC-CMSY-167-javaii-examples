package edu.howardcc.javaii.examples;

import java.util.stream.IntStream;

/**
 * Demonstrate summing integers with loops compared to streams
 */
public class SumIntegerDemo {

    public static void main(String[] args) {

        int max = 10;

        System.out.printf("Sum with loop: %s\n", sumWithForLoop(max));
        System.out.printf("Sum with streams: %s\n", sumWithStream(max));
        System.out.printf("Sum with streams(custom reduce): %s\n", sumWithStreamReduce(max));

    }

    private static int sumWithForLoop(int max) {
        int total = 0;

        for (int i = 1; i <= max; i++) {
            total += i;
        }

        return  total;
    }

    private static int sumWithStream(int max) {
        int total = IntStream.rangeClosed(1, 10).sum();

        return total;
    }

    private static int sumWithStreamReduce(int max) {
        int total = IntStream.rangeClosed(1, 10)
                .reduce(0, (sum, next) -> sum + next);

        return total;
    }
}
