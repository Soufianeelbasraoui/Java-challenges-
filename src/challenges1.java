import java.util.Scanner;

public class challenges1 {
    public  static void main(String[] args){
        Scanner Clavier=new Scanner(System.in);
        System.out.print(" Enter le nombre d’unités consommées: ");
         double montant=0;
         double  total=0;
         double taxe=0;

        int consomation=Clavier.nextInt();
        if (consomation <=100){
           montant=  (consomation * 0.8);
        }
        else if(consomation <=300){
            montant= (100*0.8 + (consomation -100) *1.2);
        }
        else {
            montant= ((100 * 0.8) + (200 * 1.2) + ((consomation - 300) * 0.5));
        }
    taxe=montant * 0.10;
    total=montant+taxe;
    System.out.print("\nFacture avant taxe "+montant +"MAD" );
    System.out.print("\nTaxe (10%) " + taxe+ "MAD");
    System.out.print("\nFacture totale "+ total + "MAD");
    }
}
