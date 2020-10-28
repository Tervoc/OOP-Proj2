/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_cards;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.ArrayList;

/**
 *
 * @author Troll
 */


public class FXMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        public enum cardColors{red, blue, green, yellow};


    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
        ArrayList<Card> hand = new ArrayList<Card>();
        Deck deck = new Deck(1, true, true);
        int numRed =0;
        int numBlue =0;
        int numGreen = 0;
        int numYellow = 0;
        
        int handSize = 7;
        while(deck.getDeck().size()>0){
            hand = deck.draw(handSize);
            for(int i=0; i<handSize; i++){
                switch(hand.get(i).getCardColor()){
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
        }
    }
    
}
