package modele;

import java.util.ArrayList;

public class Bateaux {
	public enum TypeBateaux {

		PORTE_AVIONS, DESTROYER, SOUS_MARIN, PATROUILLE
	}

	ArrayList<Integer> arrayNumbreOfButton;
<<<<<<< HEAD
	
	private int nbCases;
=======
	int sizeBateau;
>>>>>>> af261c2772e1da081607fc063c0daeed8144dddd

	public Bateaux(TypeBateaux typeBateaux) {
		arrayNumbreOfButton  =new ArrayList<>();

<<<<<<< HEAD
		

	}
=======
		switch (typeBateaux) {

		case PORTE_AVIONS:
			this.sizeBateau = 4;
			break;

		case DESTROYER:
			this.sizeBateau = 3;
			break;

		case SOUS_MARIN:
			this.sizeBateau = 3;
			break;

		case PATROUILLE:
			this.sizeBateau = 2;
			break;
		}
>>>>>>> af261c2772e1da081607fc063c0daeed8144dddd

	public int getNbCases() {
		return this.nbCases;
	}

<<<<<<< HEAD
	public void addNombreDeLaCase(TypeBateaux typeBateaux ,int numbreOfButton) {
		
		
		
		
	arrayNumbreOfButton.add(numbreOfButton);
	}
	
	
	
	
}

/*
switch (typeBateaux) {

case PORTE_AVIONS:
	this.nbCases = 4;
	break;
case DESTROYER:
	this.nbCases = 3;
	break;
case SOUS_MARIN:
	this.nbCases = 3;
	break;
case PATROUILLE:
	this.nbCases = 2;
	break;
}*/
=======
	public int getSizeBateau() {
		return this.sizeBateau;
	}

	public ArrayList<Integer> getArrayOfButtonNumber() {
		return this.arrayNumbreOfButton;
	}

	public void initCasesOftShip(int numbreOfCase, boolean vertical) {
		if (vertical == true) {
			for (int i = 0; i < this.sizeBateau; i++) {
				arrayNumbreOfButton.add(numbreOfCase + i * 10);
			}
		}

		else {
			for (int i = 0; i < this.sizeBateau; i++) {
				arrayNumbreOfButton.add(numbreOfCase + i * 1);
			}
		}

	}

}
>>>>>>> af261c2772e1da081607fc063c0daeed8144dddd
