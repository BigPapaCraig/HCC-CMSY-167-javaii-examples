package edu.howardcc.javaii.examples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PizzaController {

    @FXML
    private TextField pizzaOneNameTextField;

    @FXML
    private TextField pizzaOneDiameterTextField;

    @FXML
    private TextField pizzaOneCostTextField;

    @FXML
    private TextField pizzaOneAreaTextField;

    @FXML
    private TextField pizzaOneValueTextField;

    @FXML
    private TextField pizzaTwoNameTextField;

    @FXML
    private TextField pizzaTwoDiameterTextField;

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

    // Called by FXMLLoader to  initialize the controller
    public void initialize(){
        // Save initial message for later use
        initialMessage = messageLabel.getText();
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
            double pizzaOneRadius = Double.parseDouble(pizzaOneDiameterTextField.getText()) / 2;
            double pizzaOneArea = Math.PI * Math.pow(pizzaOneRadius, 2);
            pizzaOneAreaTextField.setText(String.format("%.2f", pizzaOneArea));
            double pizzaOneValue = pizzaOneArea / pizzaOneCost;
            pizzaOneValueTextField.setText(String.format("%.2f", pizzaOneValue));

            String pizzaTwoName = pizzaTwoNameTextField.getText();
            double pizzaTwoCost = Double.parseDouble(pizzaTwoCostTextField.getText());
            double pizzaTwoRadius = Double.parseDouble(pizzaTwoDiameterTextField.getText()) / 2;
            double pizzaTwoArea = Math.PI * Math.pow(pizzaTwoRadius, 2);
            pizzaTwoAreaTextField.setText(String.format("%.2f", pizzaTwoArea));
            double pizzaTwoValue = pizzaTwoArea / pizzaTwoCost;
            pizzaTwoValueTextField.setText(String.format("%.2f", pizzaTwoValue));

            if (pizzaOneValue > pizzaTwoValue) {
                messageLabel.setText(String.format("%s is a better deal that %s.", pizzaOneName, pizzaTwoName));
            }
            else if (pizzaTwoValue > pizzaOneValue) {
                messageLabel.setText(String.format("%s is a better deal that %s.", pizzaTwoName, pizzaOneName));
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
     * Clear all fields when the Reset button is pressed
     */
    @FXML
    void onResetButtonPressed(ActionEvent event) {
        messageLabel.setText(initialMessage);

        pizzaOneNameTextField.clear();
        pizzaOneDiameterTextField.clear();
        pizzaOneCostTextField.clear();
        pizzaOneAreaTextField.clear();
        pizzaOneValueTextField.clear();

        pizzaTwoNameTextField.clear();
        pizzaTwoDiameterTextField.clear();
        pizzaTwoCostTextField.clear();
        pizzaTwoAreaTextField.clear();
        pizzaTwoValueTextField.clear();
    }

}
