package com.mvc4.view;

import com.mvc4.KeyValuePair;
import com.mvc4.controller.AbstractController;

import javax.swing.*;

public class ViewCharacterDetails extends AbstractView {
    JPanel mainPanel;
    JLabel nameLbl;
    JLabel healthLbl;

    public ViewCharacterDetails() {
        mainPanel = new JPanel();
        nameLbl = new JLabel("Name not set");
        nameLbl.setHorizontalAlignment(SwingConstants.CENTER);

        healthLbl = new JLabel();
        healthLbl.setHorizontalAlignment(SwingConstants.CENTER);

        mainPanel.add(nameLbl);
        mainPanel.add(healthLbl);

        setContentPane(mainPanel);

        initialise(2,1);
    }

    @Override
    public void update(KeyValuePair data) {
        if(data.key.equals(AbstractController.CHARACTER_NAME)) {
            nameLbl.setText("Character Name: " + data.value.toString());
        }
        else if(data.key.equals(AbstractController.HEALTH)) {
            healthLbl.setText("Starting Health: " + data.value.toString());
        }
    }
}
