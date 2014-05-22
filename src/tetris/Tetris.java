/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import Modele.*;
import Controller.*;
import javax.swing.*;
import Vue.*;

/**
 *
 * @author mathieu
 */
public class Tetris {

    public Tetris() {
        //    new ControllerTetris.start();
    }

    public static void main(String[] args) {

        Grille grille = new Grille(10, 20);
        VueTetris v = new VueTetris(grille);
        v.setVisible(true);
        ControllerTetris controller = new ControllerTetris(grille);
        controller.start();
    }
}
