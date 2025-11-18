package Challenges4;

public class Produit {
    private String nom;
    private double prixUnitaire;
    private int quantite;

    public  Produit(String nom,double prixUnitaire,int quantite){
        this.nom=nom;
        this.prixUnitaire=prixUnitaire;
        this.quantite=quantite;
    }
    public String getNom(){
        return nom;
    }
    public  void setNom(String nom){
        this.nom=nom;
    }
    public  double getPrixUnitaire(){
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public double getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite){
        this.quantite=quantite;
    }
    public double calculetotale(){
        return this.prixUnitaire* this.quantite;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                ", quantite=" + quantite +
                '}';
    }


}
