package Challenges5;

import java.util.Date;

public class Main {
 public static void main(String[] args){
     Voiture v1=new Voiture(1,"oudi",2000);
     CarteGrise  cr1=new CarteGrise(1233,new Date());
     v1.lierCarteGrise(cr1);
     v1.afficherDetails();
 }
}
