// Définition de la classe
public class Personne {
        // Attributs
        String nom;
        int age;

        // Constructeur
        public Personne(String n, int a) {
            nom = n;
            age = a;
        }
        // Méthode pour afficher les informations
        public void afficherInfos() {
            System.out.println("Nom : " + nom);
            System.out.println("Âge : " + age + " ans");
        }


}
