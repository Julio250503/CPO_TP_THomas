/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author Jules Thomas TD C, Exerci 2, 25/09/2023
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaration des variables
        // nombre dentiers a additionner
        // nombre dentiers a additionner
        int result; // resultat
        int ind; //indice
        int nb;
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        result = 0;
// Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            ind = ind + 1;
            result = result + ind;
        }
// Affichage du resultat
        System.out.println();
        System.out.println("La somme des " + nb + "entiers est: " + result);
    }
}

