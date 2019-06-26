package controlleur;

import vue.*;
import modele.*;

import java.util.ArrayList;

import javax.swing.*;

public class Control {

	Menu leMenu;
	PlateauJeu lePlateauJeu;
	Player leModele;

	public void bateauStatut() {
		leModele.getStatut(lePlateauJeu.getIndice());
	}
	public void setMenu(Menu menu) {
		this.leMenu=menu;
	}
	
	public void setPlateau(PlateauJeu lePlateauJeu) {
		this.lePlateauJeu = lePlateauJeu;
	}
	
	public void setModele(Player leModele) {
		this.leModele=leModele;
	}

	public ArrayList<Bateaux> passArrayToview() {
		return this.leModele.getArrayBateau();
	}
}