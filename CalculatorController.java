package com.myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField num1Field, num2Field;

    @FXML
    private Label resultLabel;

    @FXML
    private Button addButton, subButton, mulButton, divButton;

    @FXML
    private void handleAddButton() {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = num1 + num2;
        resultLabel.setText("Result: " + result);
    }

    @FXML
    private void handleSubButton() {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = num1 - num2;
        resultLabel.setText("Result: " + result);
    }

    @FXML
    private void handleMulButton() {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = num1 * num2;
        resultLabel.setText("Result: " + result);
    }

    @FXML
    private void handleDivButton() {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        if (num2 != 0) {
            double result = num1 / num2;
            resultLabel.setText("Result: " + result);
        } else {
            resultLabel.setText("Error: Division by zero!");
        }
    }
}
