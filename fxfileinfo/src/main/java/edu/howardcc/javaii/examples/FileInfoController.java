package edu.howardcc.javaii.examples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileInfoController {

    @FXML
    private VBox vbox;

    @FXML
    private Label filePathLabel;

    @FXML
    private Button chooseFileButton;

    @FXML
    private TextArea fileInfoTextArea;

    @FXML
    void chooseFileButtonPressed(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose a file");
        fileChooser.setInitialDirectory(Paths.get(".").toFile());

        File file = fileChooser.showOpenDialog(chooseFileButton.getScene().getWindow());

        if (file != null) {
            String absolutePathString = file.getAbsolutePath();
            filePathLabel.setText(absolutePathString);
            fileInfoTextArea.setText(getFileInfo(absolutePathString));
        }
    }

    /**
     * Returns a String with general information about a file or directory
     */
    private static String getFileInfo(String filePathString) {

        Path filePath = Paths.get(filePathString);

        try {
            return String.format("Path: %s\n", filePath.toString()) +
                    String.format("File Name: %s\n", filePath.getFileName()) +
                    String.format("Is absolute path?: %b\n", filePath.isAbsolute()) +
                    String.format("Absolute path: %s\n", filePath.toAbsolutePath()) +
                    String.format("Size: %d\n", Files.size(filePath)) +
                    String.format("Last modified: %s\n", Files.getLastModifiedTime(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }

}
