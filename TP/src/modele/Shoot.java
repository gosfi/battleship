package modele;

import java.awt.Color;

import javax.swing.JButton;

public class Shoot {
public void actionShoot(JButton boutons) {
		
    	boutons.setBackground(Color.white);
    	boutons.setText("");
    	boutons.setEnabled(false);
	}
}
