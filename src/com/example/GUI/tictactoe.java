package com.example.GUI;

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

class tictactoe extends JFrame {
    JButton[] boardButtons = new JButton[9];
    JButton resetButton = new JButton("Reset");
    JFrame frame = new JFrame("Tic Tac Toe");


    public tictactoe() {
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    public static void main(String[] args) {
        tictactoe game = new tictactoe();

    }
}