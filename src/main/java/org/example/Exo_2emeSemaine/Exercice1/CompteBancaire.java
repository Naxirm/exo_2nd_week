package org.example.Exo_2emeSemaine.Exercice1;

public class CompteBancaire {
    //on introduit les valeurs de la classe
    private String idBancaire;
    private double solde;
    private String name;

    //initialisation getter/setter
    public String getIdBancaire() {
        return this.idBancaire;
    }

    public void setIdBancaire(String idBancaire) {
        this.idBancaire = idBancaire;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void depot(double depot) {
        double newSolde = this.solde + depot;
        if (depot < 0) {
            throw new IllegalArgumentException("Erreur ! le dépôt ne doit pas être un nombre négatif");
        }
        System.out.println("votre solde de " + this.solde + " euro a été réactualisée après un depôt de " + depot
                + " euro , votre nouveau solde est de " + newSolde);
        this.solde = newSolde;
    }

    public void retrait(double retrait) {
        double newSolde = this.solde - retrait;

        if (newSolde < 0) {
            throw new IllegalArgumentException("Le retrait ne doit pas excéder votre solde actuelle !");
        }

        if (retrait < 0) {
            throw new IllegalArgumentException("Erreur ! le retrait doit être un nombre positif");
        }
        System.out.println("votre solde de " + this.solde + " euro a été réactualisée après un retrait  de " + retrait
                + " euro , votre nouveau solde est de " + newSolde);
        this.solde = newSolde;
    }

    @Override
    public String toString() {
        return "Le compte n° " + this.idBancaire + " est au nom de " + this.name + "et a pour solde actuel "
                + this.solde + "euro";
    }

}

