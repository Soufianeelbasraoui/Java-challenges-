package class_objet;

public class Product {
    int id;
    String name;
     double price;
     public Product(int id,String name,double price){
         this.id=id;
         this.name=name;
         this.price=price;
     }
     public void displayProduct(){
        System.out.println("le id \t"+ id+"name \t"+name+"price\t "+price);
     }
}
