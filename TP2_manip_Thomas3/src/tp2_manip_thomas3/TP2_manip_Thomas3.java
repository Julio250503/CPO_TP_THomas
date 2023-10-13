/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_thomas3;

/**
 *
 * @author Jules Thomas TD C EXO 3 TP 2
 */
public class TP2_manip_Thomas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        Tartiflette assiette3 = assiette2;
        assiette2.nbCalories += 1;

        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        System.out.println("Nombre de calories de Assiette 2 apres l'incrementation : " + assiette2.nbCalories);
        System.out.println("Nombre de calories de Assiette 3 (qui fait reference a la meme tartiflette) : " + assiette3.nbCalories);

        Moussaka[] tableauMoussaka = new Moussaka[10];

        // Créer 10 objets de type Moussaka avec des nombres de calories différents
        for (int i = 0; i < 10; i++) {
            int calories = i * 100; // Par exemple, 100 calories de plus à chaque itération
            tableauMoussaka[i] = new Moussaka(calories);
        }

        // Accéder directement à nbCalories pour afficher le nombre de calories de chaque objet
        for (int i = 0; i < 10; i++) {
            System.out.println("Objet Moussaka " + i + " a " + tableauMoussaka[i].nbCalories + " calories.");
        }
    }

}
