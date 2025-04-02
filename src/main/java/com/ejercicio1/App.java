package com.ejercicio1;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @SuppressWarnings("exports")
    @Override
    public void start(Stage stage) throws IOException {

        stage.setTitle("La aplicacion fokin numero 1");
        
        SceneManager sm = SceneManager.getInstance();
        
        sm.setScene(SceneID.MAIN, "ej1", 600, 900);
        sm.setScene(SceneID.SECONDARY, "ej1_2", 600, 200);
        
        sm.loadScene(SceneID.MAIN);
    }

    public static void main(String[] args) {
        launch();
    }

}