package Java1Level.DZ7;
import java.util.Random;

public class HeroesGenerator {

    public static final int UNITS_CLASSES_COUNT = 3;

    public static Hero[] generateRandomHeroes(int count) {
        Hero[] heroes = new Hero[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int unitNum = random.nextInt(UNITS_CLASSES_COUNT);
            switch (unitNum){
                case 0: {
                    heroes[i] = new Warrior(100, "war",20);
                    break;
                }
                case 1: {
                    heroes[i] = new Assasin(110, "ass",10);
                    break;
                }
                case 2: {
                    heroes[i] = new Doctor(80, "doc", 10);
                    break;
                }
            }
        }
        return heroes;
    }

}
