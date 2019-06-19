package modele;

import java.util.ArrayList;

public class Bateaux {
	public enum TypeBateaux {

		PORTE_AVIONS, DESTROYER, SOUS_MARIN, PATROUILLE
	}

	ArrayList<Integer> arrayNumbreOfButton;
	
	private int nbCases;

	public Bateaux(TypeBateaux typeBateaux) {
		arrayNumbreOfButton  =new ArrayList<>();

		

	}

	public int getNbCases() {
		return this.nbCases;
	}

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