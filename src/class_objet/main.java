package class_objet;

public class main {
   public static void main(String[] args){
       // Création d’un objet de type Student
       System.out.println("----------challenges1---------- ");
       Student s1=new Student("Ali\t",20 ," A");
       s1.displayInfo();System.out.println("challenges2");
       // Création d’un objet de type Product
       System.out.println("----------challenges2---------------");
       Product p1=new Product(101, "Laptop", 8500.0);
       p1.displayProduct();
       // Création d’un objet de type Rectangle
       System.out.println("--------------challenges3------------");
       Rectangle r1=new Rectangle(5,6);
       r1.display();
       // Création d’un objet de type BankAccount
       System.out.println("--------------challenges4---------------");
       BankAccount b1=new BankAccount(12345, 500);
       b1.deposit(500.0);
       b1.withdraw(100.0);
       b1.displayBalance();
       // Création d’un objet de type Cart
       System.out.println("--------------challenges5-----------------");
       Car c1=new Car("Toyota", "Corolla", 2022);
       Car c2=new Car();
       c1.displayCar();
       c2.displayCar();
       // Création d’un objet de type Circle
       System.out.println("--------------challenges6-----------------");
       Circle cr1=new Circle(5);
       cr1.display();
       // Création d’un objet de type Movie
       System.out.println("--------------challenges7-----------------");
       Movie m1=new Movie("movie1",9);
       m1.displayRating();
       // Création d’un objet de type Employee
       System.out.println("--------------challenges8-----------------");
       Employee E1=new Employee("sufiane",1200);
       E1.display();
       // Création d’un objet de type Book
       System.out.println("--------------challenges9-----------------");
       Book B1=new Book("book1","author1", 2550);
       Book B2=new Book("book2","author2", 2080);
       Book B3=new Book("book3","author3", 3000);
       B1.display();
       B2.display();
       B3.display();
       // Création d’un objet de type Temperature
       System.out.println("--------------challenges10-----------------");
       Temperature t1=new Temperature(12);
       t1.display();

   }
}
