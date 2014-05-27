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
    int rota;

    public Piece() {
        x = 4;
        y = 0;
    }

    public Piece get() {
        return this;
    }

    public Case getCase(int x) {
        return this.Cases[x];
    }

    public int getPosY() {
        return this.y;
    }

    public int getPosX() {
        return this.x;
    }

    public void barre() {
        if (rota == 0) {
            Cases[0] = new Case(0, 0, 1);
            Cases[1] = new Case(0, 1, 1);
            Cases[2] = new Case(0, 2, 1);
            Cases[3] = new Case(0, 3, 1);
        } else if (rota == 1) {
            Cases[0] = new Case(-1, 1, 1);
            Cases[1] = new Case(0, 1, 1);
            Cases[2] = new Case(1, 1, 1);
            Cases[3] = new Case(2, 1, 1);
        } else if (rota == 2) {
            Cases[0] = new Case(0, 0, 1);
            Cases[1] = new Case(0, 1, 1);
            Cases[2] = new Case(0, 2, 1);
            Cases[3] = new Case(0, 3, 1);
        } else if (rota == 3) {
            Cases[0] = new Case(-1, 1, 1);
            Cases[1] = new Case(0, 1, 1);
            Cases[2] = new Case(1, 1, 1);
            Cases[3] = new Case(2, 1, 1);
        }
    }

    public void carre() {
        Cases[0] = new Case(0, 0, 2);
        Cases[1] = new Case(0, 1, 2);
        Cases[2] = new Case(1, 0, 2);
        Cases[3] = new Case(1, 1, 2);
    }

    public void T() {
        if (rota == 0) {
            Cases[0] = new Case(0, 0, 3);
            Cases[1] = new Case(1, 0, 3);
            Cases[2] = new Case(2, 0, 3);
            Cases[3] = new Case(1, 1, 3);
        } else if (rota == 1) {
            Cases[0] = new Case(0, 0, 3);
            Cases[1] = new Case(0, 1, 3);
            Cases[2] = new Case(0, 2, 3);
            Cases[3] = new Case(1, 1, 3);
        } else if (rota == 2) {
            Cases[0] = new Case(0, 1, 3);
            Cases[1] = new Case(1, 1, 3);
            Cases[2] = new Case(2, 1, 3);
            Cases[3] = new Case(1, 0, 3);
        } else if (rota == 3) {
            Cases[0] = new Case(0, 1, 3);
            Cases[1] = new Case(1, 1, 3);
            Cases[2] = new Case(2, 1, 3);
            Cases[3] = new Case(1, 0, 3);
        }
    }

    public void L() {
        if (rota == 0) {
            Cases[0] = new Case(0, 0, 4);
            Cases[1] = new Case(0, 1, 4);
            Cases[2] = new Case(0, 2, 4);
            Cases[3] = new Case(1, 2, 4);
        } else if (rota == 1) {
            Cases[0] = new Case(0, 1, 4);
            Cases[1] = new Case(1, 1, 4);
            Cases[2] = new Case(2, 1, 4);
            Cases[3] = new Case(2, 0, 4);
        } else if (rota == 2) {
            Cases[0] = new Case(2, 2, 4);
            Cases[1] = new Case(2, 1, 4);
            Cases[2] = new Case(2, 0, 4);
            Cases[3] = new Case(1, 0, 4);
        } else if (rota == 3) {
            Cases[0] = new Case(2, 0, 4);
            Cases[1] = new Case(1, 0, 4);
            Cases[2] = new Case(0, 0, 4);
            Cases[3] = new Case(0, 1, 4);
        }
    }

    public void invL() {
        if (rota == 0) {
            Cases[0] = new Case(0, 0, 5);
            Cases[1] = new Case(1, 0, 5);
            Cases[2] = new Case(0, 1, 5);
            Cases[3] = new Case(0, 2, 5);
        } else if (rota == 1) {
            Cases[0] = new Case(0, 1, 5);
            Cases[1] = new Case(1, 1, 5);
            Cases[2] = new Case(2, 1, 5);
            Cases[3] = new Case(0, 0, 5);
        } else if (rota == 2) {
            Cases[0] = new Case(1, 2, 5);
            Cases[1] = new Case(1, 1, 5);
            Cases[2] = new Case(1, 0, 5);
            Cases[3] = new Case(0, 2, 5);
        } else if (rota == 3) {
            Cases[0] = new Case(2, 0, 5);
            Cases[1] = new Case(1, 0, 5);
            Cases[2] = new Case(0, 0, 5);
            Cases[3] = new Case(2, 1, 5);
        }
    }

    public void Z() {
        if (rota == 0) {
            Cases[0] = new Case(0, 0, 6);
            Cases[1] = new Case(0, 1, 6);
            Cases[2] = new Case(1, 1, 6);
            Cases[3] = new Case(1, 2, 6);
        } else if (rota == 1) {
            Cases[0] = new Case(0, 2, 6);
            Cases[1] = new Case(0, 1, 6);
            Cases[2] = new Case(1, 1, 6);
            Cases[3] = new Case(1, 0, 6);
        } else if (rota == 2) {
            Cases[0] = new Case(0, 0, 6);
            Cases[1] = new Case(0, 1, 6);
            Cases[2] = new Case(1, 1, 6);
            Cases[3] = new Case(1, 2, 6);
        } else if (rota == 3) {
            Cases[0] = new Case(0, 2, 6);
            Cases[1] = new Case(0, 1, 6);
            Cases[2] = new Case(1, 1, 6);
            Cases[3] = new Case(1, 0, 6);
        }
    }

    public void invZ() {
        if (rota == 0) {
            Cases[0] = new Case(0, 1, 7);
            Cases[1] = new Case(0, 2, 7);
            Cases[2] = new Case(1, 0, 7);
            Cases[3] = new Case(1, 1, 7);
        } else if (rota == 1) {
            Cases[0] = new Case(0, 0, 7);
            Cases[1] = new Case(0, 1, 7);
            Cases[2] = new Case(1, 2, 7);
            Cases[3] = new Case(1, 1, 7);
        } else if (rota == 2) {
            Cases[0] = new Case(0, 1, 7);
            Cases[1] = new Case(0, 2, 7);
            Cases[2] = new Case(1, 0, 7);
            Cases[3] = new Case(1, 1, 7);
        } else if (rota == 3) {
            Cases[0] = new Case(0, 0, 7);
            Cases[1] = new Case(0, 1, 7);
            Cases[2] = new Case(1, 2, 7);
            Cases[3] = new Case(1, 1, 7);
        }
    }

    public void deplacer(int x1, int y1) {
        x += x1;
        y += y1;
    }

    public void randomPiece() {
        //int nombreAleatoire = Min + (int)(Math.random() * ((Max - Min) + 1));
        int random = 1 + (int) (Math.random() * ((6) + 1));
        Piece p1 = new Piece();
        switch (random) {
            case 1:
                barre();
                break;

            case 2:
                carre();
                break;

            case 3:
                T();
                break;

            case 4:
                L();
                break;

            case 5:
                invL();
                break;

            case 6:
                Z();
                break;

            case 7:
                invZ();
                break;
        }
    }

    public void rotation() {
        rota = rota + 1 % 4;
    }
}
