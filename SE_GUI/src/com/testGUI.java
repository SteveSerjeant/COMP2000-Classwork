package com;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import  java.util.Date;

public class testGUI extends JFrame{
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JButton loadBtn;
    private JTextField textDisplay;
    private JLabel displayLbl;

    public testGUI(){

        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();
        loadBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scanner scan = null;
                try {
                    scan = new Scanner(new File("resources\\data.txt"));
                    StringBuilder sb = new StringBuilder();
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                CharArrayWriter sb = null;
                while (scan.hasNext())
                {
                    sb.append(scan.next());
                }
            //textDisplay.setText();
                textDisplay.setText(sb.toString());
            }
        });
    }

    public static void main(String[] args) throws FileNotFoundException {

        testGUI page = new testGUI();
        page.setVisible(true);
//        TwoPanels twoPanels = new TwoPanels();
//        twoPanels.initialise();
        System.out.println("Number of Threads "+ Thread.activeCount());

        Thread[] currentThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(currentThreads);
        for(Thread thread : currentThreads){
            System.out.println("Current Thread " + thread.getName());
        }
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        File file = new File("resources\\data.txt");
        if (file.exists()){
            System.out.println("Name: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length());
        }
        else{

            System.out.println("File does not exist!");
        }

        //schedule this for event dispatch
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
                TwoPanels();
            }
        });

    }
    static void TwoPanels(){

        JButton loadButton;
        JTextArea textDisplayArea;
        JScrollPane scrollPane;
        JFrame frame = new JFrame("Colour");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBackground(Color.red);
        frame.setPreferredSize(new Dimension(300, 600));
        frame.setLayout(new GridLayout(2,1));

        loadButton = new JButton("Load Data");
        textDisplayArea = new JTextArea("Data Display");
        textDisplayArea.setLineWrap(true);
        scrollPane = new JScrollPane(textDisplayArea);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

//    {
//
//        public JFrame frame;
//
//        private JButton loadButton;
//        private JTextArea textDisplayArea;
//        private JScrollPane scrollPane;
//
//        public void initialise(){
//
//            frame = new JFrame("Swing Updates");
//            frame.setLayout(new GridLayout(2,1));
//
//            loadButton = new JButton("Load Data");
//            textDisplayArea = new JTextArea("Data Display");
//            textDisplayArea.setLineWrap(true);
//            scrollPane = new JScrollPane(textDisplayArea);
//        }
//    }


}
