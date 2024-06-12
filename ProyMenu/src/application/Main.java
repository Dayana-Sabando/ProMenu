package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crea el BorderPane
        BorderPane root = new BorderPane();

        // Crea la barra de menú
        MenuBar menuBar = new MenuBar();

        // Crea el menú "Archivo"
        Menu menuFile = new Menu("Archivo");
        MenuItem newFile = new MenuItem("Nuevo");
        MenuItem openFile = new MenuItem("Abrir");
        MenuItem saveFile = new MenuItem("Guardar");
        MenuItem exitFile = new MenuItem("Salir");

        // Define las acciones para los elementos del menú "Archivo"
        newFile.setOnAction(e -> System.out.println("Nuevo archivo creado"));
        openFile.setOnAction(e -> System.out.println("Archivo abierto"));
        saveFile.setOnAction(e -> System.out.println("Archivo guardado"));
        exitFile.setOnAction(e -> primaryStage.close());

        // Agrega los elementos al menú "Archivo"
        menuFile.getItems().addAll(newFile, openFile, saveFile, new SeparatorMenuItem(), exitFile);

        // Crea el menú "Editar"
        Menu menuEdit = new Menu("Editar");
        MenuItem cutEdit = new MenuItem("Cortar");
        MenuItem copyEdit = new MenuItem("Copiar");
        MenuItem pasteEdit = new MenuItem("Pegar");

        // Define acciones para los elementos del menú "Editar"
        cutEdit.setOnAction(e -> System.out.println("Cortar"));
        copyEdit.setOnAction(e -> System.out.println("Copiar"));
        pasteEdit.setOnAction(e -> System.out.println("Pegar"));

        // Agrega los elementos al menú "Editar"
        menuEdit.getItems().addAll(cutEdit, copyEdit, pasteEdit);

        // Crea el menú "Ayuda"
        Menu menuHelp = new Menu("Ayuda");
        MenuItem aboutHelp = new MenuItem("Acerca de");

        // Define acciones para los elementos del menú "Ayuda"
        aboutHelp.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Acerca de");
            alert.setHeaderText(null);
            alert.setContentText("¿EN QUÉ PUEDO AYUDARTE");
            alert.showAndWait();
        });

        // Añade los elementos al menú "Ayuda"
        menuHelp.getItems().add(aboutHelp);

        // Añade los menús a la barra de menú
        menuBar.getMenus().addAll(menuFile, menuEdit, menuHelp);

        // Añade la barra de menú al BorderPane
        root.setTop(menuBar);

        // Crea la escena y añadir el BorderPane
        Scene scene = new Scene(root, 500, 300);

        primaryStage.setTitle("Menú en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}