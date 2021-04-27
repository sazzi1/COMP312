package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {

    //Add the 9 buttons and reset button
    static JButton[] buttons = new JButton[9];
    static JButton resetButton = new JButton("Reset");
    //Count player moves
    public static int count = 0;
    static class button extends JButton implements ActionListener {
        boolean win = false;
        String letter = "";
        // Used to create
        // Blank Board
        public button() {
            setBackground(Color.WHITE);
            letter = "";
            setVisible(true);
            setFont(new Font("SansSerif", Font.BOLD, 100));
            setFocusable(false);
            setText(letter);
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent a) {
            if (count % 2 == 1 && getText().equals("") && win == false) {
                letter = "X";
                count = count + 1;
            } else if (count % 2 == 0 && getText().equals("") && win == false) {
                letter = "O";
                count = count + 1;
            }

            Object but = a.getSource();
            setText(letter);
            for (int i = 0; i < 9; i++) {
                if (but == buttons[i]) {
                    buttons[i].setText(letter);
                    buttons[i].setEnabled(true);
                    buttons[i].setFocusable(false);
                    break;
                }
            }

            resetButton.addActionListener(new ActionListener() { //add event listener to exit
                //Resets characters of previous session

                //Re initializes the board
                //Used when reset is selected
                public void actionPerformed(ActionEvent e) {
                    //Arrays.fill(this.board, ' ');
                    for (int i = 0; i < 9; i++) {
                        clearbuttons.clearButtons();

                    }
                    count = 0; // reset the count
                }
            });

            //Vertical winner check
            if (buttons[0].getText().equals(buttons[1].getText()) && buttons[1].getText().equals(buttons[2].getText()) && !buttons[0].getText().equals("")) {
                win = true;
            } else if (buttons[3].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[5].getText()) && !buttons[3].getText().equals("")) {
                win = true;
            } else if (buttons[6].getText().equals(buttons[7].getText()) && buttons[7].getText().equals(buttons[8].getText()) && !buttons[6].getText().equals("")) {
                win = true;
            }

            //Diagonal winner check
            else if (buttons[0].getText().equals(buttons[3].getText()) && buttons[3].getText().equals(buttons[6].getText()) && !buttons[0].getText().equals("")) {
                win = true;
            } else if (buttons[1].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[7].getText()) && !buttons[1].getText().equals("")) {
                win = true;
            } else if (buttons[2].getText().equals(buttons[5].getText()) && buttons[5].getText().equals(buttons[8].getText()) && !buttons[2].getText().equals("")) {
                win = true;
            }

            //Popup dialog to show winner or tie game
            //Also checks for tie game
            else if (buttons[0].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[8].getText()) && !buttons[0].getText().equals("")) {
                win = true;
            } else
                win = buttons[2].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[6].getText()) && !buttons[2].getText().equals("");
            if (win) {
                JOptionPane.showMessageDialog(null, letter + " WINS");
            } else if (count == 9) {
                JOptionPane.showMessageDialog(null, "Tie Game");
            }
        }
    }

}