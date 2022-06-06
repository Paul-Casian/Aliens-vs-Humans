class Human extends Entity {

    String type = "human";

    public Human(String name, int health, double power, int speed) {
        super(name, health, power, speed);
    }

    //Human specific perversa de pe targu Ogna
    public void perversa(int power, Entity alien){

        int dmg_done = 0;

        dmg_done = 40 * power;

        alien.health = alien.health - dmg_done;
        System.out.println("Human " + this.name + " has kicked Alien " + alien.name + " for " + dmg_done + ".") ;
        System.out.println("Alien " + alien.name + " has " + alien.health + " health points remained.");
    }

    //Human heal power - drink raki for 20 points.
    public void raki(){

        this.health = this.health + 20;

        System.out.println("Human " + this.name + " is drinking raki like a god and his health is healed for 20 points. " + this.name + "'s total health is now " + this.health + ".");
    }

    @Override
    public String toString() {
        return "Representative of " + this.type +
                " kind is " + this.name +
                ". He has " +
                this.health + " health points " +
                this.power + " power points and " +
                this.speed + " speed.";
    }
}
