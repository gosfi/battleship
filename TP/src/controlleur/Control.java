package controlleur;
import vue.*;
import modele.*;
import javax.swing.*;


public class Control {


    Menu leMenu;
    PlateauJeu lePlateauJeu;
    Player leModele;
    

    public void bateauStatut() {
    	leModele.getStatut(lePlateauJeu.getIndice());
    }
    

   
}