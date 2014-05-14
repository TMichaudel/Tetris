/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris;
import blokus.*;
import Modele.*;
import Controller.*;
import javax.swing.*;

/**
 *
 * @author mathieu
 */
public class Tetris {

    public Tetris() {
    //    new ControllerTetris.start();
    }
  
    
    public static void main(String[] args) {
        Tetris t = new Tetris();
        Vue v = new Vue();
        //v.addObserver(t);
    }
    
}
