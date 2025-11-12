package mini_project;

import java.util.Scanner;

import java.util.*;
public class main {

    static Scanner sc = new Scanner(System.in);
    static List<Etudiant> etudiants = new ArrayList<>();
    static List<Instructeur> instructeurs = new ArrayList<>();
    static List<Cours> coursList = new ArrayList<>();

    public static void main(String[] args) {
        int choix;
        do {
            System.out.println("\n=== MENU GESTION DES COURS ===");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Ajouter un instructeur");
            System.out.println("3. Ajouter un cours");
            System.out.println("4. Inscrire un étudiant à un cours");
            System.out.println("5. Assigner un instructeur à un cours");
            System.out.println("6. Afficher les détails d’un cours");
            System.out.println("7.  Quitter");

            System.out.print("Choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1 :
                    ajouterEtudiant();
                    break;
                case 2 :
                    ajouterInstructeur();
                    break;
                case 3 :
                    ajouterCours();
                    break;
                case 4 :
                    inscrireEtudiant();
                    break;
                case 5 :
                    assignerInstructeur();
                    break;
                case 6 :
                    afficherDetailsCours();
                    break;
                case 7 :
                    System.out.println("Merci d’avoir utilisé le système !");
                    break;
                default :
                    System.out.println("Option invalide !");
                    break;
            }
        } while (choix != 7);
    }

    // === MÉTHODES ===

    static void ajouterEtudiant() {
        System.out.print("ID étudiant : ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nom : ");
        String nom = sc.nextLine();
        System.out.print("Email : ");
        String email = sc.nextLine();
        etudiants.add(new Etudiant(id, nom, email));
        System.out.println("Étudiant ajouté avec succès !");
    }

    static void ajouterInstructeur() {
        System.out.print("ID instructeur : ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nom : ");
        String nom = sc.nextLine();
        System.out.print("Spécialisation : ");
        String spec = sc.nextLine();
        instructeurs.add(new Instructeur(id, nom, spec));
        System.out.println(" Instructeur ajouté !");
    }

    static void ajouterCours() {
        System.out.print("ID cours : ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Titre : ");
        String titre = sc.nextLine();
        System.out.print("Description : ");
        String desc = sc.nextLine();
        coursList.add(new Cours(id, titre, desc));
        System.out.println("Cours ajouté !");
    }

    static void inscrireEtudiant() {
        System.out.print("ID étudiant : ");
        int idE = sc.nextInt();
        System.out.print("ID cours : ");
        int idC = sc.nextInt();

        Etudiant e = chercherEtudiant(idE);
        Cours c = chercherCours(idC);

        if (e != null && c != null) {
            e.inscrire(c);
            System.out.println("Étudiant inscrit avec succès !");
        } else {
            System.out.println("Étudiant ou cours introuvable !");
        }
    }

    static void assignerInstructeur() {
        System.out.print("ID instructeur : ");
        int idI = sc.nextInt();
        System.out.print("ID cours : ");
        int idC = sc.nextInt();

        Instructeur i = chercherInstructeur(idI);
        Cours c = chercherCours(idC);

        if (i != null && c != null) {
            i.assignerCours(c);
            System.out.println("Instructeur assigné avec succès !");
        } else {
            System.out.println("Instructeur ou cours introuvable !");
        }
    }

    static void afficherDetailsCours() {
        System.out.print("ID du cours : ");
        int id = sc.nextInt();
        Cours c = chercherCours(id);
        if (c != null) c.afficherDetails();
        else System.out.println(" Cours introuvable !");
    }


    // === MÉTHODES DE RECHERCHE ===

    static Etudiant chercherEtudiant(int id) {
        for (Etudiant e : etudiants) if (e.getId() == id) return e;
        return null;
    }

    static Instructeur chercherInstructeur(int id) {
        for (Instructeur i : instructeurs) if (i.getId() == id) return i;
        return null;
    }

    static Cours chercherCours(int id) {
        for (Cours c : coursList) if (c.getId() == id) return c;
        return null;
    }
}
