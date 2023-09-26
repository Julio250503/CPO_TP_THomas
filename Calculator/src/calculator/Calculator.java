/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author Jules Thomas TD C, 25/09/2023
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        int pesto;
        int carbo;
        int resultat = 0 ;
        String str;
        Scanner sc;
        sc = new Scanner(System.in) ;
        System.out.print("""
                         Please enter the operator :
                         1) add
                         2) substract
                         3) multiply
                         4) divide
                         5) modulo
                         """);
        str = sc.nextLine() ;
        System.out.println("Please enter first number :");
        pesto = sc.nextInt() ;
        System.out.println("Please enter second number :");
        carbo = sc.nextInt() ;
        if ((null==str)||(carbo>5)||(carbo<1)||(pesto>5)||(pesto<1)) {
            System.out.println("Enter a correct operator !") ;
        } else switch (str) {
            case "add", "1" -> resultat = carbo + pesto ;
            case "substract", "2" -> resultat = pesto - carbo ;
            case "multiply", "3" -> resultat = carbo * pesto ;
            case "divide", "4" -> resultat = pesto / carbo ;
            case "modulo", "5" -> resultat = pesto%carbo ;
            default -> System.out.println("Enter a correct operator and keep bumber 1 and number 2 between 1 and 5 included !") ;
        }
        System.out.println("The result is : " + resultat);
        }    
    }

       
    }
    
}
