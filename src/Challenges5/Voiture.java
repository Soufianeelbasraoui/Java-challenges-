package Challenges5;

public class Voiture {
  private int  immatriculation;
  private String marque;
  private int modele;
  private CarteGrise carteGrise;

    public Voiture(int immatriculation, String marque, int modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }
     public void lierCarteGrise(CarteGrise c){
         this.carteGrise=c;
         c.setProprietaire(this);
    }
    public  void afficherDetails(){
        System.out.println("Immatriculation : " + immatriculation);
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);

           System.out.println("\n=== Carte Grise ===");
           System.out.println("Numéro : " + carteGrise.getNumero());
           System.out.println("Date d'émission : " + carteGrise.getDateEmission());

    }

    public int getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getModele() {
        return modele;
    }

    public void setModele(int modele) {
        this.modele = modele;
    }
}
