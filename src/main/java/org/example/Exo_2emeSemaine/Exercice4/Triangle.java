package org.example.Exo_2emeSemaine.Exercice4;

public class Triangle extends Form {

    private double base;
    private double hauteur;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public double calculOfAir() {
        double air = (this.hauteur * this.base)/2;
        System.out.println("L'aire du triangle est " + air + " cm²");
        return air;
    }
}
