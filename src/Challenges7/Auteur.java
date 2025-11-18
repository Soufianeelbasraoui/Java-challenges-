package Challenges7;

import java.util.ArrayList;
import java.util.List;

public class Auteur {
   private String nom;
   List<Livre> livresEcrits;

    public Auteur(String nom) {
        this.nom = nom;
        this.livresEcrits = new ArrayList<>();
    }
  public void ajouterLivre(Livre l) {
        livresEcrits.add(l);
  }
    public void afficherLivres() {
        System.out.println(" Livres écrits par : " + nom);

        for (Livre l : livresEcrits) {
            System.out.println("- " + l.getTitre());
        }
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Livre> getLivresEcrits() {
        return livresEcrits;
    }

    public void setLivresEcrits(List<Livre> livresEcrits) {
        this.livresEcrits = livresEcrits;
    }
}
