package class_objet;

public class Book {
    String title;
    String author;
    double price;
    public Book(String title,String author,double price){
        this.author=author;
        this.title=title;
        this.price=price;
    }
    public void  display(){
        System.out.println("title :"+title);
        System.out.println("author :"+author);
        System.out.println("price :"+price);
    }
}
