package com;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Distances extends JFrame {
    private JPanel mainPanel;
    private JSpinner milesSpinner;
    private JLabel kmLbl;

    public Distances(String distances){
         setContentPane(mainPanel);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setPreferredSize(new Dimension(500,500));
         pack();

        milesSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                /* get the value from the milesSpinner as an INT value */
                int miles = (int) milesSpinner.getValue();
                /* println to check previous action*/
                /*System.out.println(miles);*/

                /* create a float variable to store the miles to km conversion*/
                float km = (float) miles * 1.609f;
                /* println to check previous action*/
                /*System.out.println(km);*/

                /* output the float variable to the kmLbl label*/
                kmLbl.setText(Float.toString(km));


            }
        });
    }
}
