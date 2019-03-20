package Java1Level.DZ7;

public abstract class Hero {
    protected int health;
    protected String type;
    protected int damage;

    public Hero(int health, String type, int damage) {
        this.health = health;
        this.type = type;
        this.damage = damage;
    }

    abstract void hit (Hero h);
    abstract void healing (Hero h);

    void causeDamage(int damage){
        health-=damage;
    }
    void plusHealth(int damage){
        health+=damage;
    }

    void info(){
        System.out.println(health+ " "+type+" "+damage);
    }

    public int getHealth() {
        return health;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }
}
