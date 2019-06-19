package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

import javax.swing.JButton;
import javax.swing.JFrame;

import modele.*;

public class PartieOffline {

	public PartieOffline(IA ia) {

		boolean tour = false;
		boolean gameOver = true;
		do {
			ia.IAAction();

		} while (gameOver);

	}

}
