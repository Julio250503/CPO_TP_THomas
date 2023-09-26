/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_thomas.pkg1;

import java.util.Scanner;

/**
 *
 * @author Jules Thomas TD C 26/09/2023 (1)
 */
public class TP1_manipNombresInt_Thomas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le premier entier : ");
        int premierEntier = sc.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int deuxiemeEntier = sc.nextInt();
        System.out.println("premier entier : " + premierEntier);
        System.out.println("deuxième entier : " + deuxiemeEntier);
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("le resultat de la somme est "+somme);
        int difference = premierEntier - deuxiemeEntier;
        System.out.println("le resultat de la difference est "+difference);
        int produit = premierEntier * deuxiemeEntier;
        System.out.println("le resultat du produit est "+produit);
        int quotient = premierEntier / deuxiemeEntier;
        int reste = premierEntier % deuxiemeEntier;
        System.out.println("Le quotient de la division est " + quotient);
        System.out.println("Le reste de la division est " + reste);
        
        
    }

}
