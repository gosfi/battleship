
import vue.*;
import controlleur.*;
import modele.Player;

public class Main {
	public static void main(String[] args) {

		Control cont = new Control();
		Player player= new Player();
		Menu menuWindow = new Menu("Menu principal", 600, 600, cont);
		cont.setModele(player);
		cont.setMenu(menuWindow);

	}
}
