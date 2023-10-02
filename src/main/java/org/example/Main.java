package org.example;


import org.example.Exo_2emeSemaine.Exercice1.CompteBancaire;
import org.example.Exo_2emeSemaine.Exercice2.Car;
import org.example.Exo_2emeSemaine.Exercice2.Moto;
import org.example.Exo_2emeSemaine.Exercice2.Vehicule;
import org.example.Exo_2emeSemaine.Exercice4.Circle;
import org.example.Exo_2emeSemaine.Exercice4.Square;
import org.example.Exo_2emeSemaine.Exercice4.Triangle;
import org.example.Exo_2emeSemaine.Exercice5.Computer;
import org.example.Exo_2emeSemaine.Exercice5.HumanPlayer;

public class Main {
    public static void main(String[] args) {
        //Ex1
        /*CompteBancaire compte = new CompteBancaire();
        compte.setSolde(100.0);
        compte.setName("Yacine Amara ");
        compte.setIdBancaire("9a3m8QnSPdi72smQ2X2Q");
        compte.depot(1500);
        compte.retrait(100);
        System.out.println(compte.toString());
        System.out.println("votre id bancaire : "+compte.getIdBancaire());*/

        //Ex2
        /*Car v = new Car();
        v.accelerer();
        v.ralentir();
        Moto m = new Moto();
        m.ralentir();
        m.droite();*/

        //Ex3

        //Ex4
        /*Square carre = new Square();
        carre.setCote(4);
        carre.calculOfAir();
        Triangle triangle = new Triangle();
        triangle.setBase(12);
        triangle.setHauteur(3);
        triangle.calculOfAir();
        Circle cercle = new Circle();
        cercle.setRayon(12.5);
        cercle.calculOfAir();*/

        //Ex5
        Computer ordi = new Computer();
        ordi.perdre();
        ordi.gagner();
        ordi.jouer();
        HumanPlayer joueur1 = new HumanPlayer();
        joueur1.gagner();
        joueur1.perdre();
        joueur1.jouer();
    }
}