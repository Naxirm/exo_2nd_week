package org.example.Exo_2emeSemaine.Exercice2;

public class Moto implements Vehicule{
    public void accelerer(){
        System.out.println("la moto monte à 100km/h en 6 secondes");
    }

    @Override
    public void ralentir() {
        System.out.println("la moto ralenti en 1 seconde");
    }

    @Override
    public void gauche() {
        System.out.println("la moto s'incline à gauche");
    }

    @Override
    public void droite() {
        System.out.println("la moto s'incline à droite");
    }
}
