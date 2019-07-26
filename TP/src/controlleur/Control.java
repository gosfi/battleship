package controlleur;

import vue.*;
import modele.*;
import modele.Player.StatutBateau;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class Control {
	public static boolean tourAI = false;
	Menu leMenu;
	PlateauJeu lePlateauJeu;
	Player leModele;
	AI ai;
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

	public StatutBateau statutEnemy(int casePerformed) {
		return this.ai.getStatut(casePerformed);
	}

	public StatutBateau statutPlayer(int casePerformed) {
		return this.leModele.getStatut(casePerformed);
	}

	public void setCase(int casePerformed) {

		this.casePeformed = casePerformed;

	}

	public void setTour() {
		tourAI = true;
	}

	public void lancerPartieOffline() {
        ai = new AI();
        ai.initPlacementOfShip();
		boolean gameOver = false;

		int cptPlayer = 0, cptAi = 0;

		while (gameOver) {



			if (Control.tourAI == false) {
				StatutBateau statutAi = ai.getStatut(casePeformed);
				Control.tourAI = true;

				if (statutAi == StatutBateau.TOUCHE || statutAi == StatutBateau.COULE) {
					cptPlayer++;
				}
			} else {
				int caseAi = new Random().nextInt(100);
				StatutBateau statutPlayer = this.leModele.getStatut(caseAi);
				if (statutPlayer == StatutBateau.TOUCHE || statutPlayer == StatutBateau.COULE) {
					cptAi++;
					this.lePlateauJeu.setIndice(caseAi);
				} else {
					this.lePlateauJeu.setIndice(caseAi);
				}
			}
			if (cptPlayer == 12 || cptAi == 12) {
				gameOver = true;
			}
		}

	}

}
