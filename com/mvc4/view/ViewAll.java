package com.mvc4.view;

import com.mvc4.KeyValuePair;
import com.mvc4.controller.AbstractController;

import javax.swing.*;

public class ViewAll extends AbstractView {
    JPanel mainPanel;
    JLabel nameLbl;
    JLabel healthLbl;
    JLabel armourLbl;
    JLabel walkLbl;
    JLabel runLbl;
    JLabel jumpLbl;

    public ViewAll() {
        mainPanel = new JPanel();

        nameLbl = new JLabel("Nothing to show");
        healthLbl = new JLabel("Nothing to show");
        armourLbl = new JLabel("Nothing to show");
        walkLbl = new JLabel("Nothing to show");
        runLbl = new JLabel("Nothing to show");
        jumpLbl = new JLabel("Nothing to show");

        mainPanel.add(nameLbl);
        mainPanel.add(healthLbl);
        mainPanel.add(armourLbl);
        mainPanel.add(walkLbl);
        mainPanel.add(runLbl);
        mainPanel.add(jumpLbl);

        setContentPane(mainPanel);

        initialise(6,1);
    }

    @Override
    public void update(KeyValuePair data) {
        switch (data.key) {
            case AbstractController.CHARACTER_NAME:
                nameLbl.setText(data.value.toString());
                break;
            case AbstractController.HEALTH: {
                healthLbl.setText(data.value.toString());
                break;
            }
            case AbstractController.ARMOUR: {
                armourLbl.setText(data.value.toString());
                break;
            }
            case AbstractController.WALK_SPEED: {
                walkLbl.setText(data.value.toString());
                break;
            }
            case AbstractController.RUN_SPEED: {
                runLbl.setText(data.value.toString());
                break;
            }
            case AbstractController.JUMP_HEIGHT: {
                jumpLbl.setText(data.value.toString());
                break;
            }
        }
    }
}
