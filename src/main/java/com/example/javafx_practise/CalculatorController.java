package com.example.javafx_practise;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    public TextField firstNumber;
    @FXML
    public TextField secondNumber;
    @FXML
    public Label results;

    public void equals_() {
        int num1 = Integer.parseInt(firstNumber.getText());
        int num2 = Integer.parseInt(secondNumber.getText());

        int result = num1 + num2;
        results.setText("Outcome = " + result);
    }
}
