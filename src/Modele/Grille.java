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
    
    public Color tab[][];
    public int statPieces[];
    public int x;
    public int y;
    public Piece pieceEnCoursDeDescente;
    public int pos;
    
    public Score score;
    public boolean termine;
    
    public Piece tabPieceSuivante[];
    
    public Grille(int x , int y){
        this.x = x;
        this.y = y;
        tab = new Color[x][y];
        this.reinitialiserTableau();
        this.pos = 0;
        this.termine = false;
        this.statPieces = new int[] {0, 0, 0, 0, 0, 0, 0};
        randomTableauPiece();
    } 
    
    public void reinitialiserTableau()
    {
        score.score = 0;
        for(int i = 0; i < x; i ++){
            for(int j = 0; j < y; j++) {
                tab[i][j] = Color.DARK_GRAY;
            }
        }
    }
}
