package ru.java1.dz6;

public class Main {

    public static void main(String[] args) {

        Dog mops=new Dog();
        mops.run("Мопс", 500);
        mops.swim("Мопс",5);
        mops.jump("Мопс",0.3);

        Cat cat=new Cat();
        cat.run("Барсик", 200);
        cat.jump("Барсик", 1.5);
        cat.swim("Барсик",2);

        Dog dog=new Dog();
        dog.run ("Тузик",500);
        dog.jump("Тузик", 2);

        //Dop_DZ

        String s = "Предложение  один     Теперь предложение    два   Предложение   три";
        String s1 = s.replaceAll(" +", " ");
        StringBuilder s2 = new StringBuilder(s1);

        for (int i = 1; i <s1.length(); i++) {

            if(s1.charAt(i) >= 'А' && s1.charAt(i) <= 'Я') {
                s2.setCharAt(i-1, '.');
            }
        }
        for (int i = 1; i <=s1.length(); i++) {

            if(s2.charAt(i) == '.' ) {
                s2.replace(i, i+1, ". "); //Если точка, заменем на точку и пробел.
            }
            if (i==s1.length()){
                s2.append("."); //Добавляем в конце точку.
                break;
            }
        }

        System.out.println(s2.toString());




    }
}
