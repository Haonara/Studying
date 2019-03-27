package ru.java1.dz7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Map extends JPanel {

    public static final int MODE_H_V_A = 0;
    public static final int MODE_H_V_H = 1;
    private static Map instance = null;
    public final int NOT_SIGN = 5;

    int fieldSizeX;
    int fieldSizeY;

    int[][] field;

    int cellX;
    int cellY;

    int winLen;

    int cellHeigth;
    int cellWidth;

    boolean isInitialized = false;

    Player player1;
    Player player2;
    boolean nextTurn=false;
    boolean gameOver=false;

    int gameMode = 1;
    // Уровень AI
    int aiLevel = 0;

    public static synchronized Map getInstance() {
        if (instance == null)
            instance = new Map();
        return instance;
    }

    // Проверка ячейки на занятость
    boolean isCellBusy(int x, int y) {
        if (x < 0 || y < 0 || x > cellWidth - 1 || y > cellHeigth - 1) {
            return false;
        }
        return field[x][y] != NOT_SIGN;
    }

    // Проверка поля на заполнение
    public boolean isFieldFull() {
        for (int i = 0; i < cellWidth; i++) {
            for (int j = 0; j < cellHeigth; j++) {
                if (field[i][j] == NOT_SIGN)
                    return false;
            }
        }
        return true;
    }

    // Проверяем линию на равенство значений
    public boolean checkLine(int start_x, int start_y, int dx, int dy, int sign) {
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                if (field[start_x + i * dx][start_y + i * dy] != sign)
                    return false;
            }
        }
        return true;
    }

    // Проверка победы
    public boolean checkWin(int sign) {
        for (int i = 0; i < fieldSizeX; i++) {
            // проверяем строки
            if (checkLine(i, 0, 0, 1, sign)) return true;
            // проверяем столбцы
            if (checkLine(0, i, 1, 0, sign)) return true;
        }
        // проверяем диагонали
        if (checkLine(0, 0, 1, 1, sign)) return true;
        if (checkLine(0, fieldSizeX - 1, 1, -1, sign)) return true;
        return false;
    }

    void twoPlayersMode() {
        if (player1.isShotReady == 1) {
            nextTurn = true;
            player2.isShotReady = 0;
            System.out.println("Player 1 shot!");
            player1.shot(cellX,cellY);
        }
        if (player1.win()) {
            System.out.println("Player 1 WIN!!!");
            gameOver = true;
        }
        repaint();
        if (isFieldFull() && !player1.win() && !player2.win()) {
            gameOver = true;
            System.out.println("DRAW!!!");
        }
        if (player2.isShotReady == 1) {
            nextTurn = false;
            player1.isShotReady = 0;
            System.out.println("Player 2 shot!");
            player2.shot(cellX,cellY);
        }
        if (!gameOver) {
            player2.shot(cellX, cellY);
        }
        if (player2.win()) {
            System.out.println("Player 2 WIN!!!");
            gameOver = true;
        }
        repaint();
        if (isFieldFull() && !player2.win() && !player1.win()) {
            gameOver = true;
            System.out.println("DRAW!!!");
        }
        if (nextTurn) {
            player1.isShotReady = 0;
            player2.isShotReady = 1;
        }
        else {
            player1.isShotReady = 1;
            player2.isShotReady = 0;
        }
    }

    // Режим против компьютера
    void modeAgainstAI() {
        Player player = new Player(1);
        AI ai = new AI(0, aiLevel, player.sign);
        if (!gameOver) {
            if (player.shot(cellX,cellY)) {
                if (player.win()) {
                    System.out.println("Player WIN!!!");
                    gameOver = true;
                }
                if (isFieldFull()) {
                    gameOver = true;
                    System.out.println("DRAW!!!");
                }
                repaint();
                if (!gameOver) {
                    ai.shot(cellX, cellY);
                }
                if (ai.win()) {
                    System.out.println("AI WIN!!!");
                    gameOver = true;
                }
                repaint();
                if (isFieldFull() && !ai.win()) {
                    gameOver = true;
                    System.out.println("DRAW!!!");
                }
            }
        }
    }

    public Map() {

        setVisible(false);
        setBackground(Color.ORANGE);
        player1=new Player(0);
        player2=new Player(1);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cellX = e.getX() / cellWidth;
                cellY = e.getY() / cellHeigth;
                System.out.println("Mouse clicked on " + cellX + " " + cellY);

                if (!gameOver) {
                    switch (gameMode) {
                        case 1: {
                            twoPlayersMode();
                            break;
                        }
                        case 2: {
                            modeAgainstAI();
                            break;
                        }
                    }
                }
            }
        });

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    void render(Graphics g) {

        if (!isInitialized) return;

        int panelWidth = getWidth();
        int panelHeigth = getHeight();

        cellHeigth = panelHeigth / fieldSizeY;
        cellWidth = panelWidth / fieldSizeX;


        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeigth;
            g.drawLine(0,y,panelWidth,y);
        }

        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x,0,x,panelHeigth);
        }


        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                int x = i * cellWidth;
                int y=j*cellHeigth;
                if (field[i][j] != NOT_SIGN){
                    //Рисуем нолик
                    if (field[i][j] == 0){
                        g.setColor(Color.RED);
                        g.drawOval(x,y, cellWidth,cellHeigth);
                    }
                }
                //Рисуем крестик
                if (field[i][j] == 1){
                    g.setColor(Color.BLUE);
                    g.drawLine((i * cellWidth),(j*cellHeigth),((i +1)* cellWidth),((j+1)*cellHeigth));
                    g.drawLine(((i +1)* cellWidth),(j*cellHeigth),(i * cellWidth),((j+1)*cellHeigth));
                }

            }
        }

    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLen) {
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.winLen = winLen;
        field = new int[fieldSizeY][fieldSizeX];
        isInitialized = true;
        gameOver=false;
        repaint();
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                field[i][j] =NOT_SIGN;
            }
        }
        gameMode = 1;
        aiLevel = 0;
        setVisible(true);





    }
}

