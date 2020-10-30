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
import javafx.scene.image.Image;


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
        stage.setTitle("Uno Workout");
        stage.getIcons().add(new Image(FXMain.class.getResourceAsStream("uno.png")));
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
    }

}
//bet
