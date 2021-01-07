package com.mvc3.View;

import com.mvc3.Controller.IControllerStrategy;

import javax.swing.*;
import java.awt.*;

public class ViewUserDisplay extends JFrame implements IViewComposite {

    private IControllerStrategy controller;

    JPanel mainPanel;
    JLabel viewLbl;

    public ViewUserDisplay(){

        mainPanel = new JPanel();

        viewLbl = new JLabel("Name not set");
        viewLbl.setHorizontalAlignment(SwingConstants.CENTER);

        mainPanel.add(viewLbl);

        this.setContentPane(mainPanel);

        this.setLayout(new GridLayout(1,2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(300, 150));
        this.pack();

        this.setVisible(true);
    }

    public void setController(IControllerStrategy controller){

        this.controller = controller;
    }

    public void display(String data){

        viewLbl.setText(data);
    }
}
