package controlleur;
import vue.*;

import javax.swing.*;


public class Control extends JFrame {

    Menu leMenu;


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