package mini_project;
import java.util.ArrayList;
import java.util.List;

public class Cours {

        private int courseId;
        private String titre;
        private String description;
        private Instructeur instructeur;
        private List<Etudiant> etudiants;

        public Cours(int courseId, String titre, String description) {
            this.courseId = courseId;
            this.titre = titre;
            this.description = description;
            this.etudiants = new ArrayList<>();
        }

        public void ajouterEtudiant(Etudiant e) {
            etudiants.add(e);
        }

        public void assignerInstructeur(Instructeur i) {
            this.instructeur = i;
        }

        public void afficherDetails() {
            System.out.println("\n==============================");
            System.out.println("Cours: " + titre);
            System.out.println("Description: " + description);
            if (instructeur != null) {
                System.out.println("Instructeur: " + instructeur.getNom());
            } else {
                System.out.println("Instructeur: Aucun");
            }
            System.out.println("Étudiants inscrits :");
            if (etudiants.isEmpty()) {
                System.out.println("- Aucun étudiant inscrit");
            } else {
                /*for (Etudiant e : etudiants) {
                    System.out.println("- " + e.getNom());
                }*/
                for(int i=0;i<etudiants.size();i++){
                    System.out.println("- " +etudiants.get(i).getNom());

                }
            }
            System.out.println("==============================");
        }

        public int getId() {
            return courseId;
        }

        public String getTitre() {
            return titre;
        }
    }


