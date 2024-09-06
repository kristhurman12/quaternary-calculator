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
    JButton switchButton = new JButton("Decimal/Quaternary");

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

        switchButton.setBounds(defaultButtonWidth+buttonSpacing,bottomRow-buttonSpacing*8,defaultButtonWidth*2+10,defaultButtonHeight);
        switchButton.setFocusable(false);
        switchButton.addActionListener(this);

        clearButton.setBounds(10,bottomRow-buttonSpacing*8,defaultButtonWidth,defaultButtonHeight);
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);

        answerField.setBounds(10, bottomRow-buttonSpacing*8-55,defaultButtonWidth*3+20, 45);
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
    String operation = "";
    quaternaryCalculator calculator = new quaternaryCalculator();
    Boolean isDecimal = false;

    @Override
    //Switch case would not work because JButtons are not valid in a switch case
    //Candidate for refactoring
    public void actionPerformed(ActionEvent e) {
        JButton variable = (JButton) e.getSource();
        if (variable == oneButton) {
            input = answerField.getText();
            if (isDecimal.equals(true)) {
                input = calculator.decimalToQuaternary(Integer.parseInt(input));
                isDecimal = false;
            }
            input = input+"1";
            answerField.setText(input);
        } else if (variable == zeroButton) {
            input = answerField.getText();
            if (isDecimal.equals(true)) {
                input = calculator.decimalToQuaternary(Integer.parseInt(input));
                isDecimal = false;
            }
            input = input+"0";
            answerField.setText(input);
        } else if (variable == twoButton) {
            input = answerField.getText();
            if (isDecimal.equals(true)) {
                input = calculator.decimalToQuaternary(Integer.parseInt(input));
                isDecimal = false;
            }
            input = input+"2";
            answerField.setText(input);
        } else if (variable == threeButton) {
            input = answerField.getText();
            if (isDecimal.equals(true)) {
                input = calculator.decimalToQuaternary(Integer.parseInt(input));
                isDecimal = false;
            }
            input = input+"3";
            answerField.setText(input);
        } else if (variable == switchButton) {
            if (isDecimal.equals(false)) {
                field = answerField.getText();
                decimalNumber = calculator.quaternaryToDecimal(field);
                answerField.setText(String.valueOf(decimalNumber));
                isDecimal = true;
            }
            else{
                field = answerField.getText();
                field = calculator.decimalToQuaternary(Integer.parseInt(field));
                answerField.setText(field);
                isDecimal=false;
            }
        } else if (variable == plusButton) {
            if (isDecimal.equals(true)) {
                input = calculator.decimalToQuaternary(Integer.parseInt(input));
                isDecimal = false;
            }
            input = answerField.getText();
            operation = "+";
            answerField.setText("");
        } else if (variable == minusButton) {
            input = answerField.getText();
            if (isDecimal.equals(true)) {
                input = calculator.decimalToQuaternary(Integer.parseInt(input));
                isDecimal = false;
            }
            operation = "-";
            answerField.setText("");
        } else if (variable == multButton) {
            input = answerField.getText();
            if (isDecimal.equals(true)) {
                input = calculator.decimalToQuaternary(Integer.parseInt(input));
                isDecimal = false;
            }
            operation = "x";
            answerField.setText("");
        } else if (variable == divButton) {
            input = answerField.getText();
            if (isDecimal.equals(true)) {
                input = calculator.decimalToQuaternary(Integer.parseInt(input));
                isDecimal = false;
            }
            operation = "/";
            answerField.setText("");
        } else if (variable == sqrtButton) {
            input = answerField.getText();
            if (isDecimal.equals(true)) {
                input = calculator.decimalToQuaternary(Integer.parseInt(input));
                isDecimal = false;
            }
            int temp = calculator.quaternaryToDecimal(input);
            int sqrt = calculator.squareRoot(temp);
            answerField.setText(calculator.decimalToQuaternary(sqrt));
        }
        else if (variable == squareButton){
            input = answerField.getText();
            if (isDecimal.equals(true)){
                input = calculator.decimalToQuaternary(Integer.parseInt(input));
                isDecimal=false;
            }
            int temp = calculator.quaternaryToDecimal(input);
            int square = calculator.square(temp);
            answerField.setText(calculator.decimalToQuaternary(square));
        }
        else if (variable == equalsButton) {
            int temp = 0;
            input2 = answerField.getText();
            if (isDecimal.equals(true)){
                input2 = calculator.decimalToQuaternary(Integer.parseInt(input2));
                isDecimal=false;
            }
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
            input2 = "";
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