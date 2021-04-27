import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    JPanel panel = new JPanel();
    JLabel instruction = new JLabel("Please Select a Game:");
    //Select Games
    JLabel gameSelect = new JLabel(":");
    String[] choices = {
            "",
            "Tic Tac Toe",
    };
    public JComboBox choicesButton = new JComboBox(choices);
    public JButton beginButton = new JButton("Begin!");
    public JButton exit = new JButton("Exit");

    //CREATE GUI - name, size
    //Add text box
    public GUI() {
        super("Game Catalog");
        setSize(625, 300);
        setResizable(true);
        panel.add(instruction);
        panel.add(gameSelect);
        panel.add(choicesButton);
        panel.add(beginButton);
        panel.add(exit);
        add(panel);
        setVisible(true);

        //EXIT PROGRAM
        exit.addActionListener(new ActionListener() { //add event listener to exit
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); //close
            }
        });

        choicesButton.addActionListener(new ActionListener() { // add event listener to choicesButton
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                String choices = (String) cb.getSelectedItem();
                assert choices != null;
                if ((choices).equals("Snake")) {
                    beginButton.addActionListener(new ActionListener() { // add event listener to beginButton
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });

                }

                if ((choices).equals("")) {
                    beginButton.addActionListener(new ActionListener() { // add event listener to beginButton
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                }

                if ((choices).equals("Tic Tac Toe")) {
                    beginButton.addActionListener(new ActionListener() { // add event listener to beginButton
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            tictactoe.panel.panel(); //launch game
                        }
                    });
                }

                if ((choices).equals("")) {
                    beginButton.addActionListener(new ActionListener() { // add event listener to beginButton
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                }

                if ((choices).equals("")) {
                    beginButton.addActionListener(new ActionListener() { // add event listener to beginButton
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                }
            }
        });
    }
    public static void main(String[] args) {
        new GUI();
    }
}