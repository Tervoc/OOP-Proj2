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
    
    public Hand (Deck deckDraw, int numDraw) {
        newHand(deckDraw, numDraw);
        
    }
    
    public void newHand(Deck deckIn, int numCards){
        playerHand.clear();
        playerHand.addAll(deckIn.draw(numCards));
        
        for (int i = 0; i < playerHand.size(); i++) {
            System.out.println("Color: " + playerHand.get(i).getCardColor() + "; Value: " + playerHand.get(i).getCardValue());
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
}
