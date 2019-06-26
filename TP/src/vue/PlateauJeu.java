package vue;

import javax.swing.*;

import controlleur.Control;
import modele.Shoot;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

@SuppressWarnings("serial")
// une chance j'suis la pour faire toutes le fenetre -Sam 2019
public class PlateauJeu extends FrameWindow {
	Control cont;
	ArrayList<JButton> btnArrayEnemy = new ArrayList<>();
	ArrayList<JButton> btnArrayPlayer = new ArrayList<>();
	int[] indice = new int[100];

	public PlateauJeu(String nom, int width, int height) {
		super(nom, width, height, 1, 3, 1);
		EcouteurBoutons ecouteur = new EcouteurBoutons();
		this.setVisible(true);
		JPanel panel = this.addPanel();
		panel.setLayout(new GridLayout(10, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(25, 50, 0, 0));
		JPanel panel2 = this.addPanel();
		panel2.setLayout(new GridLayout(10, 10));
		panel2.setBorder(BorderFactory.createEmptyBorder(120, 120, 120, 120));

		for (int i = 0; i < 100; i++) {

			// YAAAAAAAAAAA YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEET
			btnArrayEnemy.add(this.addButton("" + (i + 1), 60, 60));
			btnArrayEnemy.get(i).addActionListener(ecouteur);
			indice[i] = i;
			panel.add(btnArrayEnemy.get(i));
			pack();
		}

		for (int i = 0; i < 100; i++) {

			btnArrayPlayer.add(this.addButton("", 20, 20));
			panel2.add(btnArrayPlayer.get(i));
		}

		setResizable(false);
		setVisible(true);
		validate();
	}

	public ArrayList<JButton> getArrayEnnemy() {
		return btnArrayEnemy;
	}

	public ArrayList<JButton> getArrayPlayer() {
		return btnArrayPlayer;
	}

	public void finPartieBug() {
		this.dispose();
		new Menu("Menu principal", 600, 600, cont);
	}

	public int[] getIndice() {

		return indice;
	}
}

class EcouteurBoutons implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent actionEvent) {

		JButton boutons = (JButton) actionEvent.getSource();
		Shoot shoot = new Shoot();

		shoot.actionShoot(boutons);

	}
}