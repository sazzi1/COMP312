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


        //EXIT PROGRAM
        exit.addActionListener(new ActionListener() {//add event listener to exit
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);//close
            }
        });

        choicesButton.addActionListener(new ActionListener(){// add event listener to choicesButton
            public void actionPerformed(ActionEvent e) {
                //fetch user choice from drop down
                JComboBox cb = (JComboBox) e.getSource();
                //set choices equal to selected item in JComboBox cb... Updates live!
                String choices = (String) cb.getSelectedItem();

                if ((choices).equals("Snake")) {
                    beginButton.addActionListener(new ActionListener() {// add event listener to beginButton
                        @Override
                        public void actionPerformed(ActionEvent e){

                        }
                    });

                }

                if ((choices).equals("Hangman")) {
                    beginButton.addActionListener(new ActionListener() {// add event listener to beginButton
                        @Override
                        public void actionPerformed(ActionEvent e){

                        }
                    });
                }

                if ((choices).equals("Tic Tac Toe")) {
                    beginButton.addActionListener(new ActionListener() {// add event listener to beginButton
                        @Override
                        public void actionPerformed(ActionEvent e){
                            tictactoe start = new tictactoe();

                        }
                    });
                }

                if ((choices).equals("")) {
                    beginButton.addActionListener(new ActionListener() {// add event listener to beginButton
                        @Override
                        public void actionPerformed(ActionEvent e){

                        }
                    });
                }

                if ((choices).equals("")) {
                    beginButton.addActionListener(new ActionListener() {// add event listener to beginButton
                        @Override
                        public void actionPerformed(ActionEvent e){

                        }
                    });
                }
            }
        });
    }
}