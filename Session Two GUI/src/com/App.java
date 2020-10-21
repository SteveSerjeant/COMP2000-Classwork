package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JPanel mainPanel;
    private JTextField emailText;
    private JButton subscribeBtn;
    private JLabel outputLbl;

    public App(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        pack();

        subscribeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                /* get the text from the email text field */
                String email = emailText.getText();

                /* check if the text field is empty */
                if (email.equals("")){
                    outputLbl.setText("Please enter an email address");
                }
                else{
                    outputLbl.setText("Signed up with: " + email);
                    emailText.setText("");
                }

            }
        });
    }

    public static void main(String[] args){

        App page = new App();
        page.setVisible(true);
    }
}
