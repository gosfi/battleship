package modele;

import java.util.ArrayList;
import java.util.Random;

public class Player {
	public enum StatutBateau {
		TOUCHE, COULE, RATE
	}

	private ArrayList<Bateaux> arrayBateauPlayer;

	public Player() {
		arrayBateauPlayer = new ArrayList<>();
		

		Bateaux porteAvions = new Bateaux(Bateaux.TypeBateaux.PORTE_AVIONS);
		Bateaux destroyer = new Bateaux(Bateaux.TypeBateaux.DESTROYER);
		Bateaux sousMarin = new Bateaux(Bateaux.TypeBateaux.SOUS_MARIN);
		Bateaux patrouille = new Bateaux(Bateaux.TypeBateaux.PATROUILLE);

		arrayBateauPlayer.add(porteAvions);
		arrayBateauPlayer.add(destroyer);
		arrayBateauPlayer.add(sousMarin);
		arrayBateauPlayer.add(patrouille);
		
		initPlacementOfShip();
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

		for (int i = 0; i < this.arrayBateauPlayer.size(); i++) {
			Bateaux bateauCourant = this.arrayBateauPlayer.get(i);

			do {

				boolean vertical = new Random().nextBoolean();

				if (vertical) {
					ligne = new Random().nextInt(11 - bateauCourant.sizeBateau) + 1;
					colonne = new Random().nextInt(10) + 1;
				}

				else {
					ligne = new Random().nextInt(10) + 1;
					colonne = new Random().nextInt(11 - bateauCourant.sizeBateau) + 1;
				}

				valueCase = (ligne - 1) * 10 + colonne;

				bateauCourant.initCasesOftShip(valueCase, vertical);

				// tant que c vrai je regarde lautre
				int cpt = 1;
				while (gridBool.get(bateauCourant.getArrayOfButtonNumber().get(cpt-1)) == true
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
		StatutBateau statutBateau=StatutBateau.RATE;

		for (int i = 0; i < this.arrayBateauPlayer.size(); i++) {	
			for (int j = 0; j < this.arrayBateauPlayer.get(i).getArrayOfButtonNumber().size(); j++)

				if (valueCase == this.arrayBateauPlayer.get(i).getArrayOfButtonNumber().get(j)) {
					statutBateau = StatutBateau.TOUCHE;
					this.arrayBateauPlayer.get(i).getArrayOfButtonNumber().remove(j);
					if(this.arrayBateauPlayer.get(i).getArrayOfButtonNumber().isEmpty()) {
						statutBateau = StatutBateau.COULE;
					}
				} 
		}

		return statutBateau;
	}
	
	public ArrayList<Bateaux> getArrayBateau(){
		return this.arrayBateauPlayer;
		
	}

}
