package ru.java1.dz7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class SettingsWindow extends JFrame {

    public SettingsWindow(){
        setTitle("Settings");
        setBounds(300, 300, 400, 250);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel panelTeam1 = new JPanel();
        panelTeam1.setLayout(new BoxLayout(panelTeam1, BoxLayout.X_AXIS));
        JComboBox comboBox1=new JComboBox();
        panelTeam1.add(comboBox1);
        JButton button1=new JButton("Добавить");
        panelTeam1.add(button1);
        comboBox1.addItem("Warrior");
        comboBox1.addItem("Assassin");
        comboBox1.addItem("Healer");

        JPanel panelTeam2 = new JPanel();
        panelTeam2.setLayout(new BoxLayout(panelTeam2, BoxLayout.X_AXIS));
        JComboBox comboBox2=new JComboBox();
        panelTeam2.add(comboBox2);
        JButton button2=new JButton("Добавить");
        panelTeam2.add(button2);
        comboBox2.addItem("Warrior");
        comboBox2.addItem("Assassin");
        comboBox2.addItem("Healer");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        JLabel label1=new JLabel("Team1");
        JLabel label2=new JLabel("Team2");
        label1.setMaximumSize(new Dimension(100,10));
        label2.setMaximumSize(new Dimension(100,10));
        panel.add(label1);
        panel.add(label2);
        panel.add(panelTeam1);
        panel.add(panelTeam2);

        JLabel list1=new JLabel();
        JLabel list2=new JLabel();
        list1.setMaximumSize(new Dimension(100,50));
        list2.setMaximumSize(new Dimension(100,50));
        panel.add(list1);
        panel.add(list2);
        add(panel);
        JPanel ending=new JPanel();
        ending.setLayout(new GridLayout(1,2));
        JLabel winner=new JLabel("Победитель: ");
        JButton start=new JButton("Начать");
        JTextField end=new JTextField(1);
        start.setAlignmentX(Component.CENTER_ALIGNMENT);
        end.setMaximumSize(new Dimension(50,10));
        end.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(start);
        ending.add(winner);
        ending.add(end);
        ending.setMaximumSize(new Dimension(200,10));
        add(ending);

        setVisible(true);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               BattleGame.start();
               end.setText(BattleGame.winner);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               comboBox1.getSelectedItem();

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox2.getSelectedItem();
            }
        });

    }

}

