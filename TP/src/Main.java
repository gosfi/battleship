import modele.IA;
import vue.*;
import controlleur.*;
public class Main {
    public static void main(String[] args){

        Control cont = new Control();
        Menu menuWindow = new Menu("Menu principal",600,600,cont);
        PlateauJeu jeu = new PlateauJeu("jouseur 1",1000,800);
        IA ia= new IA();
        PartieOffline partieOff = new PartieOffline(ia);
        Rulez ok = new Rulez("rules", 600,600);
        ia.setPlateauJeu(jeu);
		//YAAAAAAAAAAA YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEET  

       
        
        
       
    }
}
