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

	public boolean setTour() {
		tourAI = true;
        return tourAI;

	}

	public void lancerPartieOffline() {
        ai = new AI();
       // ai.initPlacementOfShip();
		boolean gameOver = false;

		int cptPlayer = 0, cptAi = 0;

		while (gameOver) {


			if (Control.tourAI == false) {



			if (tourAI == false) {

				StatutBateau statutAi = ai.getStatut(casePeformed);
				tourAI = true;

				if (statutAi == StatutBateau.TOUCHE || statutAi == StatutBateau.COULE) {
					cptPlayer++;
				}
			} else if (tourAI == true) {
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
	}
