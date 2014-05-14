/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michaudel
 */
public class Tetris  {
    private Thread t;
    
    
    
    public void run() {
            while (true) {
            maj();
            setChanged();
            notifyObserver();
            Thread.currentThread().sleep(1000);
        }
    }
}


