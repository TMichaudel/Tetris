/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele;

import java.awt.Color;

/**
 *
 * @author mathieu
 */
public class Grille {
    
    public int tab[][];
    public int largeur;
    public int hauteur;
    public Piece pieceCourante;
    
    public Piece tabPieceSuivante[];
    
    public Grille(int x , int y){
        this.largeur = x;
        this.hauteur = y;
        tab = new int[x][y];
        this.reinitialiserTableau();
    } 
    
    public void reinitialiserTableau()
    {
        for(int i = 0; i < largeur; i ++){
            for(int j = 0; j < hauteur; j++) {
                tab[i][j] = 0;
            }
        }
    }
    
    public void descendrePiece() {
        //if(!collision) {
        pieceCourante.deplacer(0,-1);
    }
            
            
}
