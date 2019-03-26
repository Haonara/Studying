package ru.java1.dz7;

public class Player extends Gamer {

    Map map;

    int isShotReady=1;

    public Player (int sign){
        this.sign=sign;
    }

    @Override
    boolean shot(int x, int y) {
        map=Map.getInstance();
        if (!map.isCellBusy(x, y))
        {
            map.field[x][y] = sign;
            return true;
        }
        return false;
    }

    @Override
    boolean win() {
        map = Map.getInstance();
        return map.checkWin(this.sign);
    }
}
