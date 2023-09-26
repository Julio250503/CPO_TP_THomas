/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_thomas.pkg2;

import java.util.Scanner;

/**
 *
 * @author Jules
 */
public class TP1_convertisseur_Thomas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une valeur réelle : ");
        double Reelle = sc.nextDouble();
        double Kelvin = Reelle + 273.15;
        System.out.println("Vous avez saisi la valeur réelle : " + Kelvin);

    }

    public static double CelsiusVersKelvin(double tCelsius) {

        return tCelsius + 273.15;
        }
    

    public static double KelvinVersCelcius(double tKelvin) {

        return tKelvin - 273.15;
    }
    public static double FarenheitVersCelcius(double tFarenheit) {

        return (tFarenheit - 32) * (5/9) ;
    }
}
