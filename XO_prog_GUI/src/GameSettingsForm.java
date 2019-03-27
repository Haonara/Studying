import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSettingsForm extends JFrame {
    GameSettingsForm gameSettingsForm = this;
    public GameSettingsForm() {
        setTitle("Настройки игры");
        setBounds(450, 450, 240, 250);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JLabel jLabelMode = new JLabel("Выберете режим игры:");
        add(jLabelMode);
        JRadioButton radioButtonModeTwoPlayers = new JRadioButton("Игрок против игрока");
        add(radioButtonModeTwoPlayers);
        radioButtonModeTwoPlayers.setSelected(true);
        JRadioButton radioButtonModeAgainstAI = new JRadioButton("Игрок против компьютера");
        add(radioButtonModeAgainstAI);
        JLabel jLabelAILevel = new JLabel("Выберете уровень AI:");
        add(jLabelAILevel);
        JSlider jSlider = new JSlider(0,2,0);
        add(jSlider);
        jSlider.setAlignmentX(LEFT_ALIGNMENT);
        jSlider.setVisible(false);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonModeTwoPlayers);
        buttonGroup.add(radioButtonModeAgainstAI);
        JLabel jLabelLinesCount = new JLabel("Размер поля (по умолчанию 3 на 3");
        add(jLabelLinesCount);
        JLabel jLabelLinesCount2 = new JLabel(" и не больше 10 на 10): ");
        add(jLabelLinesCount2);
        JTextField jTextFieldLinesCount = new JTextField();
        jTextFieldLinesCount.setMaximumSize(new Dimension(150, 20));
        add(jTextFieldLinesCount);
        JLabel jLabelWinLen = new JLabel("Победная серия:");
        add(jLabelWinLen);
        JSlider sliderWinLen = new JSlider(0,MainGameField.linesCount,3);
        add(sliderWinLen);
        JButton jButtonSetSettings = new JButton("Начать игру!");
        add(jButtonSetSettings);
        setVisible(true);

        radioButtonModeAgainstAI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButtonModeAgainstAI.isSelected()) {
                    jSlider.setVisible(true);
                }
            }
        });

        radioButtonModeTwoPlayers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButtonModeTwoPlayers.isSelected()) {
                    jSlider.setVisible(false);
                }
            }
        });s

        jButtonSetSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainGameField gameField = MainGameField.getInstance();
                if (jTextFieldLinesCount.getText().isEmpty()) {
                    gameField.linesCount = 3;
                    gameField.winLen=sliderWinLen.getValue();

                }
                else {
                    try {
                        gameField.maxLines=Integer.parseInt(jTextFieldLinesCount.getText());
                        if (gameField.maxLines<=10){
                            gameField.linesCount=gameField.maxLines;
                            sliderWinLen.setMaximum(gameField.maxLines);
                            gameField.winLen=sliderWinLen.getValue();
                        }else{
                            System.out.println("Вы ввели число больше 10. Размер поля будет установлен 3x3.");
                        }
                    }
                    catch (NumberFormatException ex) {
                        System.out.println("Необходимо ввести целое число меньше 10!");
                    }
                }
                gameField.startNewGame();
                if (radioButtonModeAgainstAI.isSelected()) {
                    gameField.gameMode = 2;
                }
                gameField.aiLevel = jSlider.getValue();
                gameSettingsForm.setVisible(false);
            }
        });

    }
}
