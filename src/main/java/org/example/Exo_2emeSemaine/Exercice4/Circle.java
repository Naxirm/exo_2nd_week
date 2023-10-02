package org.example.Exo_2emeSemaine.Exercice4;

public class Circle extends Form{
    private double rayon;

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculOfAir() {
        double air = Math.PI * Math.pow(rayon, 2);
        System.out.println("l'air du cercle est de " + air + " cm²");
        return air;
    }
}
