package com.ejercicio1.controladores;

import javafx.scene.control.Label;

import com.ejercicio1.SceneID;
import com.ejercicio1.SceneManager;

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
        boton.setText("Pulsame si quieres ir a la segunda ventana");

        boton.setOnAction(event -> {
            SceneManager.getInstance().loadScene(SceneID.SECONDARY);
        });


    }
}
