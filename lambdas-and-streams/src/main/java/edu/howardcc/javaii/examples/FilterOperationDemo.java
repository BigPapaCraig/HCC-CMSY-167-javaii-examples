package edu.howardcc.javaii.examples;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterOperationDemo {

    public static void main(String[] args) {

        // "Effectively" final because the value never changes
        int factor = 2;

        System.out.printf("Numbers divisible by %s:\n", factor);
        IntStream.rangeClosed(1, 10).filter(x -> x % factor == 0).forEach(System.out::println);

        // "i" is not effectively final
        for (int i = 2; i < 5; i++) {

            System.out.printf("Numbers divisible by %s:\n", i);
            // Compilation error!
            // IntStream.rangeClosed(1, 10).filter(x -> x % i == 0).forEach(System.out::println);
        }

    }
}
