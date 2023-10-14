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
        int conv;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("""
                           Selectionnez la conversion que vous souhaitez effectuer :
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius
                           3) De Celcius vers Fahrenheit
                           4) De Fahrenheit vers Celcius
                           5) De Kelvin vers Fahrenheit
                           6) De Fahrenheit vers Kelvin""");
        conv = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Veillez saisir une valeur");
        double Temp = sc2.nextDouble();

        if (conv < 1 || conv > 6) {
            System.out.println("valeur impossible");
            System.exit(0);
        }
        double tempF = 0;
        if (conv == 1) {
            tempF = CelsiusVersKelvin(Temp);
        }
        if (conv == 2) {
            tempF = KelvinVersCelcius(Temp);
        }
        if (conv == 4) {
            tempF = FarenheitVersCelcius(Temp);
        }
        if (conv == 3) {
            tempF = CelciusVersFarenheit(Temp);
        }
        if (conv == 5) {
            tempF = KelvinVersFarenheit(Temp);
        }
        if (conv == 6) {
            tempF = FarenheitVersKelvin(Temp);
        }
        System.out.println("votre nouvelle température est"+ tempF);
    }

    public static double CelsiusVersKelvin(double tCelsius) {

        return tCelsius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {

        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {

        return (tFarenheit - 32) * (5 / 9);
    }

    public static double CelciusVersFarenheit(double tCelcius) {

        return (tCelcius * 1.8 + 32);
    }

    public static double KelvinVersFarenheit(double tKelvin) {

        return 1.8 * (tKelvin - 273) + 32;
    }

    public static double FarenheitVersKelvin(double tFarenheit) {

        return 1.8 / (tFarenheit - 32) + 273;
    }
}
