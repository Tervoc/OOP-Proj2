/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_cards;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * This class connects to the FXMLDocument adding event handlers and stuff
 * 
 * @author Troll
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea handText;

    @FXML
    private TextArea statsText;

    @FXML
    private ResourceBundle resources;

    @FXML
    private CheckBox areWildCardsEnabled;
    @FXML
    private CheckBox areDecksShuffledTogetherEnabled;

    @FXML
    private ChoiceBox numDecks;

    Deck deck;
    Hand hand;
    boolean areSettingsSet = false;

    /**
     *
     */
    public FXMLDocumentController() {

    }

    @FXML
    private void handleEnterSettings(ActionEvent event) {
        if(!areSettingsSet){
            boolean areDecksShuffledTogether = areDecksShuffledTogetherEnabled.isSelected();
            boolean areWildCards = areWildCardsEnabled.isSelected();
            int numberOfDecks = 0;
            System.out.println(numDecks.getValue());
            if (numDecks.getValue().equals("1 Deck")) {
                numberOfDecks = 1;
            } else if (numDecks.getValue().equals("2 Decks")) {
                numberOfDecks = 2;
            } else if (numDecks.getValue().equals("3 Decks")) {
                numberOfDecks = 3;
            }
            System.out.println("NumDecks: " + numberOfDecks);
            deck = new Deck(numberOfDecks, areDecksShuffledTogether, areWildCards);

            hand = new Hand(deck, 0);
            statsText.setText("");
           handText.setText("");
            areSettingsSet = true;
        }
        
    }

    @FXML
    private void handleDrawNewHand(ActionEvent event) {
        if (areSettingsSet) {
            hand.newHand(deck, 7);
            hand.sortHand();
            int handSize = hand.getHand().size();
            String handString = "";
            String statsString = "";
            for (int i = 0; i < handSize; i++) {
                if (hand.getHand().get(i).getCardType() != Card.CardTypes.normal) {
                    handString += hand.getHand().get(i).getCardColorAsText() + ": " + hand.getHand().get(i).getCardTypeAsText() + " \n";
                } else {
                    handString += hand.getHand().get(i).getCardColorAsText() + ": \t " + hand.getHand().get(i).getCardValue() + " \n";
                }
            }
            handText.setText(handString);

            statsString = "---------------------------- \n"
                    + "|       Running Total      |\n"
                    + "----------------------------\n"
                    + "Red:\t\t " + hand.getNumRedTotal() + "\n"
                    + "Yellow:\t " + hand.getNumYellowTotal() + "\n"
                    + "Blue:\t\t " + hand.getNumBlueTotal() + "\n"
                    + "Green:\t " + hand.getNumGreenTotal() + "\n"
                    + "Cards Left:\t" + deck.getDeck().size() + "\n"
                    + "----------------------------\n"
                    + "|         This Hand        |\n"
                    + "----------------------------\n"
                    + "Red:\t\t " + hand.getNumRed() + "\n"
                    + "Yellow:\t " + hand.getNumYellow() + "\n"
                    + "Blue:\t\t " + hand.getNumBlue() + "\n"
                    + "Green:\t " + hand.getNumGreen() + "\n";
            statsText.setText(statsString);

        }
        if(deck.getDeck().size() == 0){
             handText.setText("");
            areSettingsSet = false;
           
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
