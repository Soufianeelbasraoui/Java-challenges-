package Challenges6;

public class Main {
    public static void main(String[] args){
        Livre l1=new Livre("liver1","aut1",101);
        Livre l2=new Livre("liver2","aut2",201);
        Livre l3=new Livre("liver3","aut3",301);
        Bibliotheque b1=new Bibliotheque("b1");


        b1.ajouterLivre(l1);
        b1.ajouterLivre(l2);
        b1.ajouterLivre(l3);

         b1.afficherLivres();

         b1.supprimerLivre(l1);
         b1.afficherLivres();

    }
}
