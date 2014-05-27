/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import Modele.Grille;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author michaudel
 */

public class ControllerTetris implements Runnable, KeyListener {

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
    
    
    @Override
    public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode())
            {
                case KeyEvent.VK_LEFT :
                    this.grille.gauchePiece();
                    break;

                case KeyEvent.VK_RIGHT :
                    this.grille.droitePiece();
                    break;

                case KeyEvent.VK_UP :
                    //this.grille.rotationPiece();
                    break;

                case KeyEvent.VK_DOWN :
                    this.grille.descendrePiece();
                    break;
            }
        }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}

