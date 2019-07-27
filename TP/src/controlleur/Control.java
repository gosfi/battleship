package controlleur;

import vue.*;
import modele.*;
import modele.AI.StatutBateauAI;
import modele.Player.StatutBateauPlayer;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class Control {
	public static boolean tourAI = false;
	Menu leMenu;
	PlateauJeu lePlateauJeu;
	Player leModele;
	AI ai;
	Shoot shotAi;
	int casePeformed = -1;

	public void bateauStatut() {
		leModele.getStatut(lePlateauJeu.getIndice());
	}

	public void setMenu(Menu menu) {
		this.leMenu = menu;
	}

	public void setPlateau(PlateauJeu lePlateauJeu) {
		this.lePlateauJeu = lePlateauJeu;
	}

	public void setModele(Player leModele) {
		this.leModele = leModele;
	}

	public ArrayList<Bateaux> passArrayToview() {
		return this.leModele.getArrayBateau();
	}

	public StatutBateauAI statutEnemy(int casePerformed) {
		return this.ai.getStatut(casePerformed);
	}

	public StatutBateauPlayer statutPlayer(int casePerformed) {
		return this.leModele.getStatut(casePerformed);
	}

	public void setCase(int casePerformed) {

		this.casePeformed = casePerformed;

	}

	public void setTourAI() {
		tourAI = true;


	}
	public void lancerPartieOffline() {
		this.ai = new AI();
		ai.initPlacementOfShip();
	}
}
