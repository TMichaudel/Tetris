/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele;

import Vue.Case;

/**
 *
 * @author michaudel
 */
public class Piece {
    Case Cases[][] = new Case[4][4];
    Position position;
    
    public Piece(){
//        int i,j;
//        for(i=0;i<4;i++)
//        {
//            for(j=0;j<4;j++)
//            {
//                Cases[i][j]=null;
//            }
//        }
    }
    
    public Piece get() { 
        return this;
    }
    
    public Piece barre() {
        Piece p1 = new Piece();
        p1.Cases[0][0]=new Case(0,0,1);
        p1.Cases[0][1]=new Case(0,1,1);
        p1.Cases[0][2]=new Case(0,2,1);
        p1.Cases[0][3]=new Case(0,3,1);
        return p1;
    }
}
