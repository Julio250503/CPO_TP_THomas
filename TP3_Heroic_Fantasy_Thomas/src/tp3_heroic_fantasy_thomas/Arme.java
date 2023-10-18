/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_thomas;

/**
 *
 * @author Jules
 */
public class Arme {

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

    public static void main(String[] args) {
        
        Arme epee = new Arme("Épée ", 40);

        
        System.out.println(epee.toString());
    }
}
