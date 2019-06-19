package vue;

import javax.swing.*;

public class Rulez extends FrameWindow {

    public Rulez(String nom, int width, int height) {
        super(nom, width, height, 0, 0, 2);
        setVisible(true);
        JLabel rules = addLabel("Les regles",SwingConstants.CENTER,48);

    }
}
