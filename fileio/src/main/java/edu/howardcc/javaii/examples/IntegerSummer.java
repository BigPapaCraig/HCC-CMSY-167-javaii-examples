package edu.howardcc.javaii.examples;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Reads integers from a file and sums them together
 */
public class IntegerSummer {

    public static void main(String[] args) {

        String inputFileName = "input-files/numbers.txt";
        Path inputFilePath = Paths.get(inputFileName);

        try {
            Scanner inputFileScanner = new Scanner(inputFilePath);

            int sum = 0;
            while (inputFileScanner.hasNextInt()) {
                int num = inputFileScanner.nextInt();
                System.out.printf("+%d", num);
                sum = sum + num;
            }

            System.out.printf("\nSum: %d\n", sum);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
