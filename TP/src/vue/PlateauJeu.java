package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlateauJeu extends FrameWindow {

    public PlateauJeu(String nom, int width, int height) {
        super(nom, width, height, 1, 2,1);
        JPanel panel = this.addPanel();
        panel.setLayout(new GridLayout(10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(50, 100, 0, 0));
        JPanel panel2 =this.addPanel();
        panel2.setLayout(new GridLayout(10,10));
        panel2.setBorder(BorderFactory.createEmptyBorder(120, 120, 120, 120));
        for (int i= 0; i<100; i++){

            //System.out.println(i);
            JButton btnGrid =  this.addButton(""+(i+1),60,60);
            panel.add( btnGrid);
            pack();
        }
        for (int j = 0; j<100; j++){

            JButton btnGrid2 = this.addButton("",20,20);
            panel2.add(btnGrid2);

        }
        setResizable(false);
        validate();
    }


}

class EcouteurBoutons implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}