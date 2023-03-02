package view;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private MainPanel mainPanel;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 400;
    public GameFrame() {
        init();
    }

    private void init() {
        this.mainPanel = new MainPanel();
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.add(mainPanel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
		new GameFrame();
	}
}
