package vue;

import javax.swing.*;

public class Rulez extends FrameWindow {

    public Rulez(String nom, int width, int height) {
        super(nom, width, height, 0, 0, 2);
        setVisible(false);
        JLabel rules = addLabel("<html>da rulez <br> cliques sur un bouton pis attends ton tour criss<html>",SwingConstants.CENTER,24);

    }
}
