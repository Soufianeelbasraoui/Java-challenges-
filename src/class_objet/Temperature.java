package class_objet;

public class Temperature {
    double celsius;
    public  Temperature(double celsius){
        this.celsius=celsius;
    }
    public double toFahrenheit(){
        return (celsius * 9/5) + 32;
    }
    public  void display(){
        System.out.println("celsius: " +celsius);
        System.out.println("toFahrenheit "+toFahrenheit());
    }
}
