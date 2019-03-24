package Java1Level.DZ7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

       new myWindow();

    }

}

class myWindow extends JFrame{

    static JLabel text1=new JLabel("");
    static JLabel text2=new JLabel("");
    static JLabel text3=new JLabel("");


    public myWindow(){
        setTitle("DZ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,300,400,400);

        JLabel label1=new JLabel("Фамилия:");
        JLabel label2=new JLabel("Имя:");
        JLabel label3=new JLabel("Отчество:");
        JButton button1=new JButton("Добавить");
        JButton button2=new JButton("Выход");


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

    static void setValue(String name, String surname, String lastName){
        text1.setText(""+name);
        text2.setText(""+surname);
        text3.setText(""+lastName);
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
        JTextField textEdit1=new JTextField("", 1);
        JTextField textEdit2=new JTextField("", 1);
        JTextField textEdit3=new JTextField("", 1);

        Container container=this.getContentPane();
        container.setLayout(new GridLayout(4,3));
        container.add(label1);
        container.add(textEdit1);
        container.add(label2);
        container.add(textEdit2);
        container.add(label3);
        container.add(textEdit3);
        container.add(button1);
        container.add(button2);

        setVisible(true);

        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                myWindow.setValue(textEdit1.getText(),textEdit2.getText(),textEdit3.getText());
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
