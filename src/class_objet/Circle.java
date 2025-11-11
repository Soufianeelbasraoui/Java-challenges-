package class_objet;

public class Circle {
    int radius;
    public  Circle(int radius){
        this.radius=radius;
    }
    public double getArea(){
         return  3.14 * radius*2;
    }
    public double getCircumference(){
        return 2*3.14*radius;
    }
    public void display(){
        System.out.println("radius: " + radius);
        System.out.println("Aire: " + getArea());
        System.out.println("Circonférence: " + getCircumference());
    }
}

