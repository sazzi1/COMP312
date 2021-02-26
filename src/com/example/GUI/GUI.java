package com.example.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI extends JFrame{
    JPanel panel=new JPanel();

    JLabel instruction=new JLabel("Please Select a Game:");
    //ADD CHOICES TO DROPDOWN
    JLabel gameSelect=new JLabel("Games:");
    String choices[] = {
            "Snake",
            "Hangman",
            "Tic Tac Toe",
            "",
            "",
            "",
    };
    //ADD BUTTONS
    public JComboBox choicesButton = new JComboBox(choices);
    public JButton beginButton=new JButton("Begin!");
    public JButton exit = new JButton("Exit");
    //INIT GUI
    public static void main(String[] args){
        new GUI();
    }
    //CREATE GUI
    public GUI(){
        super("Game Catalog");
        setSize(625,300);
        setResizable(true);
        panel.add(instruction);
        panel.add(gameSelect);
        panel.add(choicesButton);
        panel.add(beginButton);
        panel.add(exit);
        add(panel);

        setVisible(true);

        beginButton.addActionListener(new ActionListener() {// add event listener to beginButton
            @Override
            public void actionPerformed(ActionEvent e){
                tictactoe T = new tictactoe();
            }
        });
        //EXIT PROGRAM
        exit.addActionListener(new ActionListener() {//add event listener to exit
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);//close
            }
        });
        //DIRECTORY CHOICES
        choicesButton.addActionListener(new ActionListener(){// add event listener to choicesButton
            public void actionPerformed(ActionEvent e) {
                //fetch user choice from drop down
                JComboBox cb = (JComboBox) e.getSource();
                //set choices equal to selected item in JComboBox cb... Updates live!
                String choices = (String) cb.getSelectedItem();
                // if choice is downloads, get downloads location and set as folderPath
                if ((choices).equals("Snake")) {

                }
                // if choice is desktop, get desktop location and set as folderPath
                if ((choices).equals("Hangman")) {

                }
                // if choice is documents, get documents location and set as folderPath
                if ((choices).equals("Tic Tac Toe")) {

                }
                // if choice is pictures, get pictures location and set as folderPath
                if ((choices).equals("")) {// if choice is pictures, get pictures location and set as folderPath

                }
                // if choice is root, get root location and set as folderPath
                if ((choices).equals("")) {

                }
            }
        });
    }
}