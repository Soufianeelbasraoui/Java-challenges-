package class_objet;

public class Rectangle {
    int length;
    int width;
    public  Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int calculateArea(){
        return length * width;
    }
    public void   display(){
        System.out.println("Longueur: " + length);
        System.out.println("Largeur: " + width);
        System.out.println("Aire: " + calculateArea());
    }
}
