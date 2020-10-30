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
 *
 * @author Troll
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Label label;
    
    @FXML
    private TextArea Output;
    
    @FXML
    private TextArea Input;
    
    @FXML 
    private ResourceBundle resources;
    
    @FXML
    private ToggleGroup numDecks;
    
    Deck deck = new Deck(3, true, true);
    Hand hand = new Hand(deck, 7);
    
    public FXMLDocumentController(){
        
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        hand.newHand(deck,7);
        hand.sortHand();
        int handSize = hand.getHand().size();
        deck.getDeck();
        String handString = "";
        for(int i=0; i< handSize; i++){
            handString += hand.getHand().get(i).getCardColor() + ", " + hand.getHand().get(i).getCardValue() + " \n";
        }
        Output.setText(handString);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
