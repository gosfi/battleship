package vue;

import controlleur.Control;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rulez extends FrameWindow implements ActionListener {
    Control cont;
    public Rulez(String nom, int width, int height) {
        super(nom, width, height, 2, 1, 1);
        setVisible(true);
        JLabel rules = addLabel("Les regles",SwingConstants.CENTER,48);
        JPanel panel = addPanel();
        JButton btn = addButton("Retour",200,100);
        panel.add(btn);
        btn.addActionListener(this);
        add(panel);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton btn = (JButton) actionEvent.getSource();
        btn.getText();
        if(btn.getText() == "Retour"){
            this.dispose();
            new Menu("Menu principal",600,600,cont);

        }
    }
}
