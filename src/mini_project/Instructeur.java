package mini_project;

import java.util.ArrayList;
import java.util.List;
public class Instructeur {


        private int instructorId;
        private String nom;
        private String specialisation;
        private List<Cours> coursAssignes;

        public Instructeur(int instructorId, String nom, String specialisation) {
            this.instructorId = instructorId;
            this.nom = nom;
            this.specialisation = specialisation;
            this.coursAssignes = new ArrayList<>();
        }

        public void assignerCours(Cours c) {
            coursAssignes.add(c);
            c.assignerInstructeur(this);
        }

        public int getId() {
            return instructorId;
        }

        public String getNom() {
            return nom;
        }
    }


