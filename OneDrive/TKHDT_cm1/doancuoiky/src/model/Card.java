package model;

import javax.swing.*;

public class Card extends  JButton{
    private ImageIcon imageIcon;
    private ImageIcon defaultIcon;
    private boolean check,checkUp;


    public Card(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
        this.defaultIcon= null;
        this.check=false;

        this.checkUp=false;
    }
    public void swapCard(){
        if(check){
            if(checkUp){
                this.setIcon(defaultIcon);
                checkUp=false;
            }else{
                this.setIcon(imageIcon);
                checkUp=true;
            }
        }
    }
    public boolean compareIcon(Card card){
        return false;
    }
}
