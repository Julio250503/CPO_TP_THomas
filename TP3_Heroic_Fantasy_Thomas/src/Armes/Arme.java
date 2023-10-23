/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Jules Thomas TD C
 */
public abstract class Arme {

    private final String nom;
    private int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    @Override
    public String toString() {
        return "Nom de l'arme : " + nom + "\nNiveau d'attaque : " + niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public void setNiveauAttaque(int NiveauAttaque) {
        if (NiveauAttaque > 0) {
            this.niveauAttaque = NiveauAttaque;
        }
    }
}
