package com.example.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class tictactoe implements ActionListener {
    JFrame window = new JFrame("Tic-Tac-Toe");
    JButton[] button;
    JButton resetButton = new JButton("Reset");
    String letter = "";
    public int count = 0;
    public boolean win = false;



    public tictactoe(){

        button = new JButton[9];
        window.setSize(600,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //window.setLayout(new GridLayout(3,3));
        JButton blank = new JButton("");
        //Font font = blank.getFont();
        //Font bigFont = font.deriveFont(font.getSize2D() * 5.0f);
        //Buttons


        //Create New GAme
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel gameBoard = new JPanel(new GridLayout(3,3));
        window.add(mainPanel);
        gameBoard.setPreferredSize(new Dimension(500,500));
        mainPanel.add(gameBoard, BorderLayout.NORTH);
        mainPanel.add(resetButton);
        for(int i = 0; i < 9; i++) {
            button[i] = new JButton();
            button[i].setBackground(Color.BLACK);
            button[i].setText("");
            button[i].setVisible(true);
            gameBoard.add(button[i]);
            button[i].addActionListener(this);
            button[i].setFont(new Font("SansSerif", Font.BOLD, 100));

            //window.add(button[i]);
        }
        window.setVisible(true);
        window.setResizable(false);

    }

    public void actionPerformed(ActionEvent a) {
        count++;
        if(count % 2 == 1)
            letter = "X";
        else
            letter = "O";
        Object but = a.getSource();
        for(int i = 0; i < 9; i++) {
            if(but == button[i]) {
                button[i].setText(letter);
                button[i].setEnabled(false);
                break;
            }
        }

        resetButton.addActionListener(new ActionListener() {//add event listener to exit
            //@Override
            char[] board = {' ',' ',' ',
                    ' ',' ',' ',
                    ' ',' ',' '};
            public void actionPerformed(ActionEvent e) {
                for (int i=0; i<this.board.length; i++) {
                    this.board[i] = ' ';
                }
                for (int i=0; i<9; i++) {
                    button[i].setText("");
                    button[i].setEnabled(true);

                }
                //board.reset();
            }
        });


//      horizontal wins
        if( button[0].getText() == button[1].getText() && button[1].getText() == button[2].getText() && button[0].getText() != ""){
            win = true;
        }
        else if(button[3].getText() == button[4].getText() && button[4].getText() == button[5].getText() && button[3].getText() != ""){
            win = true;
        }
        else if(button[6].getText() == button[7].getText() && button[7].getText() == button[8].getText() && button[6].getText() != ""){
            win = true;
        }//virticle wins
        else if(button[0].getText() == button[3].getText() && button[3].getText() == button[6].getText() && button[0].getText() != ""){
            win = true;
        }
        else if(button[1].getText() == button[4].getText() && button[4].getText() == button[7].getText() && button[1].getText() != ""){
            win = true;
        }
        else if(button[2].getText() == button[5].getText() && button[5].getText() == button[8].getText() && button[2].getText() != ""){
            win = true;
        }//diagonal wins
        else if(button[0].getText() == button[4].getText() && button[4].getText() == button[8].getText() && button[0].getText() != ""){
            win = true;
        }
        else if(button[2].getText() == button[4].getText() && button[4].getText() == button[6].getText() && button[2].getText() != ""){
            win = true;
        }
        else {
            win = false;
        }/*Show a dialog if someone wins or the game is tie*/
        if(win == true){
            JOptionPane.showMessageDialog(null, letter + " WINS!");
        } else if(count == 9 && win == false){
            JOptionPane.showMessageDialog(null, "Tie Game!");
        }


    }public static void main(String[] args){
        tictactoe start = new tictactoe();

    }
}


