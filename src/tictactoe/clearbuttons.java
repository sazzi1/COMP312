package tictactoe;

public class clearbuttons {
    //clear buttons
    //remove all mouse clicks and resets to fresh
    public static void clearButtons() {
        for (int i = 0; i <= 8; i++) {
            TicTacToe.buttons[i].setText("");
            TicTacToe.buttons[i].setEnabled(true);
            TicTacToe.buttons[i].setFocusable(false);
        }
        TicTacToe.count = 0; // reset the count
        //Reset whole panel
        //Dont want to use this, testing purposes onlu
        //panel.panel();

    }
}
