package Vue;

import Modele.*;
import Controller.ControllerTetris;

import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BorderFactory;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JMenu;

import javax.swing.border.Border;

/**
 *
 * @author frederic
 */
public class VueTetris extends javax.swing.JFrame implements Observer {

    Grille grille;
    ControllerTetris controller;
    JComponent pan;

    public VueTetris(Grille grille) {
        super();
        this.grille = grille;
        grille.addObserver(this);
        build();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                super.windowClosing(arg0);
                System.exit(0);
            }
        });

    }

    public void build() {

        JMenuBar jm = new JMenuBar();

        JMenu m = new JMenu("Jeu");

        JMenuItem mi = new JMenuItem("Partie");

        m.add(mi);

        jm.add(m);

        setJMenuBar(jm);
        GrilleVue grilleV = new GrilleVue(grille);
        setTitle("Tetris");
        setSize(350, 700);
        pan = new JPanel(new GridLayout(grilleV.hauteur, grilleV.largeur));
        Border blackline = BorderFactory.createLineBorder(Color.black, 1);

        for (int i = 0; i < grilleV.hauteur; i++) {
            for (int j = 0; j < grilleV.largeur; j++) {
                JComponent ptest = new CaseVue(0);
                ptest.setBorder(blackline);
                pan.add(ptest);
            }
        }
        pan.setBorder(blackline);
        add(pan);
        display();

    }

    public Color convertColor(int ident) {
        switch (ident) {
            case 0:
                return (Color.white);
            case 1:
                return (Color.cyan);
            case 2:
                return (Color.yellow);

            case 3:
                return (Color.magenta);
            case 4:
                return (Color.orange);
            case 5:
                return (Color.blue);
            case 6:
                return (Color.red);
            case 7:
                return (Color.green);
            default:
                return (Color.white);
        }
    }

    public void display() {
        GrilleVue grilleV = new GrilleVue(grille);
        int n = 0;
        for (int i = 0; i < grilleV.hauteur; i++) {
            for (int j = 0; j < grilleV.largeur; j++) {
                //JComponent ptest = new CaseVue(grilleV.tab[j][i]);
                ((CaseVue)pan.getComponent(n)).setColor(convertColor(grilleV.tab[j][i]));
                n++;
            }
        }
    }

    public void setKeyListener(ControllerTetris controller) {
        this.controller = controller;
        this.addKeyListener(this.controller);
    }

    @Override
    public void update(Observable o, Object arg) {
        display();
        
    }

}