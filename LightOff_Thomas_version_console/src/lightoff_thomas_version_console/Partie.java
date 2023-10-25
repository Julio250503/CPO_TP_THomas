/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_thomas_version_console;

/**
 *
 * @author Jules
 */
public class Partie {

    private GrilleDeCellules grille;
    private int nbCoups;

    public Partie(int nbLignes, int nbColonnes) {
        grille = new GrilleDeCellules(nbLignes, nbColonnes);
        nbCoups = 0;
    }

}
