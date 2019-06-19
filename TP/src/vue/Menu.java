package vue;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Menu extends FrameWindow {
    public Menu(String nom, int width, int height) {
        super(nom, width, height,2,1,1);

        String[] noms = {"Vs CPU", "Rules", "Vs another player"};
        addLabel("Sploosh Kaboom",SwingConstants.CENTER,32);
        JPanel panel = this.addPanel();
        panel.setLayout(new GridLayout(3,1));

        for(int i = 0; i <noms.length; i++){
            JPanel panel2 =this.addPanel();
            JButton btn = this.addButton(noms[i],500,75);
            btn.addActionListener(new EcouteurBoutons1());
            panel2.add(btn);
            panel.add(panel2);
            setResizable(false);
        }

        this.validate();
    }

}
class EcouteurBoutons1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}