package com.mvc3.View;

import com.mvc3.Controller.IControllerStrategy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ViewUserSettings extends JFrame implements  IViewComposite {

    private  IControllerStrategy controller;

    JPanel leftpanel;
    JLabel viewLbl;

    JPanel rightPanel;
    JTextField viewTf;
    JButton viewBtn;

    JPanel mainPanel;

    public  ViewUserSettings(){

        leftpanel = new JPanel();
        leftpanel.setBackground(new Color(.5f,.5f,.5f));

        viewLbl = new JLabel("Name not set");
        viewLbl.setHorizontalAlignment(SwingConstants.CENTER);

        leftpanel.add(viewLbl);

        rightPanel = new JPanel();

        viewTf = new JTextField("Enter Name...");
        viewTf.setHorizontalAlignment(SwingConstants.CENTER);

        viewBtn = new JButton("Save");

        viewBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setData(viewTf.getText());
            }
        });

        rightPanel.add(viewTf);
        rightPanel.add(viewBtn);

        mainPanel = new JPanel();
        mainPanel.add(leftpanel);
        mainPanel.add(rightPanel);

        this.setContentPane(mainPanel);

        this.setLayout(new GridLayout(1,2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(300,150));
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
