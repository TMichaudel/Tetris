/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modele.Grille;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author michaudel
 */
public class ControllerTetris implements Runnable, KeyListener {

    private Thread t;

    private final Grille grille;

    public ControllerTetris(Grille grille) {
        this.grille = grille;
    }

    @Override
    public void run() {
 
    }

    public void start() {
        t = new Thread(this, "thread");
        t.start();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                this.grille.gauchePiece();
                break;

            case KeyEvent.VK_RIGHT:
                this.grille.droitePiece();
                break;

            case KeyEvent.VK_UP:
                this.grille.rotationPiece();
                break;

            case KeyEvent.VK_DOWN:
                this.grille.descendrePiece();
                break;
            case KeyEvent.VK_NUMPAD0:
                this.grille.tomberPiece();
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
