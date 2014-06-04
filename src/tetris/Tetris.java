/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import Modele.*;
import Controller.*;
import Vue.*;

/**
 *
 * @author mathieu
 */
public class Tetris {

    public static void main(String[] args) {

        Grille grille = new Grille(10, 20);
        Vue v = new Vue(grille);
        v.setVisible(true);
        Controleur controller = new Controleur(grille);
        controller.start();
        v.setKeyListener(controller);

        Jeu Tetris = new Jeu(grille);
        Tetris.start();

    }
}
