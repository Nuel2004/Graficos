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
        // Establece el título de la ventana
        stage.setTitle("La fokin app numero uno ");
        
        // Obtiene la instancia del SceneManager
        SceneManager sm = SceneManager.getInstance();
        
        // Inicializa el SceneManager con el stage y una ruta de estilos
        sm.init(stage);
        
        // Configura las escenas con identificadores y tamaños
        sm.setScene(SceneID.MAIN, "/ej1", 600, 900);
        sm.setScene(SceneID.SECONDARY, "/ej1_2", 600, 200);
        
        // Carga la escena principal
        sm.loadScene(SceneID.MAIN);
    }

    public static void main(String[] args) {
        launch();
    }

}