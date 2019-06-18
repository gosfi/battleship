package modele;

public class Bateaux {
	public enum TypeBateaux {

		PORTE_AVIONS, DESTROYER, SOUS_MARIN, PATROUILLE
	}

	private int nbCases;

	public Bateaux(TypeBateaux typeBateaux) {
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
		}

	}

	public int getNbCases() {
		return this.nbCases;
	}

}
