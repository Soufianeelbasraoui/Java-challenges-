package Challenges3;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
  private int id;
  private  String nom;
  List<Cours> coursSuivis;

    public Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.coursSuivis=new ArrayList<>();

    }

    //Méthodes inscrire
   public void inscrire(Cours c){
        coursSuivis.add(c);

   }
    //Méthodes afficherCours
   public void afficherCours(){
        System.out.println("cours de l'etudiant:"+nom);
        System.out.println("-----------------------------------");
        for (int i=0;i<coursSuivis.size();i++){
            Cours c=coursSuivis.get(i);
            System.out.println("Id :"+c.getId());
            System.out.println("titre"+c.getTitre());
        }
   }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
