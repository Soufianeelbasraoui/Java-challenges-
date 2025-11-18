package Challenges2;

public class Main {
    public static void  main(String[] args){
        Instructeur i1=new Instructeur(1,"ali","devofs");
        Cours c1=new Cours(102,"html","langage de balsage");
        Cours c2=new Cours(103,"mysql","base de donner");
        Cours c3=new Cours(104,"react","bibliotheque js");
        i1.ajouterCours(c1);
        i1.ajouterCours(c2);
        i1.ajouterCours(c3);
        i1.afficherCours();
    }
}
