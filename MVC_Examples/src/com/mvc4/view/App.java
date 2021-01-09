package com.mvc4.view;

import com.mvc4.KeyValuePair;
import com.mvc4.controller.AbstractController;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends AbstractView {

    private JTabbedPane tabbedPane;
    private JPanel mainPanel;
    private JPanel editPanel;
    private JPanel viewPanel;
    private JList<String> editList;
    private JTextField nameTf;
    private JSpinner healthSpn;
    private JSlider armourSld;
    private JSpinner walkSpn;
    private JSpinner runSpn;
    private JSpinner jumpSpn;
    private JLabel nameLbl;
    private JLabel healthLbl;
    private JLabel armourLbl;
    private JLabel walkLbl;
    private JLabel runLbl;
    private JLabel jumpLbl;

    public App() {

        tabbedPane.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        int index = editList.getSelectedIndex();
                        controller.swapModel(index);
                    }
                }
        );

        editList.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if(!e.getValueIsAdjusting()) {
                            int index = editList.getSelectedIndex();
                            controller.swapModel(index);
                        }
                    }
                });

        nameTf.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        controller.setModelProperty(new KeyValuePair(AbstractController.CHARACTER_NAME, nameTf.getText()));
                    }
                }
        );

        healthSpn.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        int value = (Integer)healthSpn.getValue();
                        controller.setModelProperty(new KeyValuePair(AbstractController.HEALTH, value));
                    }
                }
        );

        armourSld.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        int value = armourSld.getValue();
                        controller.setModelProperty(new KeyValuePair(AbstractController.ARMOUR, value));
                    }
                }
        );

        walkSpn.setModel(new SpinnerNumberModel(0.0, 0.0, 6.0, 0.1));
        walkSpn.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        controller.setModelProperty(new KeyValuePair(AbstractController.WALK_SPEED,
                                doubleToFloat((double)walkSpn.getValue())));
                    }
                }
        );

        runSpn.setModel(new SpinnerNumberModel(6.0, 6.0, 12.0, 0.1));
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

        jumpSpn.setModel(new SpinnerNumberModel(0.0, 0.0, 3.0, 0.05));
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


        this.setContentPane(mainPanel);

        initialise(1,1);
    }

    public void setupEditorList(String[] names) {
        editList.setListData(names);
    }

    @Override
    public void update(KeyValuePair data) {

        int selected = tabbedPane.getSelectedIndex();

        if(selected == 0) {
            switch (data.key) {
                case AbstractController.CHARACTER_NAME:
                    nameTf.setText(data.value.toString());
                    break;

                case AbstractController.HEALTH:
                    healthSpn.setValue((int) data.value);
                    break;

                case AbstractController.ARMOUR:
                    armourSld.setValue((int) data.value);
                    break;

                case AbstractController.WALK_SPEED:
                    walkSpn.setValue(floatToDouble((float) data.value));
                    break;

                case AbstractController.RUN_SPEED:
                    runSpn.setValue(floatToDouble((float) data.value));
                    if ((double)runSpn.getValue() < 6.0) {
                        runSpn.setValue(6.0);
                    }
                    break;

                case AbstractController.JUMP_HEIGHT:
                    jumpSpn.setValue(floatToDouble((float) data.value));
                    break;
            }
        }
        else if(selected == 1) {
            switch (data.key) {
                case AbstractController.CHARACTER_NAME:
                    nameLbl.setText(data.value.toString());
                    break;

                case AbstractController.HEALTH:
                    healthLbl.setText(data.value.toString());
                    break;

                case AbstractController.ARMOUR:
                    armourLbl.setText(data.value.toString());
                    break;

                case AbstractController.WALK_SPEED:
                    walkLbl.setText(data.value.toString());
                    break;

                case AbstractController.RUN_SPEED:
                    runLbl.setText(data.value.toString());
                    break;

                case AbstractController.JUMP_HEIGHT:
                    jumpLbl.setText(data.value.toString());
                    break;
            }
        }
    }
}
