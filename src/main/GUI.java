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
    JButton switchButton = new JButton("Quaternary/Decimal");

    JTextField answerField = new JTextField();

    int defaultButtonWidth = 80;
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

        switchButton.setBounds(10,bottomRow-buttonSpacing*8,defaultButtonWidth*3+buttonSpacing,defaultButtonHeight);
        switchButton.setFocusable(false);
        switchButton.addActionListener(this);

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

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,frameHeight);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    int decimalNumber;
    String input;
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
                input = answerField.getText();
                decimalNumber = calculator.quaternaryToDecimal(input);
                answerField.setText(String.valueOf(decimalNumber));
                isDecimal = true;
            }
            else{
                input = calculator.decimalToQuaternary(Integer.parseInt(answerField.getText()));
                answerField.setText(input);
                isDecimal = false;
            }
        }
        /*
        JButton variable = (JButton) e.getSource();
        switch (variable){
            case oneButton:
                answerField.setText(answerField.getText()+"1");
                break;
            case zeroButton:

        }
         */
    }
}