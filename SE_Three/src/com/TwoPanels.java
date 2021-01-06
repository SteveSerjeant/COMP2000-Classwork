package com;

import javax.swing.*;
import java.awt.*;

public class TwoPanels extends JFrame{

    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;

    private JButton loadDataBtn;
    private JTextArea loadDataTxtArea;

    public TwoPanels(String title){

        super(title);

        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();
    }
}
