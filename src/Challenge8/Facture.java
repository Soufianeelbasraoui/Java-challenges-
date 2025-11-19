package Challenge8;

import java.util.ArrayList;
import java.util.List;

public class Facture {
   private int id;
   private double montantTotal;
   List<Paiement> paiements;
   public Facture(int id,double montantTotal){
       this.id=id;
       this.montantTotal=montantTotal;
       this.paiements=new ArrayList<>();
   }
   public void ajouterPaiement(Paiement p){
       paiements.add(p);
   }
   public double calculerTotalPaiements(){
       double montantTotal=0.0;
       for (int i=0;i<paiements.size();i++){
           Paiement p=paiements.get(i);
           montantTotal+= p.getMontant();
       }
       return montantTotal;
   }
    public boolean estPayee() {
        return calculerTotalPaiements() >= montantTotal;
    }
    public void afficherInfo(){
       System.out.print("facture "+id+" Montant total : "+montantTotal);
        System.out.println("Paiements effectués :");
        for (int i=0;i<paiements.size();i++){
            Paiement  p=paiements.get(i);
            p.afficherinfo();
        }
        System.out.print("\ntotal paye:  "+calculerTotalPaiements());
        System.out.print("\nfacture regee ?" +(estPayee() ? "oui": "non"));
    }

       public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }
}
