package org.example.Exo_2emeSemaine;

public class Account {

    int accountNumber;

    float solde;

    String clientName;

    public Account(int accountNumber, float solde, String clientName) {
        this.accountNumber = accountNumber;
        this.solde = solde;
        this.clientName=clientName;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public float getSolde(){
        return this.solde;
    }

    public String getClientName(){
        return this.clientName;
    }

}
