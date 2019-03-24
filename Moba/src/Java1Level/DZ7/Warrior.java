package Java1Level.DZ7;

public class Warrior extends Hero {

    public Warrior(int maxHealth, int curHealth, String type, int damage) {
        super(maxHealth,curHealth, type, damage);
    }

    @Override
    void hit(Hero h){
        if (h!=this&&h.curHealth>0){
            h.causeDamage(damage);
        }else {
            System.out.println("Герой мертв.");
        }
    }

    @Override
    void healing(Hero h){
        System.out.println("Войны не умеют лечить.");
    }

}
