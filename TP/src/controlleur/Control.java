package controlleur;
import vue.*;
import modele.*;
import javax.swing.*;


public class Control {


    Menu leMenu;
    PlateauJeu lePlateauJeu;
    Player leModele;
    



    public void setLeMenu(Menu unMenu) {
        this.leMenu = unMenu;
    }

    public void mainMenuAction(String action) {
        switch (action) {
            case "Vs CPU":
                this.leMenu.setVisible(false);
                break;

        }
    }
    public void getIndiceBoutons() {
    	//va recevoir l'indice de boutons
    }
}