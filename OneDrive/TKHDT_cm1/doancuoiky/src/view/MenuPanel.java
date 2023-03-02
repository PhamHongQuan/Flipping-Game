package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;

public class MenuPanel extends JPanel implements ActionListener {
    private JButton playButton;
    private JTextField levelInputField;
    private CardLayout cardLayout;

    public MenuPanel(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
        float a = 100;
        setLayout(null);
        setlevelInputField();
        setPlayButton();
        this.setBackground(new Color(217, 217, 217));
    }

    public void setlevelInputField() {
        this.levelInputField = new JTextField();

        this.levelInputField.setSize((int) (GameFrame.WIDTH * 0.75), 25);
        levelInputField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.levelInputField.setLocation(100, 125);
        this.add(levelInputField);
    }

    public void setPlayButton() {
        this.playButton = new JButton("Play");

        this.playButton.setSize(75,25);
        this.playButton.setLocation((int) (GameFrame.WIDTH*.5-50), (int) (this.levelInputField.getHeight()*2+this.levelInputField.getY()));
        this.add(playButton);
        playButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
