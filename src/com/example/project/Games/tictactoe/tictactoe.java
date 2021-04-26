package com.example.project.Games.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class tictactoe implements ActionListener {
    public int count = 0;
    public boolean win = false;
    JFrame window = new JFrame("Tic-Tac-Toe");
    JButton[] button;
    JButton resetButton = new JButton("Reset");
    String letter = "";

    public tictactoe() {
        button = new JButton[9];
        window.setSize(600, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel gameBoard = new JPanel(new GridLayout(3, 3));
        window.add(mainPanel);
        gameBoard.setPreferredSize(new Dimension(500, 500));
        mainPanel.add(gameBoard, BorderLayout.NORTH);
        mainPanel.add(resetButton);
        for (int i = 0; i < 9; i++) {
            button[i] = new JButton();
            button[i].setBackground(Color.WHITE);
            button[i].setText("");
            button[i].setVisible(true);
            gameBoard.add(button[i]);
            button[i].addActionListener(this);
            button[i].setFont(new Font("SansSerif", Font.BOLD, 100));
            button[i].setFocusable(false);
        }
        window.setVisible(true);
        window.setResizable(false);
    }



    public void actionPerformed(ActionEvent a) {
        count++;
        if (count % 2 == 1)
            letter = "X";
        else
            letter = "O";
        Object but = a.getSource();
        for (int i = 0; i < 9; i++) {
            if (but == button[i]) {
                button[i].setText(letter);
                button[i].setEnabled(false);
                button[i].setFocusable(false);
                break;
            }
        }

        resetButton.addActionListener(new ActionListener() {//add event listener to exit
            //@Override

            final char[] board = {' ', ' ', ' ',
                    ' ', ' ', ' ',
                    ' ', ' ', ' '};


            public void actionPerformed(ActionEvent e) {
                Arrays.fill(this.board, ' ');
                for (int i = 0; i < 9; i++) {
                    button[i].setText("");
                    button[i].setEnabled(true);
                    button[i].setFocusable(false);
                    count = 0;
                }

            }
        });

        //Vertical
        if (button[0].getText().equals(button[1].getText()) && button[1].getText().equals(button[2].getText()) && !button[0].getText().equals("")) {
            win = true;
        } else if (button[3].getText().equals(button[4].getText()) && button[4].getText().equals(button[5].getText()) && !button[3].getText().equals("")) {
            win = true;
        } else if (button[6].getText().equals(button[7].getText()) && button[7].getText().equals(button[8].getText()) && !button[6].getText().equals("")) {
            win = true;
        }

        //Diagonal
        else if (button[0].getText().equals(button[3].getText()) && button[3].getText().equals(button[6].getText()) && !button[0].getText().equals("")) {
            win = true;
        } else if (button[1].getText().equals(button[4].getText()) && button[4].getText().equals(button[7].getText()) && !button[1].getText().equals("")) {
            win = true;
        } else if (button[2].getText().equals(button[5].getText()) && button[5].getText().equals(button[8].getText()) && !button[2].getText().equals("")) {
            win = true;
        }

        //Popup
        else if (button[0].getText().equals(button[4].getText()) && button[4].getText().equals(button[8].getText()) && !button[0].getText().equals("")) {
            win = true;
        } else
            win = button[2].getText().equals(button[4].getText()) && button[4].getText().equals(button[6].getText()) && !button[2].getText().equals("");
        if (win) {
            JOptionPane.showMessageDialog(null, letter + " WINS");
        } else if (count == 9) {
            JOptionPane.showMessageDialog(null, "Tie Game");
        }
    }

}



