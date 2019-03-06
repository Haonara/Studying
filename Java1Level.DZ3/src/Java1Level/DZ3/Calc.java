package Java1Level.DZ3;

import java.util.Scanner;

public class Calc {

    static private Scanner in = new Scanner (System.in);

    private static void consoleCalc () {

        String[] line=in.nextLine().split(" ");


        int result;
        int count1 = Integer.parseInt(line[0]);
        int count2 = Integer.parseInt(line[2]);
        switch (line[1]) {
            case "+":
                result=count1 + count2;
                System.out.println(result);
                break;
            case "-":
                result=count1 - count2;
                System.out.println(result);
                break;
            case "*":
                result=count1 * count2;
                System.out.println(result);
                break;
            case "/":
                result=count1 / count2;
                System.out.println(result);
                break;
        }

        in.close();
    }

    public static void main(String[] args) {
        consoleCalc ();
    }

}
