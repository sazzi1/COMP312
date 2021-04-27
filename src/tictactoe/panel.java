package tictactoe;

import javax.swing.*;
import java.awt.*;

public class panel {
    static JButton resetButton = new JButton("Reset");
    public static void panel() {
        JFrame window = new JFrame("Tic-Tac-Toe");
        JButton[] button;
        JButton resetButton = new JButton("Reset");
        String letter = "";
        button = new JButton[9];
        window.setSize(600, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel gameBoard = new JPanel(new GridLayout(3, 3));
        window.add(mainPanel);
        gameBoard.setPreferredSize(new Dimension(500, 500));
        mainPanel.add(gameBoard, BorderLayout.NORTH);
        mainPanel.add(TicTacToe.resetButton);
        for (int i = 0; i < 9; i++) {
            TicTacToe.buttons[i] = new TicTacToe.button();
            gameBoard.add(TicTacToe.buttons[i]);

        }
        window.setVisible(true);
        window.setResizable(false);
    }
}