package lightoff_thomas_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jules
 */
public class CelluleLumineuse {

    boolean etat;

    /**
     * Constructeur par défaut qui initialise l'état à "éteint" (false).
     */
    public CelluleLumineuse() {
        etat = false;
    }

    /**
     * Méthode pour activer la cellule en inversant son état actuel. Si la cellule est
     * allumée, elle devient éteinte, et si elle est éteinte, elle s'allume. 
     */
    public void activerCellule() {
        etat = !etat;
    }

    /**
     * Méthode pour éteindre la cellule si elle n'est pas déjà éteinte.
     * Si la cellule était déjà éteinte, cette méthode n'a aucun effet.
     */
    public void eteindreCellule() {
        if (etat) {
            etat = false;
        }
    }

    /**
     * Méthode pour vérifier si la cellule est actuellement éteinte.
     * Elle renvoie true si la cellule est éteinte et false si elle est allumée.
     * Cela permet de déterminer l'état actuel de la cellule sans nécessairement
     * consulter la variable etat directement.      
     * @return true si la cellule est éteinte, false si elle est allumée.     
     */
    public boolean estEteint() {
        return !etat;
    }

    /**
     * Méthode pour obtenir l'état actuel de la cellule (true si allumée, false si éteinte).
     * Elle permet d'obtenir l'état courant de la cellule. 
     * @return true si la cellule est allumée, false si elle est éteinte.
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Redéfinition de la méthode toString pour afficher l'état de la cellule de manière
     * lisible. Si la cellule est allumée, elle affiche "X", et si la cellule est éteinte,
     * elle affiche "O".
     * @return "X" si la cellule est allumée, "O" si elle est éteinte.
     */
    @Override
    public String toString() {
        return etat ? "X" : "O"; 
    }
}
