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

    public enum CardTypes {
        break_, skip, draw2, reverse, wild, wild4, normal
    }

    private CardTypes cardType;

    public Card(int cardColorIn, int cardValueIn, CardTypes cardTypeIn) {
        this.cardColor = cardColorIn;
        this.cardValue = cardValueIn;
        this.cardType = cardTypeIn;
    }

    public String getCardColorAsText() {
        switch (this.cardColor) {
            case 0:
                return "Red";
            case 1:
                return "Yellow";
            case 2:
                return "Blue";
            case 3:
                return "Green";
            case 4:
                return "Do 4 Burpies";
        }
        return "";
    }

    public String getCardTypeAsText() {
        switch (this.cardType) {
            case break_:
                return "Take a Break";
            case skip:
                return "skip";
            case draw2:
                return "draw2";
            case reverse:
                return "reverse";
            case wild:
                return "wild";
            case wild4:
                return "wild4";
            case normal:
                return "normal";
        }
        return "";
    }

    public int getCardColor() {
        return this.cardColor;
    }

    public int getCardValue() {
        return this.cardValue;
    }

    public CardTypes getCardType() {
        return this.cardType;
    }
}
