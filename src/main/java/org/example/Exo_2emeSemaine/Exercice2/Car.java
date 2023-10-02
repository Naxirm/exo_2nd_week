package org.example.Exo_2emeSemaine.Exercice2;

public class Car implements Vehicule{

    public void accelerer(){
        System.out.println("La voiture monte à 100km/h en 6 secondes");
    };

    @Override
    public void ralentir() {
        System.out.println("la voiture ralentit en 2 secondes");
    }

    @Override
    public void gauche() {
        System.out.println("la voiture tourne à gauche");
    }

    @Override
    public void droite() {
        System.out.println("La voiture tourne à droite");
    }
}
