package ru.java1.dz5;



public class Main {

    public static void main(String[] args) {



        People[] peoplesArray = new People[5];
        peoplesArray[0]=new People("Иванов Иван Иванович", "Инженер", "ivanov@mail.ru", "8(954)123-45-45", 30000, 45);
        peoplesArray[1]=new People("Сидоров Иван Васильевич", "Менеджер", "sidorov@mail.ru", "8(924)2224555", 40000, 38);
        peoplesArray[2]=new People("Козлов Олег Иванович", "Слесарь", "kozlov@mail.ru", "254-25-65", 20000, 52);
        peoplesArray[3]=new People("Радужная Елена Сергеевна", "Врач", "raduga_es@mail.ru", "8(425)1275445", 35000, 35);
        peoplesArray[4]=new People("Болотная Ольга Ивановна", "Руководитель", "bolotnaya@mail.ru", "89144564545", 60000, 43);


            for (int i = 0; i <peoplesArray.length ; i++) {
                if (peoplesArray[i].age>=40){
                System.out.println(peoplesArray[i].FIO+" "+peoplesArray[i].dolzhnost+" "+peoplesArray[i].age);
                }
            }







    }
}
