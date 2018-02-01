package com.emptywindow;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setTitle("My Empty Window");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setVisible(true);

        JLabel label = new JLabel("This works!");
        frame.add(label);
    }
}
