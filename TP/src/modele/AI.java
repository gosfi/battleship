package modele;

import java.util.ArrayList;
import java.util.Random;

import modele.Player.StatutBateau;

public class AI {

	private ArrayList<Bateaux> arrayBateauAI;
	// private ArrayList<Integer> arrayGridPlayer;

	public AI() {
		arrayBateauAI = new ArrayList<>();

		Bateaux porteAvions = new Bateaux(Bateaux.TypeBateaux.PORTE_AVIONS);
		Bateaux destroyer = new Bateaux(Bateaux.TypeBateaux.DESTROYER);
		Bateaux sousMarin = new Bateaux(Bateaux.TypeBateaux.SOUS_MARIN);
		Bateaux patrouille = new Bateaux(Bateaux.TypeBateaux.PATROUILLE);

		arrayBateauAI.add(porteAvions);
		arrayBateauAI.add(destroyer);
		arrayBateauAI.add(sousMarin);
		arrayBateauAI.add(patrouille);
	}

	public void initPlacementOfShip() {
		int ligne;
		int colonne;
		int valueCase;
		boolean goodCheckUp = false;
		ArrayList<Boolean> gridBool = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			gridBool.add(true);

		}

		for (int i = 0; i < this.arrayBateauAI.size(); i++) {
			Bateaux bateauCourant = this.arrayBateauAI.get(i);

			do {

				boolean vertical = new Random().nextBoolean();

				if (vertical) {
					ligne = new Random().nextInt(12 - bateauCourant.sizeBateau) + 1;
					colonne = new Random().nextInt(10) + 1;
				}

				else {
					ligne = new Random().nextInt(10) + 1;
					colonne = new Random().nextInt(11 - bateauCourant.sizeBateau) + 1;
				}

				valueCase = (ligne - 1) * 10 + colonne;

				bateauCourant.initCasesOftShip(valueCase, vertical);

				// tant que c vrai je regarde lautre
				int cpt = 0;
				while (gridBool.get(bateauCourant.getArrayOfButtonNumber().get(cpt)) == true
						&& cpt < bateauCourant.sizeBateau) {

					cpt++;
				}

				if (cpt == bateauCourant.sizeBateau) {
					goodCheckUp = true;
				}

			} while (goodCheckUp == false);

			for (int j = 0; j < bateauCourant.getArrayOfButtonNumber().size(); j++) {
				gridBool.add(bateauCourant.getArrayOfButtonNumber().get(j), false);
			}

		}

	}

	public StatutBateau getStatut(int valueCase) {
		StatutBateau statutBateau = StatutBateau.RATE;

		for (int i = 0; i < this.arrayBateauAI.size(); i++) {
			for (int j = 0; j < this.arrayBateauAI.get(i).getArrayOfButtonNumber().size(); j++)

				if (valueCase == this.arrayBateauAI.get(i).getArrayOfButtonNumber().get(j)) {
					statutBateau = StatutBateau.TOUCHE;
					this.arrayBateauAI.get(i).getArrayOfButtonNumber().remove(j);
					if (this.arrayBateauAI.get(i).getArrayOfButtonNumber().isEmpty()) {
						statutBateau = StatutBateau.COULE;
					}
				}
		}

		return statutBateau;
	}

}
