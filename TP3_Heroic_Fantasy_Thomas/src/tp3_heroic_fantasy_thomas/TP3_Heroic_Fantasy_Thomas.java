/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_thomas;

/**
 *
 * @author Jules
 */
public class TP3_Heroic_Fantasy_Thomas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arme epee = new Arme("Epee ", 40) {
        };

        String nomArme = epee.getNom();

        System.out.println(epee.toString());
        
    }

}
