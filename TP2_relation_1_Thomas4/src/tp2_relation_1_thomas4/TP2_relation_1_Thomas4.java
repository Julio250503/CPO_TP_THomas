/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_thomas4;

/**
 *
 * @author Jules Thomas TD C EXO 4
 */
public class TP2_relation_1_Thomas4 {

    public static void main(String[] args) {

        Voiture uneClio = new Voiture("Clio", " Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", " Renault", 5);
        Voiture une2008 = new Voiture("2008", " Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", " Nissan", 4);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("liste des voitures disponibles " + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        bob.ajouter_voiture(uneClio);
        System.out.println("premiere voiture de Bob est une " + bob.liste_voitures[0]);
        bob.ajouter_voiture(une2008);
        System.out.println("deuxieme voiture de Bob est une " + bob.liste_voitures[1]);
        reno.ajouter_voiture(uneMicra);
        System.out.println("premiere voiture de Reno est une " + reno.liste_voitures[0]);
        reno.ajouter_voiture(uneClio);
        System.out.println("deuxieme voiture de Reno est une" + reno.liste_voitures[1]);

        reno.ajouter_voiture(uneClio);

        System.out.println(bob);
        System.out.println(reno);

    }
}
