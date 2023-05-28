package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalcFrame extends JFrame {

    int num1;
    int num2;
    int total;
    String operand;
    CalcFrame() {
        JFrame frame = new JFrame("Calculator");

        JTextArea screen = new JTextArea(6, 4);
        screen.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        screen.setBackground(Color.BLACK);
        screen.setForeground(Color.white);

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

        zero.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                screen.append("0");
                super.mouseClicked(e);
            }

        });
        one.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                screen.append("1");
                super.mouseClicked(e);
            }

        });
        two.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                screen.append("2");
                super.mouseClicked(e);
            }

        });
        three.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                screen.append("3");
                super.mouseClicked(e);
            }

        });
        four.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                screen.append("4");
                super.mouseClicked(e);
            }

        });
        five.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                screen.append("5");
                super.mouseClicked(e);
            }

        });
        six.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                screen.append("6");
                super.mouseClicked(e);
            }

        });
        seven.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                screen.append("7");
                super.mouseClicked(e);
            }

        });
        eight.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                screen.append("8");
                super.mouseClicked(e);
            }

        });
        nine.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                screen.append("9");
                super.mouseClicked(e);
            }

        });
        ac.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                screen.setText("");
                super.mouseClicked(e);
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(screen.getText());
                num1 = Integer.parseInt(screen.getText());
                operand = "+";
                screen.setText("");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(screen.getText());
                num1 = Integer.parseInt(screen.getText());
                operand = "-";
                screen.setText("");
            }
        });
        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(screen.getText());
                num1 = Integer.parseInt(screen.getText());
                operand = "*";
                screen.setText("");
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(screen.getText());
                num1 = Integer.parseInt(screen.getText());
                operand = "/";
                screen.setText("");
            }
        });

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(screen.getText());
                num2 = Integer.parseInt(screen.getText());
                switch (operand) {
                    case "+" -> total = num1 + num2;
                    case "-" -> total = num1 - num2;
                    case "*" -> total = num1 * num2;
                    case "/" -> total = num1 / num2;
                }
                screen.setText(String.valueOf(total));
            }
        });


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
