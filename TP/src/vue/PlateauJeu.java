package vue;

import javax.swing.*;

import modele.Shoot;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("serial")
public class PlateauJeu extends FrameWindow {
	ArrayList<JButton> btnArrayEnemy = new ArrayList<>();
	ArrayList<JButton> btnArrayPlayer = new ArrayList<>();

	public PlateauJeu(String nom, int width, int height) {
		super(nom, width, height, 1, 2, 1);
		EcouteurBoutons ecouteur = new EcouteurBoutons();
		this.setVisible(false);
		JPanel panel = this.addPanel();
		panel.setLayout(new GridLayout(10, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(50, 100, 0, 0));
		JPanel panel2 = this.addPanel();
		panel2.setLayout(new GridLayout(10, 10));
		panel2.setBorder(BorderFactory.createEmptyBorder(120, 120, 120, 120));

		for (int i = 0; i < 100; i++) {

			btnArrayEnemy.add(this.addButton("" + (i + 1), 60, 60));
			btnArrayEnemy.get(i).addActionListener(ecouteur);
			panel.add(btnArrayEnemy.get(i));
			pack();
		}

		for (int i = 0; i < 100; i++) {

			btnArrayPlayer.add(this.addButton("", 20, 20));
			btnArrayPlayer.get(i).addActionListener(ecouteur);
			panel2.add(btnArrayPlayer.get(i));
		}

		setResizable(false);
		validate();
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