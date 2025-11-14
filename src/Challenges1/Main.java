package Challenges1;

public class Main {
    public static void main(String[] args){
     Passeport p1=new Passeport(1,"marroc",2023);
     Personne per1=new Personne("ali",12,p1);
     per1.assignerPasseport(p1);
     System.out.print(per1);
    }
}
