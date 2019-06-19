package vue;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controlleur.Control;

@SuppressWarnings("serial")
public class Menu extends FrameWindow {

    public Menu(String nom, int width, int height,Control unControleur) {
        super(nom, width, height,2,1,1);
        String[] noms = {"Vs CPU", "Rules", "Vs another player"};
        addLabel("Sploosh Kaboom",SwingConstants.CENTER,32);
        JPanel panel = this.addPanel();
        panel.setLayout(new GridLayout(3,1));
        EcouteurBoutons1 ecouteur = new EcouteurBoutons1(unControleur);
        for(int i = 0; i <noms.length; i++){
            JPanel panel2 =this.addPanel();
            JButton btn = this.addButton(noms[i],500,75);
            btn.addActionListener(new EcouteurBoutons1(ecouteur));
            panel2.add(btn);
            panel.add(panel2);

        }

        this.validate();
        setResizable(false);
    }

}
class EcouteurBoutons1 extends Control implements ActionListener{
    Control cont;
    public EcouteurBoutons1(Control unControleur) {
        this.cont = unControleur;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        cont.mainMenuAction(btn.getText());



    }




    }

