package com.ejercicio1.controladores;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import com.ejercicio1.App;
import com.ejercicio1.SceneID;
import com.ejercicio1.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ej1controllers2 {
    @FXML
    private Button boton;
    @FXML
    private Label etiqueta;
    @FXML
    private VBox contenedor;
    
    @FXML
    public void initialize() {
        etiqueta.setText(crono());
        boton.setText("Pulsame si no eres el fiti (y quieres ver la vista 1)");
        
        boton.setOnAction(event -> {
            SceneManager.getInstance().loadScene(SceneID.MAIN);
        });
    }
    public String crono(){
        String res = "";
        for(int h=0; h<4; h++){        
            for(int m=0; m<0; m++){
                for(int s=0; s<30; s++){
                    res = h+":"+m+":"+s;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return res;
    }
}
