package ru.java1.dz7;

import javax.swing.*;
import java.awt.*;

public class SettingsWindow extends JFrame {

    public SettingsWindow(){
        setTitle("Settings");
        setBounds(300, 300, 750, 450);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel panelTeam1 = new JPanel();
        panelTeam1.setLayout(new BoxLayout(panelTeam1, BoxLayout.X_AXIS));
        JComboBox comboBox1=new JComboBox();
        panelTeam1.add(comboBox1);
        JButton button1=new JButton("Добавить");
        panelTeam1.add(button1);

        JPanel panelTeam2 = new JPanel();
        panelTeam2.setLayout(new BoxLayout(panelTeam2, BoxLayout.X_AXIS));
        JComboBox comboBox2=new JComboBox();
        panelTeam2.add(comboBox2);
        JButton button2=new JButton("Добавить");
        panelTeam2.add(button2);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        JLabel label1=new JLabel("Team1");
        JLabel label2=new JLabel("Team2");
        panel.add(label1);
        panel.add(label2);
        panel.add(panelTeam1);
        panel.add(panelTeam2);
        JList listTeam1=new JList();
        panel.add(listTeam1);
        JList listTeam2=new JList();
        panel.add(listTeam2);
        add(panel);
        JButton start=new JButton("Начать");
        JTextField end=new JTextField(1);
        add(start);
        add(end);










        setVisible(true);
    }

}
