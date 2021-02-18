package edu.howardcc.javaii.examples;

import java.io.IOException;
import javafx.fxml.FXML;

public class FileInfoController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
