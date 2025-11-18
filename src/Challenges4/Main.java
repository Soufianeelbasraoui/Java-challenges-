package Challenges4;

public class Main {
    public static void main(String[] args){
     Produit p1=new Produit("p1",23,5);
     Produit p2=new Produit("p2",13,2);
     Produit p3=new Produit("p3",12,4);

     Commande c1=new Commande(100);
     c1.ajouterProduit(p1);
     c1.ajouterProduit(p2);
     c1.ajouterProduit(p3);
     System.out.println("------------------------------------");
     double total=c1.calculerTotal();
     System.out.println("e le total de la commande est : "+total);
     System.out.println(c1);
     System.out.println("------------------------------------");

    }
}
