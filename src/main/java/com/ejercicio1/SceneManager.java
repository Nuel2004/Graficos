package com.ejercicio1;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class SceneManager{
    private static SceneManager instance;

    private Stage stage; // La ventana principal de la aplicación
    private HashMap<SceneID, Scene> scenes; // Mapa para almacenar las escenas según su identificador

    /**
     * Constructor privado de <code>SceneManager</code>. 
     * Inicializa el mapa de escenas vacío.
     */
    private SceneManager() {
        scenes = new HashMap<>();
    }

    /**
     * Método estático para obtener la instancia única de <code>SceneManager</code> (patrón Singleton).
     * 
     * @return La instancia única de <code>SceneManager</code>.
     */
    public static SceneManager getInstance(){
        if (instance == null) {
            instance = new SceneManager();
        }
        return instance;
    }

    /**
     * Inicializa el <code>SceneManager</code> con el <code>Stage</code> principal y la ruta de la hoja de estilo.
     * 
     * @param stage la ventana principal de la aplicación donde se mostrarán las escenas.
     */
    @SuppressWarnings("exports")
    public void init(Stage stage){
        this.stage = stage;
    }

    /**
     * Establece una escena, cargando un archivo FXML y configurando su tamaño.
     * La escena también se asocia con la hoja de estilo definida previamente.
     * 
     * @param sceneID el identificador único de la escena.
     * @param fxml el nombre del archivo FXML que define la vista de la escena.
     * @param width el ancho de la escena.
     * @param height el alto de la escena.
     */
    public void setScene(SceneID sceneID, String fxml, int width, int height){
        try {
            // Carga el archivo FXML
            URL fxmlURL = App.class.getResource("views"+fxml + ".fxml");
            FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root, width, height); // Crea la escena con el tamaño especificado
            scenes.put(sceneID, scene); // Almacena la escena en el mapa con el identificador correspondiente
        } catch (IOException e) {
            e.printStackTrace(); // En caso de error al cargar el FXML
        }
    }

    /**
     * Elimina una escena previamente almacenada usando su identificador.
     * 
     * @param sceneID el identificador único de la escena que se desea eliminar.
     */
    public void removeScene(SceneID sceneID){
        scenes.remove(sceneID); // Elimina la escena del mapa
    }

    
    public void loadScene(SceneID sceneID) {
        if (scenes.containsKey(sceneID)){
            stage.setScene(scenes.get(sceneID)); // Establece la escena en la ventana principal
            stage.show(); // Muestra la ventana con la nueva escena
        }
    }
}
