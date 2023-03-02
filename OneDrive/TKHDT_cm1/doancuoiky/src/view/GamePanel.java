package view;

import control.Mouse;
import model.Card;

import javax.swing.*;

public class GamePanel extends JPanel {
    private Card[][] cards;
    private int[] x;
    private int[] y;
    public int level;
    private Mouse mouse;


    public GamePanel(int level) {

        x = new int[]{2, 3, 4, 5};
        y = new int[]{2, 2, 3, 4};



    }
    public void createMatrix(){

    }
    public void shuffle() {
        for (int i = 0; i < x[level]; i++) {
            for (int j = 0; j < y[level]; j++) {

            }
        }
    }
}
