/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_cards;

import java.util.ArrayList;

/**
 *
 * @author chris
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
    public Hand (Deck deckDraw, int numDraw) {
        newHand(deckDraw, numDraw);
        
    }
    
    
    
    public void newHand(Deck deckIn, int numCards){
        playerHand.clear();
        playerHand.addAll(deckIn.draw(numCards));
        
        for (int i = 0; i < playerHand.size(); i++) {
            System.out.println("Color: " + playerHand.get(i).getCardColor() + "; Value: " + playerHand.get(i).getCardValue());
        
            switch (this.playerHand.get(i).getCardColor()) {
                    case 0:
                        
                        this.numRed = this.playerHand.get(i).getCardValue();
                        this.numRedTotal += this.numRed;
                    case 1:
                        this.numYellow= this.playerHand.get(i).getCardValue();
                        this.numYellowTotal += this.numYellow;
                        break;
                    case 2:
                        this.numBlue= this.playerHand.get(i).getCardValue();
                        this.numBlueTotal += this.numBlue;
                        break;
                    case 3:
                        this.numGreen= this.playerHand.get(i).getCardValue();
                        this.numGreenTotal += this.numGreen;
                        break;

                }
        }
        System.out.println(playerHand.size());
       
    }
    
    public void sortHand () {
        ArrayList<Card> temp = new ArrayList<Card>();
        temp.addAll(playerHand);
        
        int handSize = playerHand.size();
        for(int c=0; c < handSize-1; c++){
            for(int i = 0; i < handSize-c-1; i++){
                if(playerHand.get(i).getCardColor() > playerHand.get(i+1).getCardColor()){
                    Card tempCard = playerHand.get(i);
                    playerHand.set( i, playerHand.get(i+1));
                    playerHand.set( (i+1), tempCard);
                }
            } 
        }
        
        for(int c=0; c < handSize-1; c++){
            for(int i = 0; i < handSize-c-1; i++){
                if( (playerHand.get(i).getCardValue() > playerHand.get(i+1).getCardValue()) && (playerHand.get(i).getCardColor() == playerHand.get(i+1).getCardColor()) ){
                    Card tempCard = playerHand.get(i);
                    playerHand.set( i, playerHand.get(i+1));
                    playerHand.set( (i+1), tempCard);
                }
            } 
        }
        
        for (int i = 0; i < playerHand.size(); i++) {
            System.out.println("Color: " + playerHand.get(i).getCardColor() + "; Value: " + playerHand.get(i).getCardValue());
        }
        System.out.println(playerHand.size());
        
    }
    
    public ArrayList<Card> getHand(){
        return playerHand;
    }
    
    public int getNumRed(){
        return this.numRed; 
    }
    public int getNumYellow(){
        return this.numYellow; 
    }
    public int getNumBlue(){
        return this.numBlue; 
    }
    public int getNumGreen(){
        return this.numGreen; 
    }
    public int getNumRedTotal(){
        return this.numRedTotal; 
    }
    public int getNumYellowTotal(){
        return this.numYellowTotal; 
    }
    public int getNumBlueTotal(){
        return this.numBlueTotal; 
    }
    public int getNumGreenTotal(){
        return this.numGreenTotal; 
    }
}
