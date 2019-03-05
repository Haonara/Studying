package Java1Level.DZ3;

import java.util.Scanner;

public class Calc {

    static private Scanner in = new Scanner (System.in);

    private static void consoleCalc () {

        String[] line=in.nextLine().split(" ");

        int count1 = Integer.parseInt(line[0]);
        int count2 = Integer.parseInt(line[2]);
        switch (line[1]) {
            case "+":
                System.out.println(count1 + count2);
                break;
            case "-":
                System.out.println(count1 - count2);
                break;
            case "*":
                System.out.println(count1 * count2);
                break;
            case "/":
                System.out.println(count1 / count2);
                break;
        }

        in.close();
    }

    public static void main(String[] args) {
        consoleCalc ();
    }

}
