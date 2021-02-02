package edu.howardcc.javaii.examples;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;

/**
 * Writes a famous movie quote to a file
 */
public class MovieQuoteFileWriter {

    public static void main(String[] args) {

        Path outputFilePath = Paths.get("output-files/moviequote.txt");

        try (Formatter formatter = new Formatter(outputFilePath.toFile())) {
            String name = "Inigo Montoya";
            formatter.format("My name is %s.\n", name);
            formatter.format("You killed my father.\n");
            formatter.format("Prepare to die.\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
