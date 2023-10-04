/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_thomas4;


/**
 *
 * @author Jules
 */
import java.util.Scanner;
import java.util.Random;

public class TP1_stats_Thomas4 {

    public static void main(String[] args) {
        int[] des = new int[6];
        int m;
        try (Scanner sc1 = new Scanner(System.in)) {
            System.out.print("Veuillez saisir un nombre entier m : ");
            m = sc1.nextInt();
        }

        if (m > 0) { 
            Random rand = new Random();

            for (int i = 0; i < m; i++) {
                int randNum = rand.nextInt(6); 
                des[randNum]++; 
            }

            System.out.println("Résultats en pourcentage :");
            for (int i = 0; i < des.length; i++) {
                double pourcentage = ((double)des[i] / m) * 100;
                System.out.println("Face " + (i + 1) + " : " + pourcentage + "%");
            }
        } else {
            System.out.println("Le nombre saisi doit être un nombre positif.");
        }
    }
}
