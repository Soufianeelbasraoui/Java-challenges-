package Challenges2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Instructeur {
    private int id;
    private String nom;
    private String specialisation;
    List<Cours> coursEnseignes;

    public Instructeur(int id, String nom, String specialisation) {
        this.id = id;
        this.nom = nom;
        this.specialisation = specialisation;
       this.coursEnseignes=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public List<Cours> getCoursEnseignes() {
        return coursEnseignes;
    }

    public void setCoursEnseignes(List<Cours> coursEnseignes) {
        this.coursEnseignes = coursEnseignes;
    }

    public void ajouterCours(Cours c) {
      coursEnseignes.add(c);
    }
    public void afficherCours() {
        System.out.println("id: "+id);
        System.out.println(" nom: "+nom);
        System.out.println("specialisation: "+specialisation);
        System.out.println("=== Liste des cours ===");
       /* for (Cours c : coursEnseignes) {
            System.out.println("Cours ID: " + c.getId());
            System.out.println("Titre: " + c.getTitre());
            System.out.println("Description: " + c.getDescription());
            System.out.println("-------------------------");
        }*/
        for(int i = 0;i<coursEnseignes.size();i++){
             Cours c=coursEnseignes.get(i);
            System.out.println("Cours ID: " + c.getId());
            System.out.println("Titre: " + c.getTitre());
            System.out.println("Description: " + c.getDescription());
            System.out.println("-------------------------");
        }
    }
}
