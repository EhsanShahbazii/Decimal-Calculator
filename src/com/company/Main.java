package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
    }

    public static void main(String[] args) {
	// write your code here
    }
}
