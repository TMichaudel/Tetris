/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;
import Modele.Grille;
import Modele.Piece;
/**
 *
 * @author michaudel
 */
public class GrilleVue {

    public int tab[][];
    public int largeur;
    public int hauteur;
    
    public GrilleVue(Grille g)
    {
        
        largeur=g.getLargeur();
        hauteur=g.getHauteur();
        tab = new int[largeur][hauteur];
        for (int i = 0; i < largeur; i++) {
            for (int j = 0; j < hauteur; j++) {
                tab[i][j] = g.tab[i][j];
            }
        }
        
        for (int i = 0; i <4 ; i++)
        {
            tab[g.pieceCourante.getCase(i).getX()+g.pieceCourante.getPosX()][g.pieceCourante.getCase(i).getY()+g.pieceCourante.getPosY()]=g.pieceCourante.getCase(i).getIdent();
        }
    }
}