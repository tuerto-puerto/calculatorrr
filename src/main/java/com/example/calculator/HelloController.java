package com.example.calculator;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController
{
    Calculator calc = new Calculator();

    @FXML
    protected TextField inputField;

    @FXML
    protected void onButtonPlusClick()
    {

        calc.setOperator('+');

        String firstInputString = inputField.getText();

        double firstInputDouble = Double.parseDouble(firstInputString);

        calc.setOp1(firstInputDouble);

        inputField.setText("");

    }

    @FXML
    protected void onButtonMinusClick(){

        calc.setOperator('-');

        String firstInputString = inputField.getText();

        double firstInputDouble = Double.parseDouble(firstInputString);

        calc.setOp1(firstInputDouble);

        inputField.setText("");

    }

    @FXML
    protected void onButtonEqualClick(){

        String secondInputString = inputField.getText();
        double secondInputDouble = Double.parseDouble(secondInputString);

        calc.setOp2(secondInputDouble);
        try {
            calc.calculate();
            double result = calc.getResult();
            if (result == (int) result)
            {
                inputField.setText(Integer.toString((int) result));
            }
            else
            {
                inputField.setText(Double.toString(result));
            }
        } catch (DivisionByZeroException e) {
            inputField.setText(e.getMessage());
        }


    }

    @FXML
    protected void onButtonMultiplyClick(){

        calc.setOperator('*');

        String firstInputString = inputField.getText();


        double firstInputDouble = Double.parseDouble(firstInputString);

        calc.setOp1(firstInputDouble);

        inputField.setText("");

    }

    @FXML
    protected void onButtonDivideClick(){

        calc.setOperator('/');

        String firstInputString = inputField.getText();

        double firstInputDouble = Double.parseDouble(firstInputString);

        calc.setOp1(firstInputDouble);

        inputField.setText("");

    }

    @FXML
    protected void onButtonClearClick(){
        inputField.setText("");
    }

    @FXML
    protected void onButtonZeroClick(){
        String inputString = inputField.getText();
        if(!inputString.equals("0")) {
            inputField.setText(inputString + "0");
        }
    }

    @FXML
    protected void onButtonOneClick(){
        String inputString = inputField.getText();
        if(inputString.equals("0")) inputString="";
        inputField.setText( inputString + "1" );
    }

    @FXML
    protected void onButtonTwoClick(){
        String inputString = inputField.getText();
        if(inputString.equals("0")) inputString="";
        inputField.setText( inputString + "2" );
    }

    @FXML
    protected void onButtonThreeClick(){
        String inputString = inputField.getText();
        if(inputString.equals("0")) inputString="";
        inputField.setText( inputString + "3" );
    }

    @FXML
    protected void onButtonFourClick(){
        String inputString = inputField.getText();
        if(inputString.equals("0")) inputString="";
        inputField.setText( inputString + "4" );
    }

    @FXML
    protected void onButtonFiveClick(){
        String inputString = inputField.getText();
        if(inputString.equals("0")) inputString="";
        inputField.setText( inputString + "5" );
    }

    @FXML
    protected void onButtonSixClick(){
        String inputString = inputField.getText();
        if(inputString.equals("0")) inputString ="";
        inputField.setText( inputString + "6" );
    }

    @FXML
    protected void onButtonSevenClick(){
        String inputString = inputField.getText();
        if(inputString.equals("0")) inputString ="";
        inputField.setText( inputString + "7" );
    }

    @FXML
    protected void onButtonEightClick(){
        String inputString = inputField.getText();
        if(inputString.equals("0")) inputString ="";
        inputField.setText( inputString + "8" );
    }

    @FXML
    protected void onButtonNineClick(){
        String inputString = inputField.getText();
        if(inputString.equals("0")) inputString ="";
        inputField.setText( inputString + "9" );
    }
}