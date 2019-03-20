package Java1Level.DZ7;

public class Cat {

    private String name;
    private int appetite;

    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull=false;
    }

    public void eat(Plate plate){
        if (plate.getFood()>=appetite){
            plate.decreaseFood(appetite);
            System.out.println(name+" поел.");
            isFull=true;
        }else {
            System.out.println(name+" не поел.");
            isFull=false;
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFull() {
        return isFull;
    }
}
