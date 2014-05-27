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
        //pieceSuivante.randomPiece();
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
        System.out.println(pieceCourante.y);
       // if (!collisionDepl(0, 1)) {
            pieceCourante.deplacer(0, 1);
        //}
    }

    public void tomberPiece() {
        while (!collisionDepl(0, 1)) {
            descendrePiece();
        }
    }

    public void droitePiece() {
        if (!collisionDepl(1, 0)) {
            pieceCourante.deplacer(1, 0);
        }
    }

    public void gauchePiece() {
        if (!collisionDepl(-1, 0)) {
            pieceCourante.deplacer(-1, 0);
        }
    }

    //collisionDepl(0,1) vérifie si la pièce peut descendre par exemple
    public boolean collisionDepl(int x, int y) {
        if (tab[pieceCourante.getCase(0).getX() + pieceCourante.getPosX() + x][pieceCourante.getCase(0).getY() + pieceCourante.getPosY() + y] != 0) {
            return false;
        }
        if (tab[pieceCourante.getCase(1).getX() + pieceCourante.getPosX() + x][pieceCourante.getCase(1).getY() + pieceCourante.getPosY() + y] != 0) {
            return false;
        }
        if (tab[pieceCourante.getCase(2).getX() + pieceCourante.getPosX() + x][pieceCourante.getCase(2).getY() + pieceCourante.getPosY() + y] != 0) {
            return false;
        }
        if (tab[pieceCourante.getCase(3).getX() + pieceCourante.getPosX() + x][pieceCourante.getCase(3).getY() + pieceCourante.getPosY() + y] != 0) {
            return false;
        }
        return true;
    }

    public void supprimerLignes() {
        int i, j, k;
        boolean full;
        for (i = 0; i < hauteur; i++) {
            
            full = true;
            j = 0;
            while ((full = true) && (j < largeur)) {
                if (tab[j][i] == 0) {
                    full = false;
                }
                j++;
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
    
    public void fixerPiece() {
        int i;
        for(i=0;i<4;i++) {
            tab[pieceCourante.getCase(i).getX()+pieceCourante.getPosX()][pieceCourante.getCase(i).getY()+pieceCourante.getPosY()]=pieceCourante.getCase(i).getIdent();
        }
    }
}
