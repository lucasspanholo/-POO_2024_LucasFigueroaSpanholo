package org.example;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        UsuarioGUI usuarioGUI = new UsuarioGUI();
        usuarioGUI.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
