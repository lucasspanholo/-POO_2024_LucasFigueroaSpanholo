package org.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.List;

public class UsuarioGUI extends Application {

    private UsuarioDAO usuarioDAO = new UsuarioDAO();
    private Stage primaryStage;
    private VBox vboxUsuarios;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Lista de Usuários");

        vboxUsuarios = new VBox(10);
        vboxUsuarios.setPadding(new Insets(20));

        atualizarListaUsuarios();

        Button btnNovoUsuario = new Button("+ Usuário");
        btnNovoUsuario.setOnAction(event -> criarNovoUsuario());

        vboxUsuarios.getChildren().add(btnNovoUsuario);

        Scene scene = new Scene(vboxUsuarios, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void criarNovoUsuario() {
        Stage novoUsuarioStage = new Stage();
        novoUsuarioStage.setTitle("Novo Usuário");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        Label nomeLabel = new Label("Nome:");
        GridPane.setConstraints(nomeLabel, 0, 0);
        TextField nomeInput = new TextField();
        nomeInput.setPromptText("Digite o nome");
        GridPane.setConstraints(nomeInput, 1, 0);

        Label emailLabel = new Label("E-mail:");
        GridPane.setConstraints(emailLabel, 0, 1);
        TextField emailInput = new TextField();
        emailInput.setPromptText("Digite o e-mail");
        GridPane.setConstraints(emailInput, 1, 1);

        Button cadastrarButton = new Button("Cadastrar");
        GridPane.setConstraints(cadastrarButton, 1, 2);

        cadastrarButton.setOnAction(event -> {
            String nome = nomeInput.getText();
            String email = emailInput.getText();

            if (!nome.isEmpty() && !email.isEmpty()) {
                Usuario novoUsuario = new Usuario(nome, email);
                usuarioDAO.inserir(novoUsuario);
                novoUsuarioStage.close();
                atualizarListaUsuarios();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erro");
                alert.setHeaderText(null);
                alert.setContentText("Por favor, preencha todos os campos.");
                alert.showAndWait();
            }
        });

        grid.getChildren().addAll(nomeLabel, nomeInput, emailLabel, emailInput, cadastrarButton);

        Scene scene = new Scene(grid, 300, 150);
        novoUsuarioStage.setScene(scene);
        novoUsuarioStage.show();
    }

    private void atualizarListaUsuarios() {
        List<Usuario> usuarios = usuarioDAO.listar();

        vboxUsuarios.getChildren().clear();

        if (usuarios.isEmpty()) {
            vboxUsuarios.getChildren().add(new Label("Nenhum usuário cadastrado."));
        } else {
            for (Usuario usuario : usuarios) {
                VBox userInfo = new VBox();
                userInfo.setStyle("-fx-border-color: #000000; -fx-border-width: 1px; -fx-padding: 5px;");

                Label idLabel = new Label("ID: " + usuario.getId());
                Label nomeLabel = new Label("Nome: " + usuario.getNome());
                Label emailLabel = new Label("E-mail: " + usuario.getEmail());

                userInfo.getChildren().addAll(idLabel, nomeLabel, emailLabel);
                vboxUsuarios.getChildren().add(userInfo);
            }
        }

        Button btnNovoUsuario = new Button("+ Usuário");
        btnNovoUsuario.setOnAction(event -> criarNovoUsuario());

        vboxUsuarios.getChildren().add(btnNovoUsuario);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
