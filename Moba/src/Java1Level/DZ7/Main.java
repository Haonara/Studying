package Java1Level.DZ7;

import java.util.Random;

public class Main {



    public static void main(String[] args) {

        Hero[] heroes1={new Warrior(100,"war",20),
        new Assasin(70,"ass",10),
        new Doctor(50,"doc",5)};

        Hero[] heroes2={new Warrior(90,"war",15),
                new Assasin(70,"ass",10),
                new Doctor(50,"doc",7)};

        for (Hero heroes:heroes1) {
            System.out.println(heroes.getHealth()+ " "+heroes.getType()+" "+heroes.getDamage());
        }

        for (Hero heroes:heroes2) {
            System.out.println(heroes.getHealth()+ " "+heroes.getType()+" "+heroes.getDamage());
        }

        firstTeam(heroes1,heroes2);
        secondTeam(heroes2,heroes1);

        for (Hero heroes:heroes1) {
            System.out.println(heroes.getHealth()+ " "+heroes.getType()+" "+heroes.getDamage());
        }

        for (Hero heroes:heroes2) {
            System.out.println(heroes.getHealth()+ " "+heroes.getType()+" "+heroes.getDamage());
        }

    }

    public static void firstTeam(Hero [] heroes1, Hero [] heroes2){

        Random rand=new Random();
        int j=rand.nextInt(3);

        for (int i = 0; i <heroes1.length ; i++) {

            if (heroes1[i].getHealth()>0){
                heroes1[i].hit(heroes2[j]);
            }else {
                System.out.println("Герой не может атаковать, т.к. он мертв.");
            }
            if (heroes1[i].getType().equals("doc")){
                heroes1[i].healing(heroes1[j]);
            }
        }
    }

    public static void secondTeam(Hero [] heroes2, Hero [] heroes1){

        Random rand=new Random();
        int j=rand.nextInt(3);

        for (int i = 0; i <heroes2.length ; i++) {

            if (heroes2[i].getHealth()>0){
                heroes2[i].hit(heroes1[j]);
            }else {
                System.out.println("Герой не может атаковать, т.к. он мертв.");
            }
            if (heroes2[i].getType().equals("doc")){
                heroes2[i].healing(heroes2[j]);
            }
        }
    }

    public static void isDead(Hero h){
        if (h.getHealth()==0){
            System.out.println("Герой мертв.");
        }
    }

    public static void checkWin(){

    }

}
