/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele;

/**
 *
 * @author michaudel
 */
public class Piece {
    Case Cases[] = new Case[4];
    int x;
    int y;
    
    public Piece(){
        x=7;
        y=0;
    }
    
    public Piece get() { 
        return this;
    }
    
    public Case getCase(int x) {
        return this.Cases[x];
    }
    
    public Piece barre() {
        Piece p1 = new Piece();
        p1.Cases[0]=new Case(0,0,1);
        p1.Cases[1]=new Case(0,1,1);
        p1.Cases[2]=new Case(0,2,1);
        p1.Cases[3]=new Case(0,3,1);
        return p1;
    }
    
    public Piece carre() {
        Piece p1 = new Piece();
        p1.Cases[0]=new Case(0,0,2);
        p1.Cases[1]=new Case(0,1,2);
        p1.Cases[2]=new Case(1,0,2);
        p1.Cases[3]=new Case(1,1,2);
        return p1;
    }
 
    public Piece T() {
        Piece p1 = new Piece();
        p1.Cases[0]=new Case(0,0,3);
        p1.Cases[1]=new Case(1,0,3);
        p1.Cases[2]=new Case(2,0,3);
        p1.Cases[3]=new Case(1,1,3);
        return p1;        
    }
    
    public Piece L() {
        Piece p1 = new Piece();
        p1.Cases[0]=new Case(0,0,4);
        p1.Cases[1]=new Case(0,1,4);
        p1.Cases[2]=new Case(0,2,4);
        p1.Cases[3]=new Case(1,2,4);
        return p1;        
    }
    
    public Piece invL() {
        Piece p1 = new Piece();
        p1.Cases[0]=new Case(0,0,5);
        p1.Cases[1]=new Case(1,0,5);
        p1.Cases[2]=new Case(0,1,5);
        p1.Cases[3]=new Case(0,2,5);
        return p1;                
    }
    
    public Piece Z() {
        Piece p1 = new Piece();
        p1.Cases[0]=new Case(0,0,6);
        p1.Cases[1]=new Case(0,1,6);
        p1.Cases[2]=new Case(1,1,6);
        p1.Cases[3]=new Case(1,2,6);
        return p1;               
    }
    
    public Piece invZ() {
        Piece p1 = new Piece();
        p1.Cases[0]=new Case(0,1,7);
        p1.Cases[1]=new Case(0,2,7);
        p1.Cases[2]=new Case(1,0,7);
        p1.Cases[3]=new Case(1,1,7);
        return p1;                      
    }
    
    public void deplacer(int x1,int y1) {
        x+=x1;
        y+=y1;
    }
    
    public Piece randomPiece() {
       //int nombreAleatoire = Min + (int)(Math.random() * ((Max - Min) + 1));
       int random = 1 + (int)(Math.random() * ((6) + 1));
       Piece p1= new Piece();
       switch(random)
            {
                case 1 : p1 = barre();
                    break;

                case 2 : p1 = carre();
                    break;

                case 3 : p1= T();
                    break;

                case 4 : p1=L();
                    break;

                case 5 : p1=invL();
                    break;

                case 6 : p1=Z();
                    break;
                    
                case 7 : p1=invZ();
                    break;
            }
       return p1;
    }
}
