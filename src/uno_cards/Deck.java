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
public class Deck {
//bet

    private ArrayList<Card> deckCard = new ArrayList<Card>();

    public Deck(int numDecks, boolean isShuffledTogether, boolean isActionCards) {
        if (isShuffledTogether) {
            for (int i = 0; i < numDecks; i++) {
                for (int c = 0; c < 4; c++) {

                    Card zeroCard = new Card(c, 0, Card.CardTypes.break_);
                    deckCard.add(zeroCard);

                    for (int v = 1; v < 10; v++) {
                        Card newCard = new Card(c, v, Card.CardTypes.normal);
                        deckCard.add(newCard);
                        deckCard.add(newCard);
                    }
                    if (isActionCards) {
                        deckCard.add(new Card(c, 10, Card.CardTypes.skip));
                        deckCard.add(new Card(c, 11, Card.CardTypes.draw2));
                        deckCard.add(new Card(c, 12, Card.CardTypes.reverse));

                        deckCard.add(new Card(4, 13, Card.CardTypes.wild));
                        deckCard.add(new Card(4, 14, Card.CardTypes.wild4));
                    }
                }
            }
            this.shuffle();
            this.shuffle();
            this.shuffle();
        } else {
            ArrayList<Card> tempDeck = new ArrayList<Card>();
            for (int i = 0; i < numDecks; i++) {
                for (int c = 0; c < 4; c++) {
                    Card zeroCard = new Card(c, 0, Card.CardTypes.break_);
                    deckCard.add(zeroCard);

                    for (int v = 1; v < 10; v++) {
                        Card newCard = new Card(c, v, Card.CardTypes.normal);

                        deckCard.add(newCard);
                        deckCard.add(newCard);

                    }
                    if (isActionCards) {
                        deckCard.add(new Card(c, 10, Card.CardTypes.skip));
                        deckCard.add(new Card(c, 11, Card.CardTypes.draw2));
                        deckCard.add(new Card(c, 12, Card.CardTypes.reverse));

                        deckCard.add(new Card(4, 13, Card.CardTypes.wild));
                        deckCard.add(new Card(4, 14, Card.CardTypes.wild4));
                    }
                }
                this.shuffle();
                this.shuffle();
                this.shuffle();
                tempDeck.addAll(deckCard);
                deckCard.clear();
            }
            deckCard.addAll(tempDeck);
        }

        for (int i = 0; i < deckCard.size(); i++) {
            System.out.println("Color: " + deckCard.get(i).getCardColor() + "; Value: " + deckCard.get(i).getCardValue());
        }

        System.out.println(deckCard.size());

    }

    public void shuffle() {
        //switches every card with a random card
        for (int i = 0; i < deckCard.size(); i++) {
            int swapLocation = (int) (Math.random() * deckCard.size());
            Card tempCard1 = deckCard.get(swapLocation);
            Card tempCard2 = deckCard.get(i);
            deckCard.set(i, tempCard1);
            deckCard.set(swapLocation, tempCard2);

        }
    }

    public ArrayList<Card> draw(int numCards) {
        ArrayList<Card> hand = new ArrayList<Card>();
        if (deckCard.size() < numCards) {
            for (int i = 0; i < deckCard.size(); i++) {
                hand.add(deckCard.get(0));
                deckCard.remove(0);
            }
        } else {
            for (int i = 0; i < numCards; i++) {
                hand.add(deckCard.get(0));
                deckCard.remove(0);
            }
        }
        return hand;
    }
    public void returnCardToBottom(Card card){
        deckCard.add(card);
    }

    public ArrayList<Card> getDeck() {
        System.out.println(deckCard.size());
        return deckCard;
    }
}
