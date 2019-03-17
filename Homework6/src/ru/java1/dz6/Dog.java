package ru.java1.dz6;

public class Dog extends Animal{


    int max;

    @Override
    public void run(String name, int l) {

        if (name=="Мопс"){
            max=400;
        }else {
            max=600;
        }

        if (l<=max){
            super.run(name, l);
        } else {
            System.out.println(name+" не может пробежать больше 500 метров.");
        }

    }
    @Override
    public void swim(String name, int l) {
        if (l <= 10) {
            super.swim(name, l);
        } else {
            System.out.println(name + " не может проплыть больше 10 метров.");
        }
    }

    @Override
    public void jump(String name, double h) {
        if (h <= 0.5) {
            super.jump(name, h);
        } else {
            System.out.println(name + " не может прыгнять больше, чем на 0,5 метра.");
        }
    }
}
