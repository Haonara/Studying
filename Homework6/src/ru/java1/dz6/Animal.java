package ru.java1.dz6;

public class Animal {

    public void run(String name, int l){
        System.out.println(name+ " пробежал "+ l + " метров.");
    }
    public void swim (String name, int l){
        System.out.println(name+ " проплыл "+ l + " метров.");
    }
    public void jump(String name, double h){
        if (h!=1){
            System.out.println(name+ " прыгнул на "+ h + " метра.");
        } else {
            System.out.println(name+ " прыгнул на "+ h + " метр.");
        }
    }

}
