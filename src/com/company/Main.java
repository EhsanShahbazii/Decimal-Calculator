package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {

    public static void GUI() {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setBounds(770, 200, 400, 600);

        jFrame.setTitle("Decimal Calculator");
        jFrame.setResizable(false);

//        ImageIcon img = new ImageIcon("D:\\calculator plus\\src\\com\\company\\calculator_icon.png");
        jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("calculator_icon.png")));
//        jFrame.setIconImage(img.getImage());

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBounds(0, 0, 400, 600);
        jPanel.setBackground(new Color(47, 48, 65));

        final JTextArea jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        jTextArea.setLineWrap(true);
        jTextArea.setBounds(10, 20, 365, 130);
        jTextArea.setFont(new Font("Arial", Font.PLAIN, 28));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255, 255, 255));

        //Build the File Menu.
        JMenu menu1 = new JMenu("File");
        menu1.setMnemonic(KeyEvent.VK_F);
        menu1.getAccessibleContext().setAccessibleDescription("Dealing with Files");

        // create menu item and add it to the menu
        JMenuItem menuItem1 = new JMenuItem("Copy Result");
        menuItem1.setMnemonic(KeyEvent.VK_F);
        menu1.add(menuItem1);

        JMenuItem menuItem5 = new JMenuItem("Quit");
        menuItem5.setMnemonic(KeyEvent.VK_F);
        menu1.add(menuItem5);

        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection stringSelection = new StringSelection(jTextArea.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
                JOptionPane.showMessageDialog(null, "The result was copied.", "Decimal calculator", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        menuItem5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(-1);
            }
        });

        JMenu menu2 = new JMenu("About us");
        menu2.setMnemonic(KeyEvent.VK_F);
        menu2.getAccessibleContext().setAccessibleDescription("Dealing with Files");

        JMenuItem menuItem2 = new JMenuItem("Creator: Ehsan Shahbazi");
        menuItem2.setMnemonic(KeyEvent.VK_F);
        menu2.add(menuItem2);

        JMenuItem menuItem3 = new JMenuItem("Email: ehsan.shahbazipc@gmail.com");
        menuItem3.setMnemonic(KeyEvent.VK_F);
        menu2.add(menuItem3);

        JMenuItem menuItem4 = new JMenuItem("github: https://github.com/EhsanShahbazii");
        menuItem4.setMnemonic(KeyEvent.VK_F);
        menu2.add(menuItem4);

        JMenu menu3 = new JMenu("App version");
        menu3.setMnemonic(KeyEvent.VK_F);
        menu3.getAccessibleContext().setAccessibleDescription("Dealing with Files");

        JMenuItem menuItem6 = new JMenuItem("Built-in 2022 JAN, v1.0.1");
        menuItem6.setMnemonic(KeyEvent.VK_F);
        menu3.add(menuItem6);

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);

        JButton button1 = setButton("Del", 12, 167);
        JButton button2 = setButton("CE", 105, 167);
        JButton button3 = setButton("%", 198, 167);
        JButton button4 = setButton("/", 296, 167);
        JButton button5 = setButton("7", 12, 242);
        JButton button6 = setButton("8", 105, 242);
        JButton button7 = setButton("9", 198, 242);
        JButton button8 = setButton("*", 296, 242);
        JButton button9 = setButton("4", 12, 317);
        JButton button10 = setButton("5", 105, 317);
        JButton button11 = setButton("6", 198, 317);
        JButton button12 = setButton("-", 296, 317);
        JButton button13 = setButton("1", 12, 392);
        JButton button14 = setButton("2", 105, 392);
        JButton button15 = setButton("3", 198, 392);
        JButton button16 = setButton("+", 296, 392);
        JButton button17 = setButton("+/-", 12, 467);
        JButton button18 = setButton("0", 105, 467);
        JButton button19 = setButton(".", 198, 467);
        JButton button20 = setButton("=", 296, 467);

        button20.setBackground(new Color(0, 173, 239, 255));
        button1.setBackground(new Color(215, 25, 32, 255));
        button2.setBackground(new Color(215, 25, 32, 255));
        button3.setBackground(new Color(99, 189, 40, 255));
        button4.setBackground(new Color(99, 189, 40, 255));
        button8.setBackground(new Color(99, 189, 40, 255));
        button12.setBackground(new Color(99, 189, 40, 255));
        button16.setBackground(new Color(99, 189, 40, 255));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //delete
                String temp = jTextArea.getText();
                if (temp.length() != 0) {
                    jTextArea.setText(temp.substring(0, temp.length()-1));
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ce clear
                jTextArea.setText("");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] final3 = jTextArea.getText().split("%");
                BigDecimal number3 = new BigDecimal(final3[0]);
                jTextArea.setText(number3.divide(BigDecimal.valueOf(100) , MathContext.DECIMAL128).toString());
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //divide
                String temp = jTextArea.getText();
                if (temp.contains("/")) {
                }else {
                    jTextArea.setText(jTextArea.getText() + "/");
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(jTextArea.getText() + "7");
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(jTextArea.getText() + "8");
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(jTextArea.getText() + "9");
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //multiply
                String temp = jTextArea.getText();
                if (temp.contains("*")) {
                }else {
                    jTextArea.setText(jTextArea.getText() + "*");
                }
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(jTextArea.getText() + "4");
            }
        });

        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(jTextArea.getText() + "5");
            }
        });

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(jTextArea.getText() + "6");
            }
        });

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //minus
                String temp = jTextArea.getText();
                if (temp.contains("-")) {
                }else {
                    jTextArea.setText(jTextArea.getText() + "-");
                }
            }
        });

        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(jTextArea.getText() + "1");
            }
        });

        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(jTextArea.getText() + "2");
            }
        });

        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(jTextArea.getText() + "3");
            }
        });

        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //plus
                String temp = jTextArea.getText();
                if (temp.contains("+")) {
                }else {
                    jTextArea.setText(jTextArea.getText() + "+");
                }
            }
        });

        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // - or +
                jTextArea.setText(jTextArea.getText());
            }
        });

        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(jTextArea.getText() + "0");
            }
        });

        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = jTextArea.getText();
                int count = 0;
                for (int i = 0; i < temp.length(); i++) {
                    if (temp.charAt(i) == '.') {
                        count++;
                    }
                }
                if (count < 2) {
                    if (temp.contains(".")) {
                    }else {
                        jTextArea.setText(jTextArea.getText() + ".");
                    }
                    if (temp.contains(".") && temp.contains("+") || temp.contains("-") || temp.contains("*") || temp.contains("/") ){
                        jTextArea.setText(jTextArea.getText() + ".");
                    }
                }
            }
        });

        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // equal
                if (jTextArea.getText().contains("+")) {
                    String[] final1 = jTextArea.getText().split("\\+");
                    BigDecimal number1 = new BigDecimal(final1[0]);
                    BigDecimal number11 = new BigDecimal(final1[1]);
                    jTextArea.setText(number1.add(number11).toString());
                } else if (jTextArea.getText().contains("-")) {
                    String[] final2 = jTextArea.getText().split("-");
                    BigDecimal number2 = new BigDecimal(final2[0]);
                    BigDecimal number22 = new BigDecimal(final2[1]);
                    jTextArea.setText(number2.min(number22).toString());
                } else if (jTextArea.getText().contains("*")) {
                    String[] final3 = jTextArea.getText().split("\\*");
                    BigDecimal number3 = new BigDecimal(final3[0]);
                    BigDecimal number33= new BigDecimal(final3[1]);
                    jTextArea.setText(number3.multiply(number33).toString());
                } else if (jTextArea.getText().contains("/")) {
                    String[] final3 = jTextArea.getText().split("/");
                    BigDecimal number3 = new BigDecimal(final3[0]);
                    BigDecimal number33= new BigDecimal(final3[1]);
                    jTextArea.setText(number3.divide(number33, MathContext.DECIMAL128).toString());
                }else {

                }
            }
        });

        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);
        jPanel.add(button4);
        jPanel.add(button5);
        jPanel.add(button6);
        jPanel.add(button7);
        jPanel.add(button8);
        jPanel.add(button9);
        jPanel.add(button10);

    }

    public static JButton setButton(String character,int x, int y) {
        JButton jButton = new JButton(character);
        jButton.setBounds(x, y, 80, 60);
        jButton.setForeground(new Color(232, 232, 232));
        jButton.setBackground(new Color(73, 90, 97));
        jButton.setFont(new Font("Arial", Font.PLAIN, 25));
        jButton.setBorder(null);
        jButton.setFocusPainted(false);
        return jButton;
    }

    public static void main(String[] args) {
        GUI();
    }
}
