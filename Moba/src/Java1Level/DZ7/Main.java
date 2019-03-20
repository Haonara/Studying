package Java1Level.DZ7;

public class Main {

    public static void main(String[] args) {

        Hero h1=new Warrior(100,"war1",20);
        Hero h2=new Warrior(100,"war2",20);
        Hero h3=new Assasin(70,"ass2",10);
        Hero h4=new Doctor(50,"doc2",5);

        h1.info();
        h2.info();
        h3.info();
        h4.info();

        h1.hit(h2);
        h2.healing(h2);
        h3.hit(h2);
        h4.healing(h2);


        h1.info();
        h2.info();
        h3.info();
        h4.info();
    }
}
