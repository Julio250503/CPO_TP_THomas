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
 * @author Jules Thomas TD C TP 3
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
        magicien Gandalf = new magicien(true, "Gandalf", 65);
        magicien Garcimore = new magicien(false, "Garcimore", 44);

        guerrier Conan = new guerrier(false, "Conan", 78);
        guerrier Lannister = new guerrier(true, "Lannister", 45);

        ArrayList<Personnage> Tab2 = new ArrayList<>();
        Tab2.add(Gandalf);
        Tab2.add(Garcimore);
        Tab2.add(Conan);
        Tab2.add(Lannister);

        int taille2 = Tab2.size();

        for (int j = 0; j < taille2; j++) {
            System.out.println("Le personnage est : " + Tab2.get(j));
        }
        Epee arme1 = new Epee(3, "couteau", 2);
        Epee arme2 = new Epee(4, "Hache", 4);
        Epee arme3 = new Epee(6, "double Hache", 7);

        Baton arme4 = new Baton("brindille", 1, 10);
        Baton arme5 = new Baton("batte de baseball", 3, 1);
        Baton arme6 = new Baton("kapla", 2, 2);
        
        magicien Julio = new magicien (true , "Julio", 65);
        guerrier Tanguy = new guerrier (false , "Tanguy", 78);

        Tanguy.gestion(arme1);       
        Tanguy.gestion(arme2);
        Tanguy.gestion(arme3);
        
        Tanguy.equiper(arme2);
        Tanguy.getArme_en_main();
        
        Julio.gestion(arme1);
        Julio.gestion(arme4);
        Julio.gestion(arme6);
        
        Julio.equiper(arme1);
        Julio.getArme_en_main();
        Julio.NbArmePref();
        
        System.out.println(Julio.toString());
        System.out.println(Tanguy.toString());
    }

}
