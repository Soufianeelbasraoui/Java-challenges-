import java.util.Scanner;

public class Challenges3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter nombre d’étudiants (N): ");
        int n = s.nextInt();

        System.out.print("Enter nombre de bancs (M): ");
        int m = s.nextInt();
        int totalePlaces = m * 2;
        int etudiant = 1;
        for (int i = 1; i <= m && etudiant <= n; i++) {
            System.out.print("Banc " + i + " : ");
            for (int j = 1; j <= 2 && etudiant <= n; j++) {
                System.out.print("Étudiant " + etudiant + "  ");
                etudiant++;
            }
            System.out.println();
        }
        if (totalePlaces < n) {
            System.out.println("Étudiant " + (n ) + " ne trouve pas de place.");
        } else {
            System.out.println(" Tous les étudiants trouvent une place.");
        }
    }
}
