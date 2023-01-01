/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TresEnRayaOy implements ActionListener {

    private TresEnRaya t;
    private JLabel display;
	
    public TresEnRayaOy(TresEnRaya t, JLabel display){
        this.t = t;
        this.display = display;	
    }
	
    public void actionPerformed(ActionEvent e){
        JButton clickedButton = (JButton) e.getSource(); 
        clickedButton.setEnabled(false);
        clickedButton.getParent();
        if (t.getPlayer() == false){
            clickedButton.setText("X");
            t.setPlayer(true);
            display.setText("Jugador2 - O");
            if (t.isWinner("X")){
            JOptionPane.showMessageDialog(t, "Gana partida Jugador1. ¡Felicidades!");
            }
        } else {
            clickedButton.setText("O");
            t.setPlayer(false);
            display.setText("Player 1: X");			
            if (t.isWinner("O")){
                JOptionPane.showMessageDialog(t, "Gana partida Jugador2. ¡Felicidades!");
            }			
        }
    }
}