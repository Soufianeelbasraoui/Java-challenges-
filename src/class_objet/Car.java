package class_objet;

import java.util.Date;

public class Car {
   String brand;
   String model;
   int year;
   public Car() {
        brand = "Unknown";
        model = "Standard";
        year = 2000;
   }
   public Car(String brand,String model,int year){
       this.brand=brand;
       this.model=model;
       this.year=year;
   }
   public void displayCar(){
       System.out.println("brand: "+brand);
       System.out.println("model: " +model);
       System.out.println("year: "+year);
   }
}
