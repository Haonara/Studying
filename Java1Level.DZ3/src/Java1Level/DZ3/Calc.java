package Java1Level.DZ3;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;

public class Calc {

    static boolean isDelim(char razd) {
        return razd == ' '; //Проверяет, есть ли разделитель в исходной строке.
    }

    static boolean isOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/'; //Проверяет, есть ли опреатор в исходной строке.
    }

    static int priority(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1; //Сложение и вычитание - 1 приоритет
            case '*':
            case '/':
                return 2; //Умножение и деление - приоритете 2 (более высокий).
            default:
                return -1; //Приоритете по умолчанию (самый низкий).
        }
    }

    static void processOperator(LinkedList<Integer> spisok, char operator) {
        int right = spisok.removeLast(); //Возвращет последний элемент из списка.
        int left = spisok.removeLast(); //Возвращет предпоследний элемент из списка.
        switch (operator) {
            case '+':
                spisok.add(left + right);
                break;
            case '-':
                spisok.add(left - right);
                break;
            case '*':
                spisok.add(left * right);
                break;
            case '/':
                spisok.add(left / right);
                break;
        }
    }

    public static int vychislenie(String input) {
        LinkedList<Integer> spisokChisel = new LinkedList<Integer>();
        LinkedList<Character> spisokOperatorov = new LinkedList<Character>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); //Перебор в цикле каждог осимвола введенного выражения. Символ присваиваеться переменной 'c'.
            if (isDelim(c))
                continue; //Если есть разделитель, то переходим к следующему символу.
            if (c == '(')
                spisokOperatorov.add('('); //Если есть открывающая скобка, то она добавляется в список операторов.
            else if (c == ')') {  //Если есть закрывающая скобка, то:
                while (spisokOperatorov.getLast() != '(') //Пока в списке операторов последний добавленный символ - не открывающая скобка, то:
                    processOperator(spisokChisel, spisokOperatorov.removeLast()); //Методом processOperator в список чисел добавляем все, кроме операторов
                spisokOperatorov.removeLast();
            } else if (isOperator(c)) { //Если следующий символ является оператором
                while (!spisokOperatorov.isEmpty() && priority(spisokOperatorov.getLast()) >= priority(c)) //Выполняется, если список операторов не пустой и приоритетный оператор больше значения по умолчанию (-1)
                    processOperator(spisokChisel, spisokOperatorov.removeLast());
                spisokOperatorov.add(c); //В список операторов добавляется оператор
            } else {
                String operand = "";
                while (i < input.length() && Character.isDigit(input.charAt(i)))
                    operand += input.charAt(i++); //Проверка, является ли символ в введенном списке цифрой
                --i;
                spisokChisel.add(Integer.parseInt(operand)); //В список чисел добавляються цифры
            }
        }
        while (!spisokOperatorov.isEmpty())
            processOperator(spisokChisel, spisokOperatorov.removeLast());
        return spisokChisel.get(0);
    }



    public static void main(String[] args) {
        String expresion = "19+(5*3)-(3*2)";
        System.out.println(vychislenie(expresion));

    }

}
