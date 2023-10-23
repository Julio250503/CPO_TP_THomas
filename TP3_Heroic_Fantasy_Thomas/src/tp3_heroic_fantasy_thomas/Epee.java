/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_thomas;

/**
 *
 * @author Jules Thomas TD C
 */
public class Epee extends Arme {

    private int indice;

    public Epee(String nom, int niveauAttaque) {
        super(nom, niveauAttaque);
        if (indice > 0) {

        } else {
            indice = 0;
        }
        if (indice > 100) {
            indice = 100;
        }

    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        if (indice > 0) {
            this.indice = indice;
        }
    }

    @Override
    public String toString() {
        return "Epee{" + "indice=" + indice + '}';
    }

}
