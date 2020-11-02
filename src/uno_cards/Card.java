/*
 * This file includes the Card class and its intrinsic functions 
 */
package uno_cards;
/**
 *this class represents a single card which holds a value for color, number, and type
 * @author andrew
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
    /**
     * This returns the color as a string
     * @return 
     */

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
    /**
     * Returns the type as a string 
     * @return 
     * @author andrew
     */
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
