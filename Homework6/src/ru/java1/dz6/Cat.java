package ru.java1.dz6;

public class Cat extends Animal {



    @Override
    public void swim(String name, int l) {
        System.out.println(name+" не умеет плавать!");
    }

    @Override
    public void run(String name, int l) {
        if (l<=200){
            super.run(name, l);
        } else {
            System.out.println(name+" не может пробежать больше 200 метров.");
        }
    }

    @Override
    public void jump(String name, double h) {
        if (h <= 2) {
            super.jump(name, h);
        } else {
            System.out.println(name + " не может прыгнять больше, чем на 2 метра.");
        }
    }
}
