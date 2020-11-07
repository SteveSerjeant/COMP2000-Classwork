package com;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Temperature extends JFrame {

    private JPanel mainPanel;
    private JSpinner celsiusSpinner;
    private JLabel fahrenheitLbl;

    public Temperature(String title){

        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();
        celsiusSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                /* get the value from the celsiusSpinner as an INT value */
                int celsius = (int) celsiusSpinner.getValue();
                 /* println to check previous action */
//                 System.out.println(celsius);

                /* create a float variable to store the celsius to
                fahrenheit conversion*/
                float fahrenheit  = (float) (celsius * (9.0f / 5.0f)) +32;
                /* println to check previous action*/
                /*System.out.println(fahrenheit);*/

                fahrenheitLbl.setText(Float.toString(fahrenheit));

            }
        });
    }
}
