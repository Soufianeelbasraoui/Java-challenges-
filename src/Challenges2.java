

import java.util.Scanner;

public class Challenges2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.print("Entrez les commandes : ");
        while (true){
            String input = clavier.nextLine();
            if(input.equals("STOP")) {
                break;
            }
                switch (input) {
                    case "UP":
                        y += 1;
                        break;
                    case "DOWN":
                        y -= 1;
                        break;
                    case "LEFT":
                        x -= 1;
                        break;
                    case "RIGHT":
                        x += 1;
                        break;
                    default:
                        System.out.print("Commande inconnue : \n" + input);
                }
            }

            System.out.println("Position finale : (" + x + ", " + y + ")");
        }

    }