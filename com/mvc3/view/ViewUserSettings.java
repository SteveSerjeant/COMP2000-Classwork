package com.mvc3.view;

import com.mvc3.controller.IControllerStrategy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewUserSettings extends JFrame implements IViewComposite {

    private IControllerStrategy controller;

    JPanel leftPanel;
    JLabel viewLbl;

    JPanel rightPanel;
    JTextField viewTf;
    JButton viewBtn;

    JPanel mainPanel;

    public ViewUserSettings() {

        leftPanel = new JPanel();
        leftPanel.setBackground(new Color(0.5f,0.5f,0.5f));

        viewLbl = new JLabel("Name not set");
        viewLbl.setHorizontalAlignment(SwingConstants.CENTER);

        leftPanel.add(viewLbl);


        rightPanel = new JPanel();

        viewTf = new JTextField("Enter Name...");
        viewTf.setHorizontalAlignment(SwingConstants.CENTER);

        viewBtn = new JButton("Save");

        viewBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        controller.setData(viewTf.getText());
                    }
                }
        );

        rightPanel.add(viewTf);
        rightPanel.add(viewBtn);


        mainPanel = new JPanel();
        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        this.setContentPane(mainPanel);


        this.setLayout(new GridLayout(1,2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(300, 150));
        this.pack();

        this.setVisible(true);
    }

    @Override
    public void setController(IControllerStrategy controller) {
        this.controller = controller;
    }

    @Override
    public void display(String data) {
        viewLbl.setText(data);
    }
}
