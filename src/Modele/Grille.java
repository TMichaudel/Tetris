/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.Observable;

/**
 *
 * @author mathieu
 */
public class Grille extends Observable {

    public int tab[][];
    public int largeur;
    public int hauteur;
    public Piece pieceCourante;
    public Piece pieceSuivante;

    public Grille(int x, int y) {
        this.largeur = x;
        this.hauteur = y;
        tab = new int[x][y];
        this.reinitialiserTableau();
        pieceCourante = new Piece();
        pieceCourante.randomPiece();
        pieceSuivante = new Piece();
        pieceSuivante.randomPiece();
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public final void reinitialiserTableau() {
        for (int i = 0; i < largeur; i++) {
            for (int j = 0; j < hauteur; j++) {
                tab[i][j] = 0;
            }
        }
    }

    public void descendrePiece() {
        if (collisionDepl(0, 1)) {
            pieceCourante.deplacer(0, 1);
        }
    }

    public void tomberPiece() {
        while (collisionDepl(0, 1)) {
            descendrePiece();
        }
    }

    public void droitePiece() {
        if (collisionDepl(1, 0)) {
            pieceCourante.deplacer(1, 0);
        }
    }

    public void gauchePiece() {
        if (collisionDepl(-1, 0)) {
            pieceCourante.deplacer(-1, 0);
        }
    }

    //collisionDepl(0,1) vérifie si la pièce peut descendre par exemple
    public boolean collisionDepl(int x, int y) {
        int Dx = pieceCourante.x + x;
        int Dy = pieceCourante.y + y;

        for (int i = 0; i < 4; i++) {
            int test = Dx + pieceCourante.Cases[i].getX();
            int test2 = Dy + pieceCourante.Cases[i].getY();
            if ((test > largeur - 1) || (test < 0)) {
                return false;
            }
            if (test2 > hauteur - 1) {
                return false;
            }
            if (tab[test][test2] != 0) {
                return false;
            }
        }
        return true;
    }

    public void supprimerLignes() {
        int i, j, k;
        boolean full;
        for (i = 0; i < hauteur; i++) {

            full = true;

            for (j = 0; j < largeur; j++) {
                if (tab[j][i] == 0) {
                    full = false;
                }
            }

            if (full == true) {
                for (k = i; k > 0; k--) {
                    for (j = 0; j < largeur; j++) {
                        tab[j][k] = tab[j][k - 1];
                    }
                }
                for (j = 0; j < largeur; j++) {
                    tab[j][0] = 0;
                }
            }
        }

    }

    public void rotationPiece() {
        pieceCourante.rotation();
    }

    public boolean partiePerdue() {
        return (tab[5][0] != 0) || (tab[6][0] != 0);
    }

    public void fixerPiece() {
        int i;
        for (i = 0; i < 4; i++) {
            tab[pieceCourante.getCase(i).getX() + pieceCourante.getPosX()][pieceCourante.getCase(i).getY() + pieceCourante.getPosY()] = pieceCourante.getCase(i).getIdent();
        }
        supprimerLignes();
        if (partiePerdue()) {
        } else {
            pieceCourante = pieceSuivante;
            pieceSuivante = new Piece();
            pieceSuivante.randomPiece();
        }
    }

    public void update() {
        setChanged();
        notifyObservers();
    }
}
