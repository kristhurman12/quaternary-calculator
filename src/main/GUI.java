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
    JButton multButton = new JButton("*");
    JButton divButton = new JButton("/");
    JButton squareButton = new JButton("^");
    JButton sqrtButton = new JButton("√");

    int defaultButtonWidth = 80;
    int defaultButtonHeight = 30;
    int buttonSpacing = 20;

    GUI(){

        zeroButton.setBounds(10,420,defaultButtonWidth,defaultButtonHeight);
        zeroButton.setFocusable(false);
        zeroButton.addActionListener(this);

        oneButton.setBounds(defaultButtonWidth + buttonSpacing,420,defaultButtonWidth,defaultButtonHeight);
        oneButton.setFocusable(false);
        oneButton.addActionListener(this);

        twoButton.setBounds(10,420-buttonSpacing*2,defaultButtonWidth,defaultButtonHeight);
        twoButton.setFocusable(false);
        twoButton.addActionListener(this);

        threeButton.setBounds(defaultButtonWidth+buttonSpacing,420-buttonSpacing*2,defaultButtonWidth,defaultButtonHeight);
        threeButton.setFocusable(false);
        threeButton.addActionListener(this);

        equalsButton.setBounds(defaultButtonWidth*2 + buttonSpacing+10,420-buttonSpacing*2,defaultButtonWidth,defaultButtonHeight*2+10);
        equalsButton.setFocusable(false);
        equalsButton.addActionListener(this);

        plusButton.setBounds(10,420-buttonSpacing*4,defaultButtonWidth,defaultButtonHeight);
        plusButton.setFocusable(false);
        plusButton.addActionListener(this);

        minusButton.setBounds(defaultButtonWidth+buttonSpacing,420-buttonSpacing*4,defaultButtonWidth,defaultButtonHeight);
        minusButton.setFocusable(false);
        minusButton.addActionListener(this);

        frame.add(zeroButton);
        frame.add(oneButton);
        frame.add(twoButton);
        frame.add(threeButton);
        frame.add(equalsButton);
        frame.add(plusButton);
        frame.add(minusButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}