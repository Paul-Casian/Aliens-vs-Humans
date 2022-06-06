public class FindWinner {

    public static void declare_winner(Human player1, Alien alien1){
        if(player1.health > 0){
            System.out.println("Human representative " + player1.name + " won the fight with " + player1.health + " health points remaining !!! You are the new king of Universe !!!");
        }else if (alien1.health > 0){
            System.out.println("Alien representative " + alien1.name + " won the fight with " + alien1.health + " health points remaining !!! You are the new king of Universe !!!");
        }else {
            System.out.println("Is a draw!!! We are doomed!");
        }
    }

    public static int fight_over(Human player1, Alien alien1){

        if(player1.health <= 0 || alien1.health <= 0){
            return 1;
        }else return  0;

    }

}
