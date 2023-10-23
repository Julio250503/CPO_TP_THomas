/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Jules
 */
public class Baton extends Arme {

    private int age;

    public Baton(String Nom, int niveauAttaque, int Agearme) {
        super(Nom, niveauAttaque);
        if (Agearme > 0) {
            age = Agearme;
        } else {
            age = 0;
        }
        if (Agearme > 100) {
            Agearme = 100;
        }
        this.age = Agearme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Baton " + "d'age " + age + ';' + super.toString();
    }

}
