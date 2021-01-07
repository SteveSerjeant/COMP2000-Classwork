package com.mvc1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private final JTextField nameTf  = new JTextField(10);
    private final JLabel nameLbl = new JLabel("Enter Name");

    public App() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,1));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 500);

        nameLbl.setHorizontalAlignment(SwingConstants.CENTER);
        nameTf.setHorizontalAlignment(SwingConstants.CENTER);

        JButton editBtn = new JButton("Edit Name");

        mainPanel.add(nameLbl);
        mainPanel.add(nameTf);
        mainPanel.add(editBtn);

        this.add(mainPanel);

        this.setVisible(true);

        editBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String newName = nameTf.getText();

                        nameLbl.setText(newName);
                    }
                }
        );
    }
}
