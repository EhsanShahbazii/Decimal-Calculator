package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

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

        JMenu menu2 = new JMenu("About us");
        menu2.setMnemonic(KeyEvent.VK_F);
        menu2.getAccessibleContext().setAccessibleDescription("Dealing with Files");

        JMenu menu3 = new JMenu("App version");
        menu3.setMnemonic(KeyEvent.VK_F);
        menu3.getAccessibleContext().setAccessibleDescription("Dealing with Files");
    }

    public static void main(String[] args) {
	// write your code here
    }
}
