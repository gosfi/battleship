package modele;

import java.util.ArrayList;
import java.util.Random;

public class Player {
	public enum StatutBateau {
		TOUCHE, COULE, RATE
	}

	private ArrayList<Bateaux> arrayBateauPlayer;
	private ArrayList<Integer> arrayGridPlayer;

	public Player() {
		arrayBateauPlayer = new ArrayList<>();
		arrayGridPlayer = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			arrayGridPlayer.add(i);
		}
		
		Bateaux porteAvions = new Bateaux(Bateaux.TypeBateaux.PORTE_AVIONS);
		Bateaux destroyer = new Bateaux(Bateaux.TypeBateaux.DESTROYER);
		Bateaux sousMarin = new Bateaux(Bateaux.TypeBateaux.SOUS_MARIN);
		Bateaux patrouille = new Bateaux(Bateaux.TypeBateaux.PATROUILLE);
		
		porteAvions.initCasesOftShip(new Random().nextInt(100), false);


	}

}
