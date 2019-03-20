package Java1Level.DZ7;

public class Doctor extends Hero {

    public Doctor(int health, String type, int damage) {
        super(health, type, damage);
    }

    @Override
    void hit(Hero h){
        System.out.println("Доктор не умеет драться.");
    }

    @Override
    void healing(Hero h){
        if (h!=this&&h.health>0){
            h.plusHealth(damage);
        }else {
            System.out.println("Мертвого не вылечить.");
        }
    }

}
