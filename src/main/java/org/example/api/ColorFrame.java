package org.example.api;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class ColorFrame extends JFrame {
    public ColorFrame() {
        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(400));
        getContentPane().setBackground(getColor());
        repaint();
    }


    protected abstract Color getColor();
}
