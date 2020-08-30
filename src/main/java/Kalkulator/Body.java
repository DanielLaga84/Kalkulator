package Kalkulator;

import javax.swing.*;
import java.awt.*;

public class Body extends Main {

    private JButton add, subtract, multiply, divide, left_paren, right_paren, zero, one, two, three, four, five, six, seven, eight, nine;

    private JTextField textfield;

    public void Calculator_body(){

        Panel panel = new Panel();

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        panel.setLayout(layout);

        textfield = new JTextField(10);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(textfield);

        add = new JButton("+");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 3;
        constraints.gridy = 1;
        panel.add(add,constraints);

        subtract = new JButton("-");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 3;
        constraints.gridy = 2;
        panel.add(subtract,constraints);

        multiply = new JButton("*");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 3;
        constraints.gridy = 3;
        panel.add(multiply,constraints);

        divide = new JButton("/");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 3;
        constraints.gridy = 4;
        panel.add(divide, constraints);

        left_paren = new JButton("(");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(left_paren,constraints);

        right_paren = new JButton(")");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 2;
        panel.add(right_paren,constraints);

        zero = new JButton("0");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 4;
        panel.add(zero,constraints);

        one = new JButton("1");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(one,constraints);

        two = new JButton("2");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(two,constraints);

        three = new JButton("3");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 3;
        panel.add(three,constraints);

        four = new JButton("4");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(four,constraints);

        five = new JButton("5");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(five,constraints);

        six = new JButton("6");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 2;
        panel.add(six,constraints);

        seven = new JButton("7");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(seven,constraints);

        eight = new JButton("8");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(eight,constraints);

        nine = new JButton("9");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 1;
        panel.add(nine,constraints);





    }
}
