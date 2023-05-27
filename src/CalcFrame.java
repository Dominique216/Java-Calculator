package src;

import javax.swing.*;
import java.awt.*;

public class CalcFrame extends JFrame {
    CalcFrame() {
        JFrame frame = new JFrame("Calculator");

        JTextArea screen = new JTextArea(6, 4);

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(0, 4,  4, 4 ));

        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
//        JButton point = new JButton(".");
        JButton ac = new JButton("A/C");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton times = new JButton("*");
        JButton divide = new JButton("/");
        JButton equals = new JButton("=");


        frame.add(screen, BorderLayout.NORTH);

        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(plus);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(minus);
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(times);
//        panel.add(point);
        panel.add(ac);
        panel.add(zero);
        panel.add(equals);
        panel.add(divide);


        frame.add(panel);
        frame.setPreferredSize(new Dimension(600, 600));
//        frame.setLayout(new GridLayout(5, 5,  4, 4 ));
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);


        frame.setVisible(true);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
    }

}
