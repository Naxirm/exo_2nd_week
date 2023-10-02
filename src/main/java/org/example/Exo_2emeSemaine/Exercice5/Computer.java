package org.example.Exo_2emeSemaine.Exercice5;

public class Computer implements Gamer {

    @Override
    public void jouer(){
        System.out.println("L'ordinateur est en train de jouer");
    }
    @Override
    public void gagner(){
        System.out.println("L'ordinateur a gagné au jeu");
    }
    @Override
    public void perdre(){
        System.out.println("L'ordinateur a perdu au jeu du jeu !");
    }
}
