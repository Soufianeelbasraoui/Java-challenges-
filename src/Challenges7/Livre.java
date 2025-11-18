package Challenges7;

import java.util.ArrayList;
import java.util.List;

public class Livre {
   private String titre;
   List<Auteur> auteurs;

    public Livre(String titre) {
        this.titre = titre;
        this.auteurs = new ArrayList<>();
    }
    public  void ajouterAuteur(Auteur a){
        auteurs.add(a);
    }
    public void afficherAuteurs(){
        System.out.println("\nAuteurs du livre : " + titre);
        for (Auteur a : auteurs) {
            System.out.println("- " + a.getNom());
        }
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }
}
