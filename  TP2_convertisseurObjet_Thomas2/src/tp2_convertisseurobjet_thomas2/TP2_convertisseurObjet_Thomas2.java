/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_thomas2;

/**
 *
 * @author Jules Thomas TD C exo 2 tp2
 */
public class TP2_convertisseurObjet_Thomas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur convertisseur1 = new Convertisseur();
        Convertisseur convertisseur2 = new Convertisseur();

        double celsius1 = 25.0;
        double fahrenheit1 = convertisseur1.CelciusVersFarenheit(celsius1);
        double Kelvin1 = convertisseur1.FarenheitVersKelvin(fahrenheit1);

        System.out.println("Nombre de conversions effectuées par convertisseur1: " + convertisseur1.toString());

        double fahrenheit2 = 68.0;
        double celsius2 = convertisseur2.FarenheitVersCelcius(fahrenheit2);
        double Kelvin2 = convertisseur2.CelsiusVersKelvin(celsius2);

        System.out.println("Nombre de conversions effectuées par convertisseur2: " + convertisseur2.toString());
        
        
    }

}
