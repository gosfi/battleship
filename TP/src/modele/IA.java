package modele;

import modele.Shoot;
import vue.PlateauJeu;
import java.util.ArrayList;
public class IA {
	PlateauJeu plateau;
	ArrayList array;
	Shoot shoot = new Shoot();
	
	public void tourIA() {
		shoot.actionShoot(plateau.);
	}
}
