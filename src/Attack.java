import java.io.IOException;
import java.util.Scanner;

public class Attack {

    static Scanner s = new Scanner(System.in);
    static String action_chosen = "";
    public static void Human_attack(Human player1, Alien alien1){
        System.out.println(player1.name + " has " + player1.speed + " speed which is more than " + alien1.name + "'s speed which is " + alien1.speed + " ,so " + player1.name + " uses abilities first.");
        ActionDelay.delays(1000);
        System.out.println("");
        System.out.println("What ability would you like to use?");
        ActionDelay.delays(1000);
        System.out.println("Enter 1 for punch, 2 for perversa and 3 for raki.");
        action_chosen = s.nextLine();
        switch (action_chosen) {
            case "1":
                player1.punch(player1.power, player1, alien1);
                break;
            case "2":
                player1.perversa(player1.power, alien1);
                break;
            case "3":
                player1.raki();
                break;
            default:
                System.out.println("Please enter 1 for punch, 2 for perversa or 3 for raki.");
        }
        System.out.println("");
    }

    public static void Alien_attack(Human player1, Alien alien1){
        System.out.println(alien1.name + " has " + alien1.speed + " speed which is more than " + player1.name + "'s speed which is " + player1.speed + " ,so " + alien1.name + " uses abilities first.");
        ActionDelay.delays(1000);
        System.out.println("");
        System.out.println("What ability would you like to use?");
        ActionDelay.delays(1000);
        System.out.println("Enter 1 for punch, 2 for eyes beam and 3 for health potion.");
        action_chosen = s.nextLine();
        switch (action_chosen) {
            case "1":
                alien1.punch(alien1.power, player1, player1);
                break;
            case "2":
                alien1.eyes_beam(alien1.power, player1);
                break;
            case "3":
                alien1.potion();
                break;
            default:
                System.out.println("Please enter 1 for punch, 2 for eyes beam or 3 for health potion.");
        }
        System.out.println("");
    }

}
