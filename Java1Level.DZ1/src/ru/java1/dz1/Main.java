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

        Uravnenie();
        Logic();
        Otritsanie();


    }
    private static void Uravnenie(){
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

    private static void Logic(){
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

    private static void Otritsanie(){
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


}



