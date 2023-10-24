package Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jules Thomas TD C
 */
public class guerrier extends Personnage {

    public static int nombreGuerrier = 0;

    public guerrier(boolean cheval, String Nom, int NiveauVie) {
        super(Nom, NiveauVie);
        nombreGuerrier++;
    }

    public void setCheval(boolean cheval) {
    }

    public static int getnombreGuerrier() {

        return nombreGuerrier;

    }

    @Override
    public void detruire() {
        nombreGuerrier--;

    }
}
