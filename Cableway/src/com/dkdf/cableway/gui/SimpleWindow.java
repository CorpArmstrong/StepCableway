package com.dkdf.cableway.gui;

import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame
{
    public static void main(String[] args)
    {
        SimpleWindow simpleWindow = new SimpleWindow();

        simpleWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        simpleWindow.setSize(640, 480);
        simpleWindow.setBackground(Color.darkGray);
        simpleWindow.setTitle("My First Simple");
        simpleWindow.setVisible(true);
    }
}