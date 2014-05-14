/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

public class Thread extends java.lang.Thread{

    @Override
    public void run() {
        while (true) {
            maj();
            setChanged();
            notifyObserver();
            Thread.currentThread().sleep(1000);
        }
    }
}
