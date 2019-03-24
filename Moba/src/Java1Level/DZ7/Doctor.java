package Java1Level.DZ7;

public class Doctor extends Hero {

    public Doctor(int maxHealth, int curHealth, String type, int damage) {
        super(maxHealth, curHealth, type, damage);
    }

    @Override
    void hit(Hero h){
        System.out.println("Доктор не умеет драться.");
    }

    @Override
    void healing(Hero h){
        if (h.curHealth>0&&h.curHealth<h.maxHealth){
            h.plusHealth(damage);
        }else if (h.curHealth==0){
            System.out.println("Мертвого не вылечить.");
        } else {
            System.out.println("Здоровье полное.");
        }
    }

}
