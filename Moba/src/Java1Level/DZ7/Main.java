package Java1Level.DZ7;

public class Main {

    public static void main(String[] args) {

        Hero[] heroes1={new Warrior(100,"war1",20),
        new Assasin(70,"ass2",10),
        new Doctor(50,"doc2",5)};

        Hero[] heroes2={new Warrior(90,"war1",15),
                new Assasin(70,"ass2",10),
                new Doctor(50,"doc2",7)};



        for (int i = 0; i < heroes1.length-1; i++) {
            heroes1[i].hit(heroes1[i+1]);
            heroes1[2].healing(heroes1[i]);
        }

        for (Hero heroes:heroes1) {
            System.out.println(heroes.getHealth()+ " "+heroes.getType()+" "+heroes.getDamage());
        }

        for (Hero heroes:heroes2) {
            System.out.println(heroes.getHealth()+ " "+heroes.getType()+" "+heroes.getDamage());
        }


    }
}
