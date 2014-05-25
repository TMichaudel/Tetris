package Vue;

import Modele.*;

import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JMenu;

import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

/**
 *
 * @author frederic
 */
public class VueTetris extends JFrame {

    Grille grille;

    public VueTetris(Grille grille) {
        super();
        this.grille = grille;
        build();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                super.windowClosing(arg0);
                System.exit(0);
            }
        });

    }

    private int convertir(int x, int y) {
        int pos;
        pos = grille.getLargeur() * y + x;
        return pos;
    }

    public void build() {

        //JMenu jm = new JMenu();
        JMenuBar jm = new JMenuBar();

        JMenu m = new JMenu("Jeu");

        JMenuItem mi = new JMenuItem("Partie");

        //ItemListener i = new Item
        m.add(mi);

        jm.add(m);

        setJMenuBar(jm);
        GrilleVue grilleV = new GrilleVue(grille);
        setTitle("Tetris");
        setSize(350, 700);
        JComponent pan = new JPanel(new GridLayout(grilleV.hauteur, grilleV.largeur));
        Border blackline = BorderFactory.createLineBorder(Color.black, 1);

//        for (int i = 0; i < 200; i++) {
//            JComponent ptest = new Case(0);
//            ptest.setBorder(blackline);
//            pan.add(ptest);
//        }

        for (int i = 0; i < grilleV.hauteur; i++) {
            for (int j = 0; j < grilleV.largeur; j++) {
                JComponent ptest = new Case(grilleV.tab[j][i]);
                ptest.setBorder(blackline);
                pan.add(ptest);
            }
        }
        pan.setBorder(blackline);
        add(pan);
        //setContentPane(pan);

    }

}
