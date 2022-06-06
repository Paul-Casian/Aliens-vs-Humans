class Human extends Entity {

    String type = "human";

    public Human(String name, double health, double power, int speed) {
        super(name, health, power, speed);
    }

    //Human specific perversa de pe targu Ogna
    public void perversa(double power, Alien alien){

        double dmg_done = 0;

        dmg_done = Math.round(40 * power);

        alien.health = alien.health - dmg_done;
        ActionDelay.delays(1000);
        System.out.println("Human " + this.name + " has used perversa de pe targu Ogna pe Alien " + alien.name + " for " + dmg_done + " damage.") ;
        ActionDelay.delays(500);
        System.out.println("Alien " + alien.name + " has " + alien.health + " health points remained.");
        ActionDelay.delays(500);
    }

    //Human heal power - drink raki for 20 points.
    public void raki(){

        this.health = this.health + 20;

        ActionDelay.delays(500);
        System.out.println("Human " + this.name + " is drinking raki like a god and his health is healed for 20 points. " + this.name + "'s total health is now " + this.health + ".");
        ActionDelay.delays(500);
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
