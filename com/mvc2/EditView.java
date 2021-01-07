package com.mvc2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditView extends JFrame implements IView {
    private JTextField nameTf  = new JTextField(10);
    private JButton saveBtn = new JButton("Save");

    private Controller controller;

    public EditView() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2,1));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 150);

        nameTf.setHorizontalAlignment(SwingConstants.CENTER);

        mainPanel.add(nameTf);
        mainPanel.add(saveBtn);

        this.add(mainPanel);
        this.setVisible(true);

        saveBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setName(nameTf.getText());
                    }
                }
        );
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setName(String name) {
        controller.setName(name);
    }
}
