package ru.java1.dz5;


public class People {
    String FIO;
    String dolzhnost;
    String email;
    String phone;
    int salary;
    int age;
    People[] peoplesArray = new People[5];

    public People(String FIO, String dolzhnost, String email,String phone, int salary, int age){
        this.FIO=FIO;
        this.dolzhnost=dolzhnost;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }

    public void info (){
        System.out.println("Сотрудник "+FIO+ " "+age+ " лет, тел.: "+phone+ ", почта: "+email);
        System.out.println("Занимает должность '"+dolzhnost+ "' с зарплатой в "+salary+" рублей.");
    }

    public static void show(People[] peoplesArray){
        for (int i = 0; i < peoplesArray.length; i++) {
            System.out.println(peoplesArray[i]);
        }
    }

}
