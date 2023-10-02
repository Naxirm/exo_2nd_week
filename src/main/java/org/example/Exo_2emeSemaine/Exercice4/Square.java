package org.example.Exo_2emeSemaine.Exercice4;

public class Square extends Form{

    private double cote;

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double calculOfAir() {
        double air = this.cote * this.cote;
        System.out.println("L'aire du carré est " + air + " cm²");
        return air;
    }

}
