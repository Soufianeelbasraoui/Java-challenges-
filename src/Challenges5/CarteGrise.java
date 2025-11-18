package Challenges5;

import java.util.Date;

public class CarteGrise {
  private int  numero;
  private Voiture proprietaire;
  private Date dateEmission;

    public CarteGrise(int numero, Date dateEmission) {
        this.numero = numero;
        this.dateEmission = dateEmission;
    }

    public Voiture getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Voiture proprietaire) {
        this.proprietaire = proprietaire;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    public Date getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }
}
