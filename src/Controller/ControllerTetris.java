/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import Modele.Grille;
import java.awt.event.KeyListener;

/**
 *
 * @author michaudel
 */

public class ControllerTetris implements Runnable {

    private Thread t;

    private boolean descend;

    private Grille grille;

    public ControllerTetris(Grille grille) {
        this.grille = grille;
        this.descend = false;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControllerTetris.class.getName()).log(Level.SEVERE, null, ex);
            }           
            if (!this.descend) {
                grille.descendrePiece();
            }
        }
    }
    
    
        

    public void start() {
        t = new Thread(this, "thread");
        t.start();
    }
}
