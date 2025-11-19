package Challenge8;

import java.util.Date;

public class Main {
    public  static void main(String[] args){
     Paiement p1=new Paiement(1,new Date());
     Facture f1=new Facture(1,1000);
     Facture f2=new Facture(1,2000);
     f1.ajouterPaiement(p1);
     f2.ajouterPaiement(p1);
     f2.afficherInfo();
    }
}
