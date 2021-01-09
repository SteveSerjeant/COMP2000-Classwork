package com.mvc4.view;

import com.mvc4.KeyValuePair;
import com.mvc4.controller.AbstractController;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewEditor extends AbstractView {

    JPanel mainPanel;
    JTextField nameTf;
    JSpinner healthSpn;
    JSlider armourSld;
    JSpinner walkSpn;
    JSpinner runSpn;
    JSpinner jumpSpn;

    public ViewEditor(){
        mainPanel = new JPanel();

        nameTf = new JTextField();
        nameTf.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        controller.setModelProperty(new KeyValuePair(AbstractController.CHARACTER_NAME, nameTf.getText()));
                    }
                }
        );
        healthSpn = new JSpinner();
        healthSpn.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        int value = (Integer)healthSpn.getValue();
                        controller.setModelProperty(new KeyValuePair(AbstractController.HEALTH,value));
                    }
                }
        );

        armourSld = new JSlider();
        armourSld.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        int value = armourSld.getValue();
                        controller.setModelProperty(new KeyValuePair(AbstractController.ARMOUR, value));
                    }
                }
        );

        walkSpn = new JSpinner(new SpinnerNumberModel(0.0, 0.0, 6.0, 0.1));
        walkSpn.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        controller.setModelProperty(new KeyValuePair(AbstractController.WALK_SPEED,
                                doubleToFloat((double) walkSpn.getValue())));
                    }
                }
        );

        runSpn = new JSpinner(new SpinnerNumberModel(0.0,0.0,12.0,0.1));
        runSpn.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        double value = (double) runSpn.getValue();
                        controller.setModelProperty(new KeyValuePair(AbstractController.RUN_SPEED,
                                doubleToFloat((double)runSpn.getValue())));
                    }
                }
        );

        jumpSpn = new JSpinner(new SpinnerNumberModel(0.0,0.0,3.0,0.05));
        jumpSpn.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        double value = (double) jumpSpn.getValue();
                        controller.setModelProperty(new KeyValuePair(AbstractController.JUMP_HEIGHT,
                                doubleToFloat((double)jumpSpn.getValue())));
                    }
                }
        );

        mainPanel.add(nameTf);
        mainPanel.add(healthSpn);
        mainPanel.add(armourSld);
        mainPanel.add(walkSpn);
        mainPanel.add(runSpn);
        mainPanel.add(jumpSpn);

        setContentPane(mainPanel);
        initialise(6,1);
    }

    @Override
    public void update(KeyValuePair data){
        switch (data.key){
            case AbstractController.CHARACTER_NAME:
                nameTf.setText(data.value.toString());
                break;
            case AbstractController.HEALTH: {
                healthSpn.setValue(data.value);
                break;
            }
            case AbstractController.ARMOUR: {
                armourSld.setValue((int) data.value);
                break;
            }
            case AbstractController.WALK_SPEED:{
                walkSpn.setValue(floatToDouble((float) data.value));
                break;
            }
            case AbstractController.RUN_SPEED: {
                runSpn.setValue(floatToDouble((float) data.value));
                break;
            }
            case AbstractController.JUMP_HEIGHT: {
                jumpSpn.setValue(floatToDouble((float) data.value));
                break;
            }

        }
    }
}
