package edu.howardcc.javaii.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Demonstrate a few techniques for creating new Streams
 */
public class CreatingStreamsDemo {

    public static void main(String[] args) {

        createStreamFromCollection();
        createStreamWithStreamOf();
        createStreamFromArray();

    }

    private static void createStreamFromCollection() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> stream = list.stream();

        System.out.printf("Stream.of...: %s\n", stream.collect(Collectors.toList()));
    }

    private static void createStreamWithStreamOf() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);

        System.out.printf("Stream.of...: %s\n", stream.collect(Collectors.toList()));
    }

    private static void createStreamFromArray() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        Stream<Integer> stream = Arrays.stream(array);

        System.out.printf("Stream.of...: %s\n", stream.collect(Collectors.toList()));
    }

}
