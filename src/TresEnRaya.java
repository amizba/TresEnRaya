/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TresEnRaya extends JFrame {

    private boolean player = false;
    JButton[] buttons = new JButton[9];			
	
    public TresEnRaya() {
        super("Tres en Raya");
        getContentPane().setLayout(new BorderLayout());		
        JLabel display = new JLabel("Jugador1 - X");
        JPanel buttonsPanel = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++){
            buttons[i] = new JButton();
            buttonsPanel.add(buttons[i]);
            buttons[i].addActionListener(new TresEnRayaOy(this, display));
        }
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(buttonsPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320,240);
        setVisible(true);
    }
		
    public boolean getPlayer(){
        return player;
    }
	
    public void setPlayer(boolean player){
        this.player = player;
    }	

    /**
     * Calculates if a player is a winner checking the eight possible ways
     * of being a winner in tictactoe
     * @param value. The value representing the player ("X") or ("O")
     * @return If the player represented by the value is a winner
     * 
     */
    
    public boolean isWinner(String value){
        if (buttons[0].getText().equals(value) && buttons[1].getText().equals(value)
            && buttons[2].getText().equals(value)){
            return true;
        } else if (buttons[3].getText().equals(value) && buttons[4].getText().equals(value)
            && buttons[5].getText().equals(value)){
           return true;
        } else if (buttons[6].getText().equals(value) && buttons[7].getText().equals(value)
            && buttons[8].getText().equals(value)){
           return true;
        } else if (buttons[0].getText().equals(value) && buttons[3].getText().equals(value)
            && buttons[6].getText().equals(value)){
           return true;
        } else if (buttons[1].getText().equals(value) && buttons[4].getText().equals(value)
            && buttons[7].getText().equals(value)){
           return true;
        } else if (buttons[2].getText().equals(value) && buttons[5].getText().equals(value)
            && buttons[8].getText().equals(value)){
           return true;
        } else if (buttons[0].getText().equals(value) && buttons[4].getText().equals(value)
            && buttons[8].getText().equals(value)){
           return true;
        } else if (buttons[2].getText().equals(value) && buttons[4].getText().equals(value)
            && buttons[6].getText().equals(value)){
           return true;
        } else {
           return false;
        }	
    }
	
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	TresEnRaya gui = new TresEnRaya();
            }
        });
    }
}