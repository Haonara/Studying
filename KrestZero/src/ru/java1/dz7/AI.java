package ru.java1.dz7;
import java.util.Random;

public class AI extends Gamer {

    // Экземпляр игрового поля
    Map map;
    int playerSign = 1;
    // Уровень интеллекта
    static int aiLevel = 0;

    // Конструктор
    public AI(int sign, int aiLevel, int playerSign)
    {
        this.sign = sign;
        this.playerSign = playerSign;
        this.aiLevel = aiLevel;
    }

    // Выстрел компьютера
    boolean shot(int cellX, int cellY)
    {
        map =Map.getInstance();
        cellX = -1;
        cellY = -1;
        boolean ai_win = false;
        boolean user_win = false;
        // Находим выигрышный ход
        if (aiLevel == 2)
        {
            for (int i = 0; i < map.fieldSizeX; i++)
            {
                for (int j = 0; j < map.fieldSizeY; j++)
                {
                    if (!map.isCellBusy(i, j))
                    {
                        map.field[i][j] = sign;
                        if (map.checkWin(sign))
                        {
                            cellX = i;
                            cellY = j;
                            ai_win = true;
                        }
                        map.field[i][j] = map.NOT_SIGN;
                    }
                }
            }
        }
        // Блокировка хода пользователя, если он побеждает на следующем ходу
        if (aiLevel > 0)
        {
            if (!ai_win)
            {
                for (int i = 0; i < map.fieldSizeX; i++)
                {
                    for (int j = 0; j < map.fieldSizeY; j++)
                    {
                        if (!map.isCellBusy(i, j))
                        {
                            map.field[i][j] = this.playerSign;
                            if (map.checkWin(this.playerSign))
                            {
                                cellX = i;
                                cellY = j;
                                user_win = true;
                            }
                            map.field[i][j] = map.NOT_SIGN;
                        }
                    }
                }
            }
        }
        if (!ai_win && !user_win)
        {
            do
            {
                Random rnd = new Random();
                cellX = rnd.nextInt(map.fieldSizeX);
                cellY = rnd.nextInt(map.fieldSizeY);
            }
            while (map.isCellBusy(cellX, cellY));
        }
        map.field[cellX][cellY] = sign;
        return true;
    }

    boolean win()
    {
        map = Map.getInstance();
        return map.checkWin(this.sign);
    }

}
