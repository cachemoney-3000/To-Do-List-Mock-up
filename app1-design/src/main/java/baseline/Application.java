/*
* UCF COP3330 Fall 2021 Application Assignment 1 Solution
* Copyright 2021 Joshua Samontanez
 */
package baseline;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("to-do.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 500);
            stage.setResizable(false);

            stage.setTitle("To-Do");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}