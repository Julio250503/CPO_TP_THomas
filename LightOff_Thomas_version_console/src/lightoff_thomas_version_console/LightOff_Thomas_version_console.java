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
        CelluleLumineuse cellule1 = new CelluleLumineuse();

        System.out.println("etat initial de la cellule 1 : " + cellule1);
        cellule1.activerCellule();
        System.out.println("Nouvel etat de la cellule 1 apres activation : " + cellule1);
        cellule1.eteindreCellule();
        System.out.println("Nouvel etat de la cellule 1 apres extinction : " + cellule1);
        System.out.println("La cellule 1 est eteinte ? " + cellule1.estEteint());

        CelluleLumineuse cellule2 = new CelluleLumineuse();
        System.out.println("etat initial de la cellule 2 : " + cellule2);

    }

}
