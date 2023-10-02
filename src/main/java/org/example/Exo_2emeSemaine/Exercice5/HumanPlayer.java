package org.example.Exo_2emeSemaine.Exercice5;

public class HumanPlayer implements Gamer {
    @Override
    public void jouer(){
        System.out.println("Le joueur humain est en train de jouer");
    }
    @Override
    public void gagner(){
        System.out.println("Le joueur a gagné");
    }
    @Override
    public void perdre(){
        System.out.println("Le joueur a perdu");
    }
}
