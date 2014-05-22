/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author frederic
 */
public class Case extends JPanel {

    public Case(int idCase) {
        super();

        switch (idCase) {
            case 0:
                setBackground(Color.white);
                break;
            case 1:
                setBackground(Color.cyan);
                break;
            case 2:
                setBackground(Color.yellow);
                break;
            case 3:
                setBackground(Color.magenta);
                break;
            case 4:
                setBackground(Color.orange);
                break;
            case 5:
                setBackground(Color.blue);
                break;
            case 6:
                setBackground(Color.red);
                break;
            case 7:
                setBackground(Color.green);
                break;
            default:
                setBackground(Color.white);
                ;
        }
    }

}
