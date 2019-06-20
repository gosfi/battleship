package controlleur;
import vue.*;
import modele.*;

import javax.swing.*;


public class Control extends JFrame {

    Menu leMenu;
    Player leModele;
    


    public void setLeMenu(Menu unMenu) {
        this.leMenu = unMenu;
    }

    public void mainMenuAction(String action) {
        switch (action) {
            case "Vs CPU":
                //this.leMenu.setDefaultCloseOperation(leMenu.HIDE_ON_CLOSE);
                break;

        }
    }
}