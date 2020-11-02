/*
 * this file includes the hand class and its intrinsic functions 
 */
package uno_cards;

import java.util.ArrayList;

/**
 8This class represents a hand which inherits deck and adds functions for sorting
 * @author andrew
 */
public class Hand {
    
    private ArrayList<Card> playerHand = new ArrayList<Card>();
    private int numRed;
    private int numBlue;
    private int numGreen;
    private int numYellow;
    private int numRedTotal;
    private int numBlueTotal;
    private int numGreenTotal;
    private int numYellowTotal;
    private int[] totals = {this.numRedTotal, this.numYellowTotal, this.numBlueTotal, this.numGreenTotal};
    private int[] totalDeltas = {this.numRed, this.numYellow, this.numBlue, this.numGreen};
    
    public Hand(Deck deckDraw, int numDraw) {
        newHand(deckDraw, numDraw);

    }

    @SuppressWarnings("empty-statement")
    public void newHand(Deck deckIn, int numCards) {
        playerHand.clear();
        playerHand.addAll(deckIn.draw(numCards));
        this.numRed = 0;
        this.numYellow = 0;
        this.numBlue = 0;
        this.numGreen = 0;
        
        boolean[] skip = {false, false, false, false};
        boolean[] draw2 = {false, false, false, false};
        boolean[] reverse = {false, false, false, false};
        boolean wild4 = false;
        
        int cardColor;
        Card.CardTypes cardType;
        
        for(int i =0; i<4; i++){
            this.totalDeltas[i] = 0;
        }
        
        for (int i = 0; i < playerHand.size(); i++) {
            System.out.println("Color: " + playerHand.get(i).getCardColor() + "; Value: " + playerHand.get(i).getCardValue());
            cardColor = this.playerHand.get(i).getCardColor();
            cardType = this.playerHand.get(i).getCardType();
            switch (cardColor) {
                case 0:
                    if(cardType == Card.CardTypes.skip){ skip[0] = true; }
                    else if(cardType == Card.CardTypes.draw2){ draw2[0] = true;}
                    else if(cardType == Card.CardTypes.reverse){ reverse[0] = true;}
                    else{
                        totalDeltas[0] += this.playerHand.get(i).getCardValue();//do not add the values of the action cards
                    }
                    break;
                case 1:
                    if(cardType == Card.CardTypes.skip){skip[1] = true;}
                    else if(cardType == Card.CardTypes.draw2){ draw2[1] = true;}
                    else if(cardType == Card.CardTypes.reverse){ reverse[1] = true;}
                    else{
                        totalDeltas[1] += this.playerHand.get(i).getCardValue(); 
                    }
                    break;
                case 2:
                    if(cardType == Card.CardTypes.skip){skip[2] = true;}
                    else if(cardType == Card.CardTypes.draw2){ draw2[2] = true;}
                    else if(cardType == Card.CardTypes.reverse){ reverse[2] = true;}
                    else{
                        totalDeltas[2] += this.playerHand.get(i).getCardValue();
                    }
                     break;
                case 3:
                    if(cardType == Card.CardTypes.skip){skip[3] = true;}
                    else if(cardType == Card.CardTypes.draw2){draw2[3] = true;}
                    else if(cardType == Card.CardTypes.reverse){ reverse[3] = true;}
                    else{
                        totalDeltas[3] += this.playerHand.get(i).getCardValue();
                    }
                    break;
                case 4:
                    if(cardType == Card.CardTypes.wild){
                        System.out.println("Do 4 Burpies");
                    }
                    if(cardType == Card.CardTypes.wild4){
                        System.out.println("Do 4 Burpies");
                        wild4 = true;
                    }
                    break;
            }
        }
        for(int i=0; i<4; i++){
            if(skip[i]){
                totalDeltas[i] =0;
            }
            if(draw2[i]){//double the values of the cards that are of the same color
                totalDeltas[i] *=2;
            }
            if(reverse[i]){//cards of the same coolor as the revers are returned to bottom of deck and reverse card is discarded
                for(int j=0; j<playerHand.size(); j++){
                    if(playerHand.get(j).getCardColor() == i && playerHand.get(j).getCardType() != Card.CardTypes.reverse){
                        deckIn.returnCardToBottom(playerHand.get(j));
                    }
                }
                totalDeltas[i] = 0;
            } 
            if(wild4){
                totalDeltas[i] *=4;
            }
            
        }
        this.numRed = totalDeltas[0];
        this.numYellow = totalDeltas[1];
        this.numBlue = totalDeltas[2];
        this.numGreen = totalDeltas[3];
        
        this.numRedTotal += this.numRed;
        this.numYellowTotal += this.numYellow;
        this.numBlueTotal += this.numBlue;
        this.numGreenTotal += this.numGreen;
        
       
        System.out.println(playerHand.size());

    }

    /**
     * This function uses a double bubble sort to first sort cards by color then sort cards rank
     * 
     * @author christian 
     */
    
    public void sortHand() {
        ArrayList<Card> temp = new ArrayList<Card>();
        temp.addAll(playerHand);

        int handSize = playerHand.size();
        for (int c = 0; c < handSize - 1; c++) {
            for (int i = 0; i < handSize - c - 1; i++) {
                if (playerHand.get(i).getCardColor() > playerHand.get(i + 1).getCardColor()) {
                    Card tempCard = playerHand.get(i);
                    playerHand.set(i, playerHand.get(i + 1));
                    playerHand.set((i + 1), tempCard);
                }
            }
        }

        for (int c = 0; c < handSize - 1; c++) {
            for (int i = 0; i < handSize - c - 1; i++) {
                if ((playerHand.get(i).getCardValue() > playerHand.get(i + 1).getCardValue()) && (playerHand.get(i).getCardColor() == playerHand.get(i + 1).getCardColor())) {
                    Card tempCard = playerHand.get(i);
                    playerHand.set(i, playerHand.get(i + 1));
                    playerHand.set((i + 1), tempCard);
                }
            }
        }

        for (int i = 0; i < playerHand.size(); i++) {
            System.out.println("Color: " + playerHand.get(i).getCardColor() + "; Value: " + playerHand.get(i).getCardValue());
        }
        System.out.println(playerHand.size());

    }

    public ArrayList<Card> getHand() {
        return playerHand;
    }

    public int getNumRed() {
        return this.numRed;
    }

    public int getNumYellow() {
        return this.numYellow;
    }

    public int getNumBlue() {
        return this.numBlue;
    }

    public int getNumGreen() {
        return this.numGreen;
    }

    public int getNumRedTotal() {
        return this.numRedTotal;
    }

    public int getNumYellowTotal() {
        return this.numYellowTotal;
    }

    public int getNumBlueTotal() {
        return this.numBlueTotal;
    }

    public int getNumGreenTotal() {
        return this.numGreenTotal;
    }
}
