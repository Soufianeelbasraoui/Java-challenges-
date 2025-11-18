package Challenges3;

public class Main {
    public static void main(String[] args){
        Etudiant e1=new Etudiant(1,"ali");
        Etudiant e2 = new Etudiant(2, "Sara");

        // Cours
        Cours c1 = new Cours(101, "Java");
        Cours c2 = new Cours(102, "React");
        e1.inscrire(c1);
        e1.inscrire(c2);
        e2.inscrire(c1);
        e1.afficherCours();
        e2.afficherCours();

        c1.afficherEtudiant();
        c2.afficherEtudiant();
    }
}
