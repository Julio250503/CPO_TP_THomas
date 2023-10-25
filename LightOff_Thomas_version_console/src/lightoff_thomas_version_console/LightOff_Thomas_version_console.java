/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_thomas_version_console;

/**
 *
 * @author Jules
 */
public class LightOff_Thomas_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrilleDeCellules grille = new GrilleDeCellules(7, 7);

        System.out.println(grille);

        
        grille.melangerMatriceAleatoirement(40); 
        System.out.println("Grille apres melange aleatoire :");
        System.out.println(grille);

        
        grille.activerLigneDeCellules(2);
        System.out.println("Grille apres activation de la ligne 2 :");
        System.out.println(grille);

        
        grille.activerColonneDeCellules(4);
        System.out.println("Grille apres activation de la colonne 4 :");
        System.out.println(grille);

        
        grille.activerDiagonaleDescendante();
        grille.activerDiagonaleMontante();
        System.out.println("Grille apres activation des deux diagonales :");
        System.out.println(grille);

        
        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println("Grille apres activation aleatoire :");
        System.out.println(grille);

    }
}
