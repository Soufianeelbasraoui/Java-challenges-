package mini_project;


import java.util.ArrayList;
import java.util.List;
public class Etudiant {

        private int studentId;
        private String nom;
        private String email;
        private List<Cours> coursInscrits;

        public Etudiant(int studentId, String nom, String email) {
            this.studentId = studentId;
            this.nom = nom;
            this.email = email;
            this.coursInscrits = new ArrayList<>();
        }

        public void inscrire(Cours c) {
            coursInscrits.add(c);
            c.ajouterEtudiant(this);
        }

        public int getId() {
            return studentId;
        }

        public String getNom() {
            return nom;
        }
    }


