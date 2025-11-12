import java.util.ArrayList;
import java.util.Scanner;

public class gestion_étudiants {
    static ArrayList<String>nomelsves=new ArrayList<>();
    static ArrayList<Double> noteseleves=new ArrayList<>();
    static Scanner s=new Scanner(System.in);
    public static void ajouter(){

        System.out.println("Entrez le nom etudiants: ");
        String nom =s.nextLine();
        System.out.println("Entrez le note etudiants: ");
        double note =s.nextDouble();
        nomelsves.add(nom);
        noteseleves.add(note);
        System.out.println("Élève ajouté avec succès.");
    }
    public static void afficher(){
        if(noteseleves.isEmpty()){
            System.out.println("Acun eleve ajouter.");
            return;
        }
        System.out.println("\n--- Liste des élèves et leurs notes ---");
        for (int i=0;i<noteseleves.size();i++){
            System.out.println("Eleve: "+noteseleves.get(i)+ "note : "+noteseleves.get(i));
        }
        System.out.println("----------------------------------------------------");
    }
    public static void calculermoyenne(){
        try {
            if(noteseleves.isEmpty()){
                System.out.println("list des eleves est vide");
            }
            double sommenotes=0;
            for (double note: noteseleves){
                sommenotes+=note;
            }
            double moyennenote=sommenotes / noteseleves.size();
            System.out.println("la moyenne generale est : "+moyennenote);
        } catch (ArithmeticException err){
            System.out.println("erreur:"+ err.getMessage());
        }
    }
    public static void main(String[] args){
        ajouter();
        afficher();
        calculermoyenne();

    }
}
