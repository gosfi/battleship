package modele;

import modele.Shoot;
import vue.PlateauJeu;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
public class IA extends JFrame {

	PlateauJeu plateau;
	ArrayList array;
	Shoot shoot = new Shoot();
	
public IA(PlateauJeu plateau) {
	this.plateau=plateau;
	
		shoot.actionShoot(this.plateau.getArrayPlayer().get(new Random().nextInt(100)));
		
	}
	
}


