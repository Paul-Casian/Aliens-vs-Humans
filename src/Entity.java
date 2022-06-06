class Entity {
     String name;
     int health = 1;
     double power = 1;
     int speed = 1;

    // Entity constructor
    public Entity(String name, int health, double power, int speed) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.speed = speed;
    }

    // One punch - common power
    public static int punch(int power){
        int dmg_done = 1;
        dmg_done = 10 * power;
        return dmg_done;
    }


}


