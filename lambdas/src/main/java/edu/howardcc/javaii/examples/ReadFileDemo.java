package edu.howardcc.javaii.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Demonstrate reading a file as a Stream of strings
 */
public class ReadFile {

    private static final Path POEM_PATH = Paths.get("poem.txt");

    public static void main(String[] args) throws IOException {

        Files.lines(POEM_PATH).forEach(System.out::println);

    }

}
