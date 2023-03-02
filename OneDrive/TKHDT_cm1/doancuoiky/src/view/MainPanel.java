package view;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private GamePanel gamePanel;
    private TopPanel topPanel;
    private BottomPanel bottomPanel;
    private MenuPanel menuPanel;
    private CardLayout cardLayout;

    
    public MainPanel() {
        initPanel();
    }

    private void initPanel() {
//        this.gamePanel = new GamePanel();
        this.setSize(GameFrame.WIDTH,GameFrame.HEIGHT);

        this.cardLayout=new CardLayout();

        this.topPanel = new TopPanel(this.gamePanel);
        this.bottomPanel = new BottomPanel(this.gamePanel);
        this.menuPanel= new MenuPanel(cardLayout);
        menuPanel.setSize(GameFrame.WIDTH, GameFrame.HEIGHT);
        this.topPanel.setBackground(Color.orange);
        this.bottomPanel.setBackground(Color.BLACK);

        this.setLayout(cardLayout);
        this.add(menuPanel);
     

//        this.setLayout(new BorderLayout());
//        this.add(gamePanel, BorderLayout.CENTER);
//        this.add(topPanel, BorderLayout.NORTH);
//        this.add(bottomPanel, BorderLayout.SOUTH);
    }
}


