package Java1Level.DZ7;

public class Main {

    public static void main(String[] args) {
        String yes="Да.";
        String no="Нет.";

        Cat[] cats={new Cat ("Барсик",10),
                new Cat("Мурзик",15),
                new Cat ("Васька",100)};

        Plate plate=new Plate(20);

        for (Cat c:cats) {
            c.eat(plate);
            System.out.println(c.getName()+" сыт? "+(c.isFull()==true?yes:no));
        }

        plate.info();
        plate.addFood(20);
        plate.info();
    }
}
