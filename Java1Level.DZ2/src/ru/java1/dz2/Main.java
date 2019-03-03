package ru.java1.dz2;
import java.util.Scanner;
import java.lang.Math;



public class Main {

    public static void main(String[] args) {

    //invertArray();
    //fillArray();

    }

    public static void invertArray () {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int n=scanner.nextInt();
        int [] arr=new int[n];
        for (int i=0; i<n; i++) {
            arr [i]=(int)(Math.random()*2);
            System.out.println("arr["+i+"]="+arr[i]);
        }

        System.out.println("Измененный массив");
        for (int i=0; i<n;i++){
            if (arr[i]==0) {arr[i]=1;}
            else {arr[i]=0;}
            System.out.println("arr["+i+"]="+arr[i]);
        }

    }

    public static void fillArray (){
        int [] arr=new int[8];
        for (int i=0; i<8; i++) {
            arr [i]=i*3;
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
