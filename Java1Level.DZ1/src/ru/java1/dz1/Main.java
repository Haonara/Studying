package ru.java1.dz1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 1000;
        boolean bool = true;
        String str = "Hello, world!";
        char ch = '#';
        byte b = 5;
        short sh = 10000;
        long l = 111112111111111L;
        float f = 105.5f;
        double d = 505.55;

        uravnenie();
        logic();
        positiveOrNegative();
        negative();
        greetings();
        years();

    }
    private static void uravnenie(){
        Scanner scanner=new Scanner(System.in);
        int result;
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();
        System.out.println("Введите четвертое число:");
        int d = scanner.nextInt();

        result=a*(b+(c/d));

        System.out.println("Выражение a*(b+(c/d)) = "+result);
        scanner.close();

    }

    private static void logic(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        int result;
        result=a+b;

        if (result>=10 && result<=20) {
            System.out.println("Сумма чисел в пределах указанного диапозона");
            System.out.println(true);}
            else {
                System.out.println("Сумма выходит за пределы указанного диапозона");
                System.out.println(false);
            }

        scanner.close();
    }

    private static void positiveOrNegative(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число:");
        byte a = scanner.nextByte();

        if (a>=0) {
            System.out.println("Введенное число положительное");
        } else {
            System.out.println("Введенное число отрицательное");
        }

        scanner.close();
    }

    private static void negative(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число:");
        byte a = scanner.nextByte();

        if (a<0) {
            System.out.println("Введенное число отрицательное");
            System.out.println(true);
        }

        scanner.close();
    }

    private static void greetings(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите имя:");
        String name=scanner.next();
        System.out.println("Привет, "+name+"!");
    }

    private static void years(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите год:");
        int year=scanner.nextInt();

        if (year%100==0) {
            if (year%400==0) {
                System.out.println("Год является високосным.");
            }
            else {
                System.out.println("Год не является високосным.");
            }
        }
        else if (year%4==0) {
            System.out.println("Год является високосным.");
        }
        else {
            System.out.println("Год не является високосным.");
        }
    }

}



