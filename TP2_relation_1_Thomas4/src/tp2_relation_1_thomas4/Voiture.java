package tp2_relation_1_thomas4;

/**
 *
 * @author Jules
 */
public class Voiture {

    String Marque;
    int PuissanceCV;
    String Modele;
    Personne proprietaire;

    public Voiture(String UnModele, String UneMarque, int UnePuissance) {
        Marque = UneMarque;
        PuissanceCV = UnePuissance;
        Modele = UnModele;
    }

    @Override
    public String toString() {
        return Modele + " venant de chez " + Marque + " de puissance " + PuissanceCV;
    }
}
