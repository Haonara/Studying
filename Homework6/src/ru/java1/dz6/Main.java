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

    }
}
