package Java1Level.DZ3;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //guessNumber();
        guessWord();

    }

    private static void  guessNumber(){

        System.out.println("Ваша задача угадать число. Максимальное количество попыток - 3.");
        int range=10;
        int maxGuess=3;
        int curGuess=0;
        Scanner inNumber=new Scanner(System.in);
        Random random=new Random();
        int number = random.nextInt(range);

        while(true){
            curGuess+=1;
            if (curGuess>maxGuess){
                System.out.println("Вы проиграли! Повторить игру еще раз? 1-да, 0-нет.");
                int povtor=inNumber.nextInt();
                if (povtor==0){
                System.exit(0);}
                else if (povtor!=1) {
                    System.out.println("Введенный ответ неверен. Будет произведен выход из игры.");
                    System.exit(0);
                } else curGuess=1;
            }
            System.out.println("Угадайте число от 0 до "+range);
            int input_number=inNumber.nextInt();
            if(input_number==number){
                System.out.println("Вы угадали!");
                break;
            }else if(input_number>number){
                System.out.println("Загаданное число меньше");
            }else {
                System.out.println("Загаданное число больше");
            }
        }

        inNumber.close();
    }

    private static void  guessWord(){
        String[] words=new String[] {"apple", "apricot", "avocado", "potato"};
        int length=words.length;
        Scanner inWord=new Scanner(System.in);
        Random random=new Random();
        int number=random.nextInt(length);

        while(true){

            System.out.println("Угадайте загаданное слово.");
            String guess=inWord.nextLine();
            if(guess.equalsIgnoreCase(words[number])){
                System.out.println("Вы угадали!");
                break;
            }else {
                System.out.println("Вы не угадали! Попробуйте еще раз.");
            }


        }

        inWord.close();

    }
}
