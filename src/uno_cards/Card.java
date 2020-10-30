/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_cards;
//bet
/**
 *
 * @author chris
 */
public class Card {

    private int cardColor;
    private int cardValue;

    public enum cardColors {
        red, blue, green, yellow
    };
    private cardColors cardColor_ = cardColors.red;

    public Card(int cardColorIn, int cardValueIn) {
        this.cardColor = cardColorIn;
        this.cardValue = cardValueIn;
    }
    
    public String getCardColorAsText(){
        switch (this.cardColor) {
                    case 0:
                        return "Red";  
                    case 1:
                        return "Yellow";
                    case 2:
                        return "Blue";
                    case 3:
                        return "Green";
                }
        return "";
    }

    public int getCardColor() {
        return this.cardColor;
    }

    public int getCardValue() {
        return this.cardValue;
    }
}
