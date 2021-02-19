package edu.howardcc.javaii.examples;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 * Controller class for Pizza Calculator App
 */
public class PizzaController {

    @FXML
    private TextField pizzaOneNameTextField;

    @FXML
    private Slider pizzaOneDiameterSlider;

    @FXML
    private TextField pizzaOneCostTextField;

    @FXML
    private TextField pizzaOneAreaTextField;

    @FXML
    private TextField pizzaOneValueTextField;

    @FXML
    private TextField pizzaTwoNameTextField;

    @FXML
    private Slider pizzaTwoDiameterSlider;

    @FXML
    private TextField pizzaTwoCostTextField;

    @FXML
    private TextField pizzaTwoAreaTextField;

    @FXML
    private TextField pizzaTwoValueTextField;

    @FXML
    private Label messageLabel;

    @FXML
    private Button calculateButton;

    @FXML
    private Button resetButton;

    private String initialMessage;
    private String initialPizzaOneNameValue;
    private String initialPizzaTwoNameValue;
    private Double initialPizzaOneSliderValue;
    private Double initialPizzaTwoSliderValue;

    // Called by FXMLLoader to  initialize the controller
    public void initialize() {
        // Save initial values from the FXML for later use
        initialMessage = messageLabel.getText();

        initialPizzaOneNameValue = pizzaOneNameTextField.getText();
        initialPizzaTwoNameValue = pizzaTwoNameTextField.getText();

        initialPizzaOneSliderValue = pizzaOneDiameterSlider.getValue();
        initialPizzaTwoSliderValue = pizzaTwoDiameterSlider.getValue();

        // Set up listeners for editable controls to clear calculated values when an input changes using several different mechanisms
        // Anonymous class
        pizzaOneDiameterSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                clearCalculatedControls();
            }
        });
        // Inner class
        pizzaOneCostTextField.textProperty().addListener(new ClearOutputChangeListener<>());
        // Lambda
        pizzaTwoDiameterSlider.valueProperty().addListener((observableValue, oldValue, newValue) -> clearCalculatedControls());
        pizzaTwoCostTextField.textProperty().addListener((observableValue, oldValue, newValue) -> clearCalculatedControls());
    }

    /**
     * Listener class that clears all calculated controls when it detects a change
     * @param <T>
     */
    private class ClearOutputChangeListener<T> implements  ChangeListener<T> {
        @Override
        public void changed(ObservableValue<? extends T> observableValue, T oldValue, T newValue) {
            clearCalculatedControls();
        }
    }

    /**
     * Calculate the best value between the given pizzas when the Calculate button is pressed
     *
     * Sets an error message if a value was invalid
     */
    @FXML
    void onCalculateButtonPressed(ActionEvent event) {

        try {
            String pizzaOneName = pizzaOneNameTextField.getText();
            double pizzaOneCost = Double.parseDouble(pizzaOneCostTextField.getText());
            double pizzaOneRadius = pizzaOneDiameterSlider.getValue() / 2;
            double pizzaOneArea = Math.PI * Math.pow(pizzaOneRadius, 2);
            pizzaOneAreaTextField.setText(String.format("%.2f", pizzaOneArea));
            double pizzaOneValue = pizzaOneArea / pizzaOneCost;
            pizzaOneValueTextField.setText(String.format("%.2f", pizzaOneValue));

            String pizzaTwoName = pizzaTwoNameTextField.getText();
            double pizzaTwoCost = Double.parseDouble(pizzaTwoCostTextField.getText());
            double pizzaTwoRadius = pizzaTwoDiameterSlider.getValue() / 2;
            double pizzaTwoArea = Math.PI * Math.pow(pizzaTwoRadius, 2);
            pizzaTwoAreaTextField.setText(String.format("%.2f", pizzaTwoArea));
            double pizzaTwoValue = pizzaTwoArea / pizzaTwoCost;
            pizzaTwoValueTextField.setText(String.format("%.2f", pizzaTwoValue));

            if (pizzaOneValue > pizzaTwoValue) {
                messageLabel.setText(String.format("%s is a better deal than %s.", pizzaOneName, pizzaTwoName));
            }
            else if (pizzaTwoValue > pizzaOneValue) {
                messageLabel.setText(String.format("%s is a better deal than %s.", pizzaTwoName, pizzaOneName));
            }
            else {
                messageLabel.setText("The value is the same! Which one tastes better?");
            }
        }
        catch (NumberFormatException e) {
            messageLabel.setText("Parsing Error: Check your inputs.");
        }

    }

    /**
     * Reset all fields when the Reset button is pressed
     */
    @FXML
    void onResetButtonPressed(ActionEvent event) {
        messageLabel.setText(initialMessage);

        pizzaOneNameTextField.setText(initialPizzaOneNameValue);
        pizzaOneDiameterSlider.setValue(initialPizzaOneSliderValue);
        pizzaOneCostTextField.clear();
        pizzaOneAreaTextField.clear();
        pizzaOneValueTextField.clear();

        pizzaTwoNameTextField.setText(initialPizzaTwoNameValue);
        pizzaTwoDiameterSlider.setValue(initialPizzaTwoSliderValue);
        pizzaTwoCostTextField.clear();
        pizzaTwoAreaTextField.clear();
        pizzaTwoValueTextField.clear();
    }


    /**
     * Clear the output values when an input value is modified
     */
    private void clearCalculatedControls() {
        messageLabel.setText(initialMessage);

        pizzaOneAreaTextField.clear();
        pizzaOneValueTextField.clear();

        pizzaTwoAreaTextField.clear();
        pizzaTwoValueTextField.clear();
    }

}
