/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_thomas;

import Armes.*;
import Personnages.Personnage;
import Personnages.guerrier;
import Personnages.magicien;
import java.util.ArrayList;

/**
 *
 * @author Jules
 */
public class TP3_Heroic_Fantasy_Thomas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee(5, "Excalibur", 7);
        Epee Durandal = new Epee(7, "Durandal", 4);
        Baton chene = new Baton("Chene", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        ArrayList<Arme> Tab = new ArrayList<>();
        Tab.add(Excalibur);
        Tab.add(Durandal);
        Tab.add(chene);
        Tab.add(charme);

        int taille = Tab.size();

        for (int i = 0; i < taille; i++) {
            System.out.println("votre amre est : " + Tab.get(i));
        }
    }
    magicien Gandalf = new magicien(true, "Gandalf", 65);
    magicien Garcimore = new magicien(false, "Garcimore", 44);

    guerrier Conan = new guerrier(false, "Conan", 78);
    guerrier Lannister = new guerrier(true, "Lannister", 45);

}
