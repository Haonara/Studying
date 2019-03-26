package ru.java1.dz7;

public class Player extends Gamer {

    Map field;

    int isShotReady=1;

    public Player (int sign){
        this.sign=sign;
    }

    @Override
    boolean shot(int x, int y) {
        field=Map.getInstance();

        return false;
    }

    @Override
    boolean win() {
        field=Map.getInstance();
        return false;
    }
}
