package Java1Level.DZ7;

public abstract class Hero {
    protected int maxHealth;
    protected int curHealth;
    protected String type;
    protected int damage;

    public Hero(int curHealth, String type, int damage) {
        this.maxHealth = curHealth;
        this.curHealth=curHealth;
        this.type = type;
        this.damage = damage;
    }

    abstract void hit (Hero h);
    abstract void healing (Hero h);

    void causeDamage(int damage){
        curHealth-=damage;
    }
    void plusHealth(int damage){
        curHealth+=damage;
    }

    void info(){
        System.out.println(maxHealth+" "+curHealth+ " "+type+" "+damage);
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurHealth() {
        return curHealth;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

}
