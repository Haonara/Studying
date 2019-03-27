package ru.java1.dz7;

import java.util.Arrays;

public class BattleGame {
    static int activePlayerID = 0;

    public static void main(String[] args) {
        boolean finishGame = false;



        Player[] players = {
                new Player("Green", true, HeroesGenerator.generateRandomHeroes(Player.DEFAULT_HEROES_COUNT)),
                new Player("Red", false, HeroesGenerator.generateRandomHeroes(Player.DEFAULT_HEROES_COUNT))
        };

        int idActive;
        int idPassive;

        while (!finishGame) {
            idActive = BattleGame.activePlayerID;
            idPassive  = ChangeActivePlayerID(idActive);
            System.out.println("Атаковал игрок: " + players[idActive].getName() + ": " + Arrays.toString(players[idActive].getHeroes()));
            System.out.println("Игрок " + players[idPassive].getName() + ": " + Arrays.toString(players[idPassive].getHeroes()));
            if (players[idActive].isWinAfterAttack(players[idPassive])) {
                System.out.println("Победил игрок: " + players[idActive].getName());
                finishGame = true;
                break;
            }

        }
    }

    public int getActivePlayerID() {
        return activePlayerID;
    }

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
}
