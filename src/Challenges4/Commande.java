package Challenges4;

import java.util.ArrayList;
import java.util.List;

public class Commande {

    private  int id;
    List<Produit> produits;

    public Commande(int id) {
        this.id = id;
        this.produits = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
    public void ajouterProduit(Produit p) {
       produits.add(p);
    }
    public double calculerTotal(){
      double total=0.0;
      for (int i=0;i<produits.size();i++){
          Produit p=produits.get(i);
          total+=p.calculetotale();
      }
      return total;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", produits=" + produits +
                '}';
    }
}
