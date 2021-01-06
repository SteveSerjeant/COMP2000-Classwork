package com;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.util.Date;

public class TwoPanels {

    public JFrame frame;

    private JButton loadButton;
    private JTextArea textDisplayArea;
    private JScrollPane scrollPane;

    public void initialise(){

        frame = new JFrame("Swing Updates");
        frame.setLayout(new GridLayout(2,1));

        loadButton = new JButton("Load Data");
        textDisplayArea = new JTextArea("Data Display");
        textDisplayArea.setLineWrap(true);
        scrollPane = new JScrollPane(textDisplayArea);
    }
}
