package modele;

import modele.Shoot;
import vue.*;
import java.util.ArrayList;
import java.util.Random;

public class IA {

	// PlateauJeu plateau;
	PlateauJeu plateau;
	Shoot shoot = new Shoot();
	public boolean a = false;

	public void IAAction() {
		shoot.actionShoot(this.plateau.getArrayPlayer().get(new Random().nextInt(100)));
		

	}

	public PlateauJeu getPlateauJeu() {
		return this.plateau;
	}

	public void setPlateauJeu(PlateauJeu plateau) {
		this.plateau = plateau;
	}
}
