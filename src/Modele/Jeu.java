/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michaudel
 */
public class Jeu implements Runnable {

    private Thread t;

    private final Grille grille;

    public Jeu(Grille grille) {
        this.grille = grille;
    }

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Jeu.class.getName()).log(Level.SEVERE, null, ex);
            }
            grille.descendrePiece();
            grille.update();
            if (!grille.collisionDepl(0, 1)) {
                grille.fixerPiece();
                if (grille.partiePerdue()) {
                    running = false;
                    System.out.println("Perdu !!");
                }
            }
        }
    }

    public void start() {
        t = new Thread(this, "thread");
        t.start();

    }

}
