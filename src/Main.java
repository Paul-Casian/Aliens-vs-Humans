import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        /*Thread t1 = new Thread();
        t1.setName("Escape_button");
        t1.run();
        if(t1.isAlive()) {
            System.out.println(t1.getName());
        }

         */
        Scanner s = new Scanner(System.in);
        String action = "";
        Random random = new Random();

        // Creating Human representative
        System.out.println("Enter Human race representative: ");
        String name = s.nextLine();
        Human player1 = new Human(name, 100, 1.2, 5);
        System.out.println(player1.toString());
        System.out.println("");

        //Creating Alien representative
        System.out.println("Enter Alien race representative: ");
        name = s.nextLine();
        Alien alien1 = new Alien(name, 150, 1.1, 3);
        System.out.println(alien1.toString());
        System.out.println("");

        //Fighting - Chose the action

        while(player1.health > 0 & alien1.health > 0){
            if(player1.speed > alien1.speed){
                Attack.Human_attack(player1, alien1);
                if (FindWinner.fight_over(player1, alien1) == 1) {
                    break;
                }
                Attack.Alien_attack(player1, alien1);
                if (FindWinner.fight_over(player1, alien1) == 1) {
                    break;
                }
                }else if (alien1.speed > player1.speed) {
                Attack.Alien_attack(player1, alien1);
                if (FindWinner.fight_over(player1, alien1) == 1) {
                    break;
                }
                Attack.Human_attack(player1, alien1);
                if (FindWinner.fight_over(player1, alien1) == 1) {
                    break;
                }
                }else {
                System.out.println("Both human and alien representatives have the same speed " + player1.speed + ". In this case the first who attacks is randomized.");
                int rand = random.nextInt(2);
                if (rand == 1){
                    player1.speed++;
                } else if (rand == 0) {
                    alien1.speed++;
                }
            }
        }
        FindWinner.declare_winner(player1, alien1);
    }

}
