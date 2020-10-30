/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_cards;

import java.io.IOException;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.util.ArrayList;
/**
 *
 * @author Troll
 */
public class FXMain extends Application {

    @Override
    public void start(Stage stage) throws IOException {
       
         Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
       // TextArea Output = new TextArea();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public enum cardColors {
        red, blue, green, yellow
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        Deck deck = new Deck(3, true, true);
        Hand hand = new Hand(deck, 7);
        /*int numRed = 0;
        int numBlue = 0;
        int numGreen = 0;
        int numYellow = 0;

        int handSize = 7;
        while (deck.getDeck().size() > 0) {
            hand = deck.draw(handSize);
            for (int i = 0; i < handSize; i++) {
                switch (hand.get(i).getCardColor()) {
                    case 0:
                        numRed++;
                        break;
                    case 1:
                        numBlue++;
                        break;
                    case 2:
                        numGreen++;
                        break;
                    case 3:
                        numYellow++;
                        break;

                }
            }
        }*/
    }

}
//bet