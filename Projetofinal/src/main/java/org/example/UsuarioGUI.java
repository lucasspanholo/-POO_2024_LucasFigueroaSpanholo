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

        Scene scene = new Scene(vboxUsuarios, 400, 400); // Aumentado para acomodar novos campos
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

        Label telefoneLabel = new Label("Telefone:");
        GridPane.setConstraints(telefoneLabel, 0, 2);
        TextField telefoneInput = new TextField();
        telefoneInput.setPromptText("Digite o telefone");
        GridPane.setConstraints(telefoneInput, 1, 2);

        Label enderecoLabel = new Label("Endereço:");
        GridPane.setConstraints(enderecoLabel, 0, 3);
        TextField enderecoInput = new TextField();
        enderecoInput.setPromptText("Digite o endereço");
        GridPane.setConstraints(enderecoInput, 1, 3);

        Label dataNascimentoLabel = new Label("Data de Nascimento:");
        GridPane.setConstraints(dataNascimentoLabel, 0, 4);
        TextField dataNascimentoInput = new TextField();
        dataNascimentoInput.setPromptText("Digite a data de nascimento");
        GridPane.setConstraints(dataNascimentoInput, 1, 4);

        Button cadastrarButton = new Button("Cadastrar");
        GridPane.setConstraints(cadastrarButton, 1, 5);

        cadastrarButton.setOnAction(event -> {
            String nome = nomeInput.getText();
            String email = emailInput.getText();
            String telefone = telefoneInput.getText();
            String endereco = enderecoInput.getText();
            String dataNascimento = dataNascimentoInput.getText();

            if (!nome.isEmpty() && !email.isEmpty() && !telefone.isEmpty() && !endereco.isEmpty() && !dataNascimento.isEmpty()) {
                Usuario novoUsuario = new Usuario(nome, email, telefone, endereco, dataNascimento);
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

        grid.getChildren().addAll(nomeLabel, nomeInput, emailLabel, emailInput, telefoneLabel, telefoneInput, enderecoLabel, enderecoInput, dataNascimentoLabel, dataNascimentoInput, cadastrarButton);

        Scene scene = new Scene(grid, 300, 250); // Ajustado para acomodar novos campos
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
                Label telefoneLabel = new Label("Telefone: " + usuario.getTelefone());
                Label enderecoLabel = new Label("Endereço: " + usuario.getEndereco());
                Label dataNascimentoLabel = new Label("Data de Nascimento: " + usuario.getDataNascimento());

                userInfo.getChildren().addAll(idLabel, nomeLabel, emailLabel, telefoneLabel, enderecoLabel, dataNascimentoLabel);
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
