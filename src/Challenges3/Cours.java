package Challenges3;
import java.util.ArrayList;
import  java.util.List;
public class Cours {
  private int  id;
private String  titre;
List<Etudiant> inscrits;

    public Cours(int id, String titre) {
        this.id = id;
        this.titre = titre;
        this.inscrits=new ArrayList<>();

    }

    //methode ajouterEtudiant
    public void ajouterEtudiant(Etudiant e){
        inscrits.add(e);
    }
    //method afficherEtudiante
    public void afficherEtudiant(){
        System.out.println("Etudiant inscrire dans le cours"+titre);
        System.out.println("----------------------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


}
