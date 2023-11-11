/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_thomas_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Jules
 */
public class CelluleGraphique extends JButton {

    CelluleLumineuse celluleLumineuseAssociee;

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur,
            int hauteur) {
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
    }

    @Override
    protected void paintComponent(Graphics g) {
        int w = this.getWidth();
        int h = this.getHeight();
        if (celluleLumineuseAssociee.estEteint() == true) {
            g.setColor(Color.black);
        } else {
            g.setColor(Color.blue);
        }
        g.fillOval(2, 2, w - 4, h - 4);
    }
}
