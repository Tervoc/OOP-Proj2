/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_cards;

import java.util.*;

public class UNO_Cards {
    
    private class Card { 
        
        private int cardColor;
        private int cardValue;
        
        public Card (int cardColorIn, int cardValueIn) {
            this.cardColor = cardColorIn;
            this.cardValue = cardValueIn;
        } 
        
        public int getCardColor () {
            return this.cardColor;
        }
        
        public int getCardValue () {
            return this.cardValue;
        }
        
    }
    
    private class Deck {
        
        private ArrayList<Card> deckCard = new ArrayList<Card>(); 
        
        public Deck () {
            
            for(int c = 0; c < 4; c++) { 
                
                Card zeroCard = new Card(c,0);
                Card wildCard = new Card(c, 13);
                Card wilddrawCard = new Card(c, 14); 
                
                deckCard.add(zeroCard);
                
                for(int v = 1; v < 13; v++ ) { 
                    
                    Card newCard = new Card(c,v);
                    
                    deckCard.add(newCard);
                    deckCard.add(newCard);
                    
                }
             
                deckCard.add(wildCard);
                deckCard.add(wilddrawCard);
                
            }
            
        }
        
        
        
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
