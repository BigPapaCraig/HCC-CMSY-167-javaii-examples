package edu.howardcc.javaii.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Demonstrate reading a file as a Stream of strings
 */
public class WordCountDemo {

    private static final Path POEM_PATH = Paths.get("poem.txt");

    public static void main(String[] args) throws IOException {

        // Print each line in a file
        Files.lines(POEM_PATH).forEach(System.out::println);

        // Use Streams to calculate word counts
        Map<String, Long> wordCounts = Files.lines(POEM_PATH)
                // Split each line into individual words
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                // Remove all non-word characters
                .map(word -> word.replaceAll("\\W", ""))
                // Drop any empty strings
                .filter(word -> !word.isBlank())
                // Collect as a map
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));

        // Print all word counts greater than one
        System.out.println("\nWord Counts\n----------");
        wordCounts.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(System.out::println);

    }

}
