package ru.java1.dz7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

        public MainWindow(){

            setTitle("MOBA");
            setBounds(300, 300, 200, 100);
            setResizable(false);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JLabel newGame=new JLabel("Новая игра", SwingConstants.CENTER);
            add (newGame);
            JPanel buttonPanel = new JPanel(new GridLayout());
            add(buttonPanel, BorderLayout.SOUTH);
            JButton btnStart = new JButton("Старт");
            JButton btnEnd = new JButton("Выход");
            buttonPanel.add(btnStart);
            buttonPanel.add(btnEnd);
            btnEnd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            btnStart.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    SettingsWindow settingsWindow=new SettingsWindow();

                }
            });
            setVisible(true);

        }

}
