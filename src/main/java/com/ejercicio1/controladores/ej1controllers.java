package com.ejercicio1.controladores;

import javafx.scene.control.Label;

import com.ejercicio1.App;
import com.ejercicio1.SceneID;
import com.ejercicio1.SceneManager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ej1controllers {
    @FXML
    private Button boton;

    @FXML
    private TextField texto;
    @FXML
    private VBox contprincipal;

    @FXML
    private Label label;
    @FXML
    private ImageView imagen;
    @FXML
    private StackPane contenedor;
    
    @FXML
    public void initialize() {
        texto.setPromptText("Hola tio");
        label.setText("Hola Mundo");
        boton.setText("Pulsame si quieres ir a la segunda ventana");
        imagen.setImage(new Image(App.class.getResource("images/gettyimages-962792890-594x594.jpg").toExternalForm()));
        boton.setOnAction(event -> {
            SceneManager.getInstance().loadScene(SceneID.SECONDARY);
        });

        contprincipal.heightProperty().addListener((observable, oldValue, newValue) -> ajustarImagen());
        contprincipal.widthProperty().addListener((observable, oldValue, newValue) -> ajustarImagen());
    }

    /**
     * Ajusta el tamaño de la imagen dentro de imageView según el tamaño de la ventana.
     * La imagen se redimensiona cuando cambia la altura de la ventana.
     * También actualiza el texto en el label 'console' con las dimensiones actuales de la ventana.
     */
    private void ajustarImagen() {
        // Obtiene la altura del VBox (contenedor principal)
        double height = contprincipal.getHeight();

        // Muestra el tamaño de la ventana en el console (etiqueta)
        label.setText("Tamaño de ventana: " + contprincipal.getWidth() + "-" + contprincipal.getHeight());

        // Si la altura es mayor que 0, ajusta la altura de la imagen
        if (height > 0) {
            imagen.setFitHeight(height - 40); // Ajusta la altura de la imagen
        }
    }
    
}
