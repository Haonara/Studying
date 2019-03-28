package ru.java1.dz7;

import java.util.Arrays;

public class BattleGame {
    static int activePlayerID = 0;
    public static String winner;

    public static int ChangeActivePlayerID(int activePlayerID) {
        switch (activePlayerID) {
            case 0: {
                BattleGame.activePlayerID = 1;
                break;
            }
            case 1: {
                BattleGame.activePlayerID = 0;
                break;
            }

        }
        return BattleGame .activePlayerID;
    }

    public static void start(){
        boolean finishGame = false;

        Player[] players = {
                new Player("Team1", true, HeroesGenerator.generateRandomHeroes(Player.DEFAULT_HEROES_COUNT)),
                new Player("Team2", false, HeroesGenerator.generateRandomHeroes(Player.DEFAULT_HEROES_COUNT))
        };

        int idActive;
        int idPassive;

        while (!finishGame) {
            idActive = BattleGame.activePlayerID;
            idPassive  = ChangeActivePlayerID(idActive);
            System.out.println("Атаковал игрок: " + players[idActive].getName() + ": " + Arrays.toString(players[idActive].getHeroes()));
            System.out.println("Игрок " + players[idPassive].getName() + ": " + Arrays.toString(players[idPassive].getHeroes()));
            if (players[idActive].isWinAfterAttack(players[idPassive])) {
                System.out.println("Победитель: " + players[idActive].getName());
                winner=players[idActive].getName();
                finishGame = true;
                break;
            }

        }
    }

}


