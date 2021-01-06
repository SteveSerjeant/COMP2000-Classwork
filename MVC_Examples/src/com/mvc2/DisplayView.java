package com.mvc2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayView extends JFrame implements IView {

    private JLabel nameLbl = new JLabel("No Data Loaded");
    private  JButton loadBtn = new JButton("Load");

    private Controller controller;

    public DisplayView(){

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2,1));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,150);

        nameLbl.setHorizontalAlignment(SwingConstants.CENTER);

        mainPanel.add(nameLbl);
        mainPanel.add(loadBtn);

        this.add(mainPanel);
        this.setVisible(true);

        loadBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        controller.updateView();
                    }
                }
        );
    }

    public void setController (Controller controller){

        this.controller = controller;

    }

    public void setName(String name){

        nameLbl.setText(name);
    }
}
