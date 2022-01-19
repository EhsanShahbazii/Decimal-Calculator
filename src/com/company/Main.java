package com.company;

import javax.swing.*;
import java.awt.*;

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
    }

    public static void main(String[] args) {
	// write your code here
    }
}
