import java.util.Scanner;

public class main {

     public static  void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Hello Welcome To The BMI Calculator \n");
         System.out.print("Please Enter Your Height: ");
         double Height = s.nextDouble();

         System.out.print("Please Enter Your Weight: ");
         double Weight = s.nextDouble();

    double BMI= Weight / (Height * Height);
    if (BMI <18.5){
        System.out.println("اقل من الطبيعي (Underweight)");
    }
    else if(BMI>18.5 && BMI<24.9){
        System.out.println("وزن طبيعي (Normal Weight)");
    }
    else if(BMI >25 && BMI<29.9){
        System.out.println("زيادة في الوزن (Overweight)");
    }
    else {
        System.out.println("سمنة (Obese)");
    }
}}
