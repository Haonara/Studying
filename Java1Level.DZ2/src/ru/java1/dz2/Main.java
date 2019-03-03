package ru.java1.dz2;
import java.util.Scanner;
import java.lang.Math;



public class Main {

    public static void main(String[] args) {

    //invertArray();
    //fillArray();
    //changeArray();
    //fillDiagonal();

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

    public static void changeArray(){
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i]=arr[i]*2;
            }
            System.out.println("arr["+i+"]="+arr[i]);
        }

    }

    public static void fillDiagonal() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int n=scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                if (i==j) {
                    arr[i][j]=1;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }


}
