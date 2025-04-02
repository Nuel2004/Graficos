package com.ejercicio1.controladores;

import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ej1controllers {
    @FXML
    private Button boton;

    @FXML
    private TextField texto;

    @FXML
    private Label label;
    
    @FXML
    public void initialize() {
        texto.setPromptText("Hola tio");
        label.setText("Hola Mundo");
        boton.setText("Pulsame si no eres gay");

        boton.setOnAction(event -> {
            String textoIntroducido = texto.getText();
            if (textoIntroducido.isEmpty()) {
                label.setText("No has escrito nada");
            } else {
                label.setText("Has escrito: " + textoIntroducido);
            }
        });


    }
}
