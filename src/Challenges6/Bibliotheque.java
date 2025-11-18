package Challenges6;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private String nom;
    List<Livre> livres;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre l){
        livres.add(l);
    }
    public void supprimerLivre(Livre l){
        livres.remove(l);
    }
    public  void afficherLivres(){
        System.out.println("\n=== Livres dans la bibliothèque :"+ nom);
        for (int i=0;i<livres.size();i++){
            Livre l=livres.get(i);
            System.out.println("Titre "+l.getTitre()+"auteur "+l.getAuteur()+"ISBN "+l.getIsbn());
        }
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }
}
