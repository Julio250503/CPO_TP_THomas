/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_thomas1;

/**
 *
 * @author Jules Thomas,06/09/23
 */
public class TP2_Bieres_Thomas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
       BouteilleBiere deuxBiere = new BouteilleBiere("triple",8.5 ,"Affligem") ;
       BouteilleBiere troisBiere = new BouteilleBiere("Amsterdam",11.6 ,"Maximator") ;
       BouteilleBiere quatreBiere = new BouteilleBiere("Chouffe",8 ,"Achouffe") ;
       
    System.out.println("etiquette une:"+uneBiere);
    System.out.println("etiquette une:"+deuxBiere);
    System.out.println("etiquette une:"+troisBiere);
    System.out.println("etiquette une:"+quatreBiere);
    
    }

}
