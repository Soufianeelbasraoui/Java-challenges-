package Challenges7;

public class Main {
    public static void main(String[] args) {

        Auteur a1 = new Auteur("Ahmed");
        Auteur a2 = new Auteur("Fatima");
        Auteur a3 = new Auteur("Youssef");

        Livre l1 = new Livre("Programmation Java");
        Livre l2 = new Livre("Introduction à l’IA");
        Livre l3 = new Livre("Développement Web");

        // Relations Many-to-Many
        a1.ajouterLivre(l1);
        a1.ajouterLivre(l2);

        a2.ajouterLivre(l1);
        a2.ajouterLivre(l3);

        l3.ajouterAuteur(a3);

        // Affichage
        a1.afficherLivres();
        a2.afficherLivres();
        a3.afficherLivres();

        l1.afficherAuteurs();
        l2.afficherAuteurs();
        l3.afficherAuteurs();
    }
}
