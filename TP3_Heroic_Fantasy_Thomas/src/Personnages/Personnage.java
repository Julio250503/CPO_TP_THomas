package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jules Thomas TD
 */
public class Personnage {

    public static int nombrePersonnages = 0;

    private final String Nom;
    int NiveauVie;
    ArrayList<Arme> inventaire = new ArrayList<>();
    Arme arme_en_main = null;

    public Personnage(String Nom, int NiveauVie) {
        if (NiveauVie < 0) {
            NiveauVie = 1;
        }
        if (NiveauVie < 100) {

        } else {
            NiveauVie = 100;
        }
        this.Nom = Nom;
        this.NiveauVie = NiveauVie;
        nombrePersonnages++;
    }

    public String getNom() {
        return Nom;
    }

    public int getNiveauVie() {
        return NiveauVie;
    }

    public void setNiveauVie(int NiveauVie) {
        this.NiveauVie = NiveauVie;
    }

    @Override
    public String toString() {
        return ' ' + " Nom " + Nom + ", Niveau vie " + NiveauVie + " arme en mains : " + arme_en_main + ' ';
    }

    public void gestion(Arme arme) {
        if (inventaire.size() < 5) {
            inventaire.add(arme);
        }
    }

    public void equiper(Arme arme) {
        boolean result = inventaire.contains(arme);
        if (result == true) {
            System.out.println("arme en main est " + arme);
            arme_en_main = arme;
        } else {
            System.out.println("arme innexistante");
            arme_en_main = null;
        }

    }

    public static int getnombrePersonnages() {
        return nombrePersonnages;
    }

    public void detruire() {
        nombrePersonnages--;
    }

    public Arme getArme_en_main() {
        return arme_en_main;
    }
    public void seFatiguer() {
        this.NiveauVie -= 10;  
    }
    public boolean estVivant() {
        return this.NiveauVie > 0;
    }
public void estAttaque(int points) {
        this.NiveauVie -= points;  
    }
}
