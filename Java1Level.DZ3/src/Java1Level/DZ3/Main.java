package Java1Level.DZ3;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        guessNumber();
        guessWord();

    }

    private static void  guessNumber(){

        System.out.println("Ваша задача угадать число. Максимальное количество попыток - 3.");
        int range=10; //Диапозон загадываемого числа (от 0 до 10).
        int maxGuess=3; //Максимальное количество попыток.
        int curGuess=0;
        Scanner inNumber=new Scanner(System.in);
        Random random=new Random();
        int number = random.nextInt(range);  //Загадывается число.

        while(true){
            curGuess+=1;
            if (curGuess>maxGuess){
                System.out.println("Вы проиграли! Повторить игру еще раз? 1-да, 0-нет.");
                int povtor=inNumber.nextInt();
                if (povtor==0){           //Если ввели 0, то выходим из игры.
                System.exit(0);}
                else if (povtor!=1) {
                    System.out.println("Введенный ответ неверен. Будет произведен выход из игры.");
                    System.exit(0);  //Если ввели все, кроме 0 и 1, то выходим из игры.
                } else curGuess=1;  //Играем заново, начиная с первой попытки.
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

    private static void  guessWord() {
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int lengthArr = words.length;
        Scanner inWord = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(lengthArr);
        String str = words[number];

        while (true) {

            System.out.println("Угадайте загаданное слово.");
            int lengthWord = str.length();
            String guess = inWord.nextLine();
            int lengthGuess = guess.length();
            if (words[number].equalsIgnoreCase(guess)) {
                System.out.println("Вы угадали!");
                break;
            } else if(lengthGuess<=lengthWord){
                StringBuilder strb = new StringBuilder();
                for (int i = 0; i <lengthGuess; i++) {
                    if (guess.charAt(i)==str.charAt(i)){ //Проверка совпадения слов посимвольно. Если символ есть, ставится символ.
                        strb.append(guess.charAt(i));
                    }
                    else {
                        strb.append("*");  //Иначе ставиться *.
                    }
                }

                System.out.println("Вы не угадали! Попробуйте еще раз. Количество букв меньше либо равно загадонному. Подсказка:"+strb+"******");

                } else {
                StringBuilder strb = new StringBuilder();
                for (int i = 0; i <lengthWord; i++) {
                    if (guess.charAt(i)==str.charAt(i)){ //Проверка совпадения слов посимвольно. Если символ есть, ставится символ.
                        strb.append(guess.charAt(i));
                    }
                    else {
                        strb.append("*"); //Иначе ставиться *.
                    }
                }

                System.out.println("Вы не угадали! Попробуйте еще раз. Количество букв больше загадонного.Подсказка:"+strb+"******");
            }

        }

        inWord.close();
    }

}
