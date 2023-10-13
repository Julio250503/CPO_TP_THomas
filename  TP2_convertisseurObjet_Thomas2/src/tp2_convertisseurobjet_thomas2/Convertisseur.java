/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_thomas2;

/**
 *
 * @author Jules
 */
public class Convertisseur {

    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public double CelsiusVersKelvin(double tCelsius) {
        nbConversions++;

        return tCelsius + 273.15;
    }

    public double KelvinVersCelcius(double tKelvin) {
        nbConversions++;

        return tKelvin - 273.15;
    }

    public double FarenheitVersCelcius(double tFarenheit) {
        nbConversions++;

        return (tFarenheit - 32) * (5 / 9);
    }

    public double CelciusVersFarenheit(double tCelcius) {
        nbConversions++;
        return (tCelcius * 1.8 + 32);
    }

    public double KelvinVersFarenheit(double tKelvin) {
        nbConversions++;

        return 1.8 * (tKelvin - 273) + 32;
    }

    public double FarenheitVersKelvin(double tFarenheit) {
        nbConversions++;

        return 1.8 / (tFarenheit - 32) + 273;
    }

    @Override
    public String toString() {
        return "nb de conversions" + nbConversions;
    }

}
