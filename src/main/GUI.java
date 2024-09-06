package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame frame = new JFrame();
    JButton oneButton = new JButton("1");
    JButton zeroButton = new JButton("0");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton equalsButton = new JButton("=");
    JButton plusButton = new JButton("+");
    JButton minusButton = new JButton("-");
    JButton multButton = new JButton("x");
    JButton divButton = new JButton("/");
    JButton squareButton = new JButton("^");
    JButton sqrtButton = new JButton("√");
    JButton clearButton = new JButton("CE");
    JButton switchButton = new JButton("Decimal");

    JButton switchButton2 = new JButton("Quaternary");


    JTextField answerField = new JTextField();

    int defaultButtonWidth = 100;
    int defaultButtonHeight = 30;
    int buttonSpacing = 20;
    int frameHeight = 310;
    int bottomRow = frameHeight-80;

    GUI(){

        zeroButton.setBounds(10,bottomRow,defaultButtonWidth,defaultButtonHeight);
        zeroButton.setFocusable(false);
        zeroButton.addActionListener(this);

        oneButton.setBounds(defaultButtonWidth + buttonSpacing,bottomRow,defaultButtonWidth,defaultButtonHeight);
        oneButton.setFocusable(false);
        oneButton.addActionListener(this);

        twoButton.setBounds(10,bottomRow-buttonSpacing*2,defaultButtonWidth,defaultButtonHeight);
        twoButton.setFocusable(false);
        twoButton.addActionListener(this);

        threeButton.setBounds(defaultButtonWidth+buttonSpacing,bottomRow-buttonSpacing*2,defaultButtonWidth,defaultButtonHeight);
        threeButton.setFocusable(false);
        threeButton.addActionListener(this);

        equalsButton.setBounds(defaultButtonWidth*2 + buttonSpacing+10,bottomRow-buttonSpacing*2,defaultButtonWidth,defaultButtonHeight*2+10);
        equalsButton.setFocusable(false);
        equalsButton.addActionListener(this);

        plusButton.setBounds(10,bottomRow-buttonSpacing*4,defaultButtonWidth,defaultButtonHeight);
        plusButton.setFocusable(false);
        plusButton.addActionListener(this);

        minusButton.setBounds(defaultButtonWidth+buttonSpacing,bottomRow-buttonSpacing*4,defaultButtonWidth,defaultButtonHeight);
        minusButton.setFocusable(false);
        minusButton.addActionListener(this);

        multButton.setBounds(defaultButtonWidth*2 + buttonSpacing+10,bottomRow-buttonSpacing*4,defaultButtonWidth,defaultButtonHeight);
        multButton.setFocusable(false);
        multButton.addActionListener(this);

        divButton.setBounds(10,bottomRow-buttonSpacing*6,defaultButtonWidth,defaultButtonHeight);
        divButton.setFocusable(false);
        divButton.addActionListener(this);

        squareButton.setBounds(defaultButtonWidth+buttonSpacing,bottomRow-buttonSpacing*6,defaultButtonWidth,defaultButtonHeight);
        squareButton.setFocusable(false);
        squareButton.addActionListener(this);

        sqrtButton.setBounds(defaultButtonWidth*2 + buttonSpacing+10,bottomRow-buttonSpacing*6,defaultButtonWidth,defaultButtonHeight);
        sqrtButton.setFocusable(false);
        sqrtButton.addActionListener(this);

        switchButton.setBounds(defaultButtonWidth+buttonSpacing,bottomRow-buttonSpacing*8,defaultButtonWidth,defaultButtonHeight);
        switchButton.setFocusable(false);
        switchButton.addActionListener(this);

        switchButton2.setBounds(defaultButtonWidth*2+buttonSpacing + 10,bottomRow-buttonSpacing*8,defaultButtonWidth,defaultButtonHeight);
        switchButton2.setFocusable(false);
        switchButton2.addActionListener(this);

        clearButton.setBounds(10,bottomRow-buttonSpacing*8,defaultButtonWidth,defaultButtonHeight);
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);

        answerField.setBounds(10, bottomRow-buttonSpacing*8-55,260, 45);
        answerField.setEditable(false);

        frame.add(answerField);

        frame.add(zeroButton);
        frame.add(oneButton);
        frame.add(twoButton);
        frame.add(threeButton);
        frame.add(equalsButton);
        frame.add(plusButton);
        frame.add(minusButton);
        frame.add(multButton);
        frame.add(divButton);
        frame.add(divButton);
        frame.add(sqrtButton);
        frame.add(squareButton);
        frame.add(switchButton);
        frame.add(switchButton2);
        frame.add(clearButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(360,frameHeight);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    int decimalNumber;
    int operationNumber1;
    int operationNumber2;
    String field;
    String input;
    String input2;
    String operation;
    quaternaryCalculator calculator = new quaternaryCalculator();
    Boolean isDecimal = false;

    @Override
    //Switch case would not work because JButtons are not valid in a switch case
    //Candidate for refactoring
    public void actionPerformed(ActionEvent e) {
        JButton variable = (JButton) e.getSource();
        if (variable == oneButton){
            answerField.setText(answerField.getText()+"1");
        }
        else if (variable== zeroButton) {
            answerField.setText(answerField.getText()+"0");
        }
        else if (variable== twoButton) {
            answerField.setText(answerField.getText()+"2");
        }
        else if (variable== threeButton) {
            answerField.setText(answerField.getText()+"3");
        }
        else if (variable== switchButton) {
            if (isDecimal.equals(false)) {
                System.out.println("to Decimal");
                field = answerField.getText();
                decimalNumber = calculator.quaternaryToDecimal(field);
                answerField.setText(String.valueOf(decimalNumber));
                isDecimal = true;
            }
            else{

            }

        }

        else if (variable== switchButton2) {
            if (isDecimal.equals(true)) {
                System.out.println("to Quaternary");

                field = calculator.decimalToQuaternary(Integer.parseInt(answerField.getText()));
                answerField.setText(field);
                isDecimal = false;
            }
            else{

            }

        }



        else if (variable == plusButton) {
            if (isDecimal.equals(false)) {

                input = answerField.getText();
                operation = "+";
                answerField.setText("");
            }
        }
        else if (variable == minusButton) {
            if (isDecimal.equals(false)) {

                input = answerField.getText();
                operation = "-";
                answerField.setText("");
            }
        }
        else if (variable == multButton) {
            if (isDecimal.equals(false)) {

                input = answerField.getText();
                operation = "x";
                answerField.setText("");
            }
        }
        else if (variable == divButton) {
            if (isDecimal.equals(false)) {

                input = answerField.getText();
                operation = "/";
                answerField.setText("");
            }
        }
        else if (variable == sqrtButton){
            if (isDecimal.equals(false)) {

                int temp = 0;
                int sqrt = 0;
                input = answerField.getText();
                temp = calculator.quaternaryToDecimal(input);
                sqrt = calculator.squareRoot(temp);
                answerField.setText(calculator.decimalToQuaternary(sqrt));
            }
        }
        else if (variable == squareButton){
            if (isDecimal.equals(false)) {

                input = answerField.getText();
                int temp = 0;
                int square = 0;
                temp = calculator.quaternaryToDecimal(input);
                square = calculator.square(temp);
                answerField.setText(calculator.decimalToQuaternary(square));
            }
        }
        else if (variable == equalsButton) {
            if (isDecimal.equals(false)) {

                int temp = 0;
                input2 = answerField.getText();
                operationNumber1 = calculator.quaternaryToDecimal(input);
                operationNumber2 = calculator.quaternaryToDecimal(input2);
                temp = switch (operation) {
                    case "+" -> calculator.add(operationNumber1, operationNumber2);
                    case "-" -> calculator.subtract(operationNumber1, operationNumber2);
                    case "x" -> calculator.multiply(operationNumber1, operationNumber2);
                    case "/" -> calculator.divide(operationNumber1, operationNumber2);
                    default -> temp;
                };
                answerField.setText(calculator.decimalToQuaternary(temp));
                operation = "";
            }
        }
        else if (variable == clearButton){
            input = "";
            input2 = "";
            operation = "";
            answerField.setText("");
            isDecimal = false;
        }
    }
}