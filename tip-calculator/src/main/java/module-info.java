module edu.howardcc.javaii.examples {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.howardcc.javaii.examples to javafx.fxml;
    exports edu.howardcc.javaii.examples;
}