package modele;

import vue.PlateauJeu;

import java.awt.Color;
import vue.PlateauJeu;
import javax.swing.*;

public class Shoot {
	PlateauJeu plat;
public void actionShoot(JButton boutons) {

			boutons.setBackground(Color.white);
			boutons.setText("");
			boutons.setEnabled(false);
			plat.finPartieBug();

	}
}
