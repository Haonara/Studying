package Java1Level.DZ7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

       new myWindow();
       //new Dialog();

    }

}

class myWindow extends JFrame{

    public myWindow(){
        setTitle("DZ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,300,400,400);

        JLabel label1=new JLabel("Фамилия:");
        JLabel label2=new JLabel("Имя:");
        JLabel label3=new JLabel("Отчество:");
        JButton button1=new JButton("Добавить");
        JButton button2=new JButton("Выход");
        JTextField text1=new JTextField("", 1);
        JTextField text2=new JTextField("", 1);
        JTextField text3=new JTextField("", 1);



        Container container=this.getContentPane();
        container.setLayout(new GridLayout(4,3));
        container.add(label1);
        container.add(text1);
        container.add(label2);
        container.add(text2);
        container.add(label3);
        container.add(text3);
        container.add(button1);
        container.add(button2);

        setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dialog();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }



}

class Dialog extends JFrame{

    public Dialog(){
        setTitle("DZ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,300,400,400);


        JButton button1=new JButton("ОК");
        JButton button2=new JButton("Отмена");

        JLabel label1=new JLabel("Введите фамилию:");
        JLabel label2=new JLabel("Введите имя:");
        JLabel label3=new JLabel("Введите отчество:");
        JTextField text1=new JTextField("", 1);
        JTextField text2=new JTextField("", 1);
        JTextField text3=new JTextField("", 1);

        Container container=this.getContentPane();
        container.setLayout(new GridLayout(4,3));
        container.add(label1);
        container.add(text1);
        container.add(label2);
        container.add(text2);
        container.add(label3);
        container.add(text3);
        container.add(button1);
        container.add(button2);

        setVisible(true);

        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
            }
        });
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


    }



}
