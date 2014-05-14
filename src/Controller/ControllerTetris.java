/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import Modele.Grille;
/**
 *
 * @author michaudel
 */
public class ControllerTetris  implements Runnable {
    private Thread t;
    
    
    
    public void run() {
            while (true) {
            //maj();
            //setChanged();
            //notifyObserver();
            //Thread.currentThread().sleep(1000);
        }
    }
    
        public void start()
    {
        t = new Thread(this, "thread");
        t.start();
    }
}


