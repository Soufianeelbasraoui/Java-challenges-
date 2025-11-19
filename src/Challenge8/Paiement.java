package Challenge8;

import java.util.Date;

public class Paiement {
    private double montant;

    private Date date;

    public Paiement(double montant, Date date) {
        this.montant = montant;
        this.date = date;
    }
    public void afficherinfo(){
        System.out.print("Paiement de" + montant +" le " + date);
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
