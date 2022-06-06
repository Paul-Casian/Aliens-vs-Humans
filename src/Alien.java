class Alien extends Entity {

    String type = "alien";

    public Alien(String name, int health, double power, int speed) {
        super(name, health, power, speed);
    }

    //Alien specific power - Eyes bean
    public void eyes_bean(int power, Human human){

        int dmg_done = 0;


        dmg_done = 30 * power;

        human.health = human.health - dmg_done;
        System.out.println("Alien " + this.name + " has kicked Human " + human.name + " for " + dmg_done + ".") ;
        System.out.println("Human " + human.name + " has " + human.health + " health points remained.");
    }

    // Alien is using a potion. Heal for 30 points.
    public void potion(){

        this.health = this.health + 30;

        System.out.println("Alien " + this.name + " is drinking a health potion and is healed for 30 points. " + this.name + "'s total health is now " + this.health + ".");
    }
}
