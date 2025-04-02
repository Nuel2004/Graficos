package com.ejercicio1.controladores;

import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ej1controllers2 {
    @FXML
    private Button boton2;

    @FXML
    private Label label2;
    
    @FXML
    public void initialize() {
        label2.setText("Hola Mundo2");
        boton2.setText("Pulsame si no eres el fiti");

        boton2.setOnAction(event -> {
            System.out.println("Hola Mundo2");
        });


    }
}
