/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_thomas3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jules
 */
public class TP1_guessMyNumber_Thomas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int nombreAleatoire1 = generateurAleat.nextInt(100);

        Scanner sc1 = new Scanner(System.in);
        int tentative = 0;
        int essaisMax = 10;

        System.out.println("Bienvenue dans le jeu Guess my Number !");
        System.out.println("Je pense à un nombre entre 0 et 100. Pouvez-vous deviner ce nombre ?");

        while (tentative < essaisMax) {
            System.out.print("Entrez votre supposition : ");
            int supposition = sc1.nextInt();

            if (supposition < 0 || supposition > 100) {
                System.out.println("Veuillez entrer un nombre entre 0 et 100.");
                continue;
            }

            if (supposition < nombreAleatoire1) {
                System.out.println("Trop petit.");
            } else if (supposition > nombreAleatoire1) {
                System.out.println("Trop grand.");
            } else {
                System.out.println("Bravo ! Vous avez deviné le nombre : " + nombreAleatoire1);
                break;
            }

            tentative++;
            System.out.println("Nombre de tentatives : " + tentative);
        }

        if (tentative == essaisMax) {
            System.out.println("Vous avez épuisé toutes vos tentatives. Le nombre à deviner était : " + nombreAleatoire1);
        }

        scanner.close();
    }
}
