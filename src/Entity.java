class Entity {
     String name;
     double health = 1;
     double power = 1;
     int speed = 1;

    // Entity constructor
    public Entity(String name, double health, double power, int speed) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.speed = speed;
    }

    // One punch - common power
    public static void punch(double power, Entity random1, Entity random2){
        double dmg_done = 1;
        dmg_done = 10 * power;
        random2.health = random2.health - dmg_done;
        System.out.println(random1.name + " has punched Alien " + random2.name + " for " + dmg_done + " damage.") ;
        System.out.println("Alien " + random2.name + " has " + random2.health + " health points remained.");
    }
}


