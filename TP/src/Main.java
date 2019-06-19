import modele.IA;
import vue.*;

public class Main {
    public static void main(String[] args){
		//YAAAAAAAAAAA YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEET  

        Menu menuWindow = new Menu("Menu principal",600,600);
        PlateauJeu jeu = new PlateauJeu("jouseur 1",1000,800);
        IA ia= new IA();
        ia.setPlateauJeu(jeu);
        PartieOffline partieOff = new PartieOffline(ia);
    }
}
