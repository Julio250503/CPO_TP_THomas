/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_thomas;

/**
 *
 * @author Jules Thomas TD C
 */
public abstract class Arme {

    private String nom;
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
}
