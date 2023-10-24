package Personnages;

import Armes.Arme;
import Armes.Baton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jules Thomas TD C
 */
public class magicien extends Personnage {

    public static int nbMagiciens = 0;

    public magicien(boolean confirme, String Nom, int NiveauVie) {

        super(Nom, NiveauVie);
        nbMagiciens++;
    }

    public void setConfirme(boolean confirme) {
    }

    
    Arme arme;
    int nbArme = 0;

    public int NbArmePref() {
        for (int i = 0; i < inventaire.size(); i++) {
            arme = inventaire.get(i);
            if (arme instanceof Baton) {
                nbArme += 1;
            }
        }
        System.out.println("nombre arme preferes du magicien est : " + nbArme);
        return nbArme;
    }

}
