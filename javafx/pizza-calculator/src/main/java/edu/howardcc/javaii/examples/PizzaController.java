package edu.howardcc.javaii.examples;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class PizzaController {

    @FXML
    private TextField subtotalTextField;

    @FXML
    private Slider tipPercentageSlider;

    @FXML
    private TextField tipAmountTextField;

    @FXML
    private TextField totalTextField;

    @FXML
    private Button calculateButton;

}
