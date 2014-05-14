/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele;

/**
 *
 * @author mathieu
 */
public class Case {
    int x;
    int y;
    int ident;
    
    public Case (int x, int y, int ident){
        this.x = x;
        this.y = y;
        this.ident = ident;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getIdent(){
        return this.ident;
    }
    
    public void setIdent(int ident){
        this.ident = ident;
    }
}
