package modele;

import java.util.ArrayList;

public class Bateaux {
	public enum TypeBateaux {

		PORTE_AVIONS, DESTROYER, SOUS_MARIN, PATROUILLE
	}

	ArrayList<Integer> arrayNumbreOfButton;

	public Bateaux(TypeBateaux typeBateaux) {
		arrayNumbreOfButton = new ArrayList<>();

	}

	public void addNombreDeLaCase(TypeBateaux typeBateaux, int numbreOfButton) {
		int nbCases;
		switch (typeBateaux) {

		case PORTE_AVIONS:
			nbCases = 4;
			for (int i = 0; i < nbCases; i++) {
				arrayNumbreOfButton.add(numbreOfButton + i);
			}
			break;
		case DESTROYER:
			nbCases = 3;
			for (int i = 0; i < nbCases; i++) {
				arrayNumbreOfButton.add(numbreOfButton + i);
			}
			break;
		case SOUS_MARIN:
			nbCases = 3;
			for (int i = 0; i < nbCases; i++) {
				arrayNumbreOfButton.add(numbreOfButton + i);
			}
			break;
		case PATROUILLE:
			nbCases = 2;
			for (int i = 0; i < nbCases; i++) {
				arrayNumbreOfButton.add(numbreOfButton + i);
			}
			break;
		}

	}

}