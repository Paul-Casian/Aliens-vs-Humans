class Alien extends Entity {

    String type = "alien";

    public Alien(String name, double health, double power, int speed) {
        super(name, health, power, speed);
    }

    //Alien specific power - Eyes bean
    public void eyes_beam(double power, Human human){

        double dmg_done = 0;


        dmg_done = 30 * power;

        human.health = human.health - dmg_done;
        ActionDelay.delays(1000);
        System.out.println("Alien " + this.name + " has used Eyes BEAM on Human " + human.name + " for " + dmg_done + " damage.") ;
        ActionDelay.delays(500);
        System.out.println("Human " + human.name + " has " + human.health + " health points remained.");
        ActionDelay.delays(500);
    }

    // Alien is using a potion. Heal for 30 points.
    public void potion(){

        this.health = this.health + 30;
        ActionDelay.delays(500);
        System.out.println("Alien " + this.name + " is drinking a health potion and is healed for 30 points. " + this.name + "'s total health is now " + this.health + ".");
        ActionDelay.delays(1000);
    }

    @Override
    public String toString() {
        return "Representative of " + this.type +
                " race is " + this.name +
                ". He has " +
                this.health + " health points " +
                this.power + " power points and " +
                this.speed + " speed.";
    }
}
