package edu.howardcc.javaii.examples;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Read and print lines from a text file
 */
public class TextFilePrinter {

    public static void main(String[] args) {

        String inputFileName = "input-files/names.txt";
        Path inputFilePath = Paths.get(inputFileName);

        try {
            Scanner inputFileScanner = new Scanner(inputFilePath);

            while (inputFileScanner.hasNextLine()) {
                String line = inputFileScanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
