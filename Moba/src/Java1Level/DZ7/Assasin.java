package Java1Level.DZ7;

public class Assasin extends Hero {

    public Assasin(int health, String type, int damage) {
        super(health, type, damage);
    }

    @Override
    void hit(Hero h){
        if (h!=this&&h.health>0){
            h.causeDamage(damage);
        }else {
            System.out.println("Герой мертв.");
        }
    }

    @Override
    void healing(Hero h){
        System.out.println("Убийцы не умеют лечить.");
    }

}
