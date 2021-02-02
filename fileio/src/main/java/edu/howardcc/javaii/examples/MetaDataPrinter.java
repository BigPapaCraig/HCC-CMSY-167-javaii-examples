package edu.howardcc.javaii.examples;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MetaDataPrinter {

    public static void main(String[] args) {

        printFileInfo("input-files");
        printFileInfo("input-files/names.txt");

    }

    /**
     * Prints general information about a file or directory
     */
    public static void printFileInfo(String filePathString) {

        Path filePath = Paths.get(filePathString);

        System.out.printf("Path:\t%s\n", filePath.toString());
        System.out.printf("File Name:\t%s\n", filePath.getFileName());
        System.out.printf("Is absolute path?:\t%b\n", filePath.isAbsolute());
        System.out.printf("Absolute path:\t%s\n", filePath.toAbsolutePath());

        try {
            // Could throw an Exception if the file does not actually exist
            System.out.printf("Size:\t%d\n", Files.size(filePath));
            System.out.printf("Last modified:\t%s\n", Files.getLastModifiedTime(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean isDirectory = Files.isDirectory(filePath);
        System.out.printf("Is a directory:\t%b\n", isDirectory);
        if(isDirectory) {
            printDirectoryContents(filePath);
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    private static void printDirectoryContents(Path directoryPath) {
        System.out.println("Directory contents:");
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath)) {
            for (Path path : directoryStream) {
                System.out.printf("\t%s\n", path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
