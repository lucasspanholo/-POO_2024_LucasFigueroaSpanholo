package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroUsuarioUI extends JFrame {
    private JTextField tfNome;
    private JTextField tfEmail;
    private JTextField tfTelefone;
    private JTextField tfEndereco;
    private JTextField tfDataNascimento;
    private JButton btnCadastrar;

    private UsuarioDAO usuarioDAO;

    public CadastroUsuarioUI() {
        usuarioDAO = new UsuarioDAO();

        setTitle("Cadastro de Usuário");
        setSize(300, 300); // Ajuste o tamanho da janela para acomodar novos campos
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10)); // Atualizado para 6 linhas

        panel.add(new JLabel("Nome:"));
        tfNome = new JTextField();
        panel.add(tfNome);

        panel.add(new JLabel("Email:"));
        tfEmail = new JTextField();
        panel.add(tfEmail);

        panel.add(new JLabel("Telefone:"));
        tfTelefone = new JTextField();
        panel.add(tfTelefone);

        panel.add(new JLabel("Endereço:"));
        tfEndereco = new JTextField();
        panel.add(tfEndereco);

        panel.add(new JLabel("Data de Nascimento:"));
        tfDataNascimento = new JTextField();
        panel.add(tfDataNascimento);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
            }
        });
        panel.add(btnCadastrar);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void cadastrarUsuario() {
        String nome = tfNome.getText().trim();
        String email = tfEmail.getText().trim();
        String telefone = tfTelefone.getText().trim();
        String endereco = tfEndereco.getText().trim();
        String dataNascimento = tfDataNascimento.getText().trim();

        if (nome.isEmpty() || email.isEmpty() || telefone.isEmpty() || endereco.isEmpty() || dataNascimento.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario novoUsuario = new Usuario(nome, email, telefone, endereco, dataNascimento);
        usuarioDAO.inserir(novoUsuario);

        JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        tfNome.setText("");
        tfEmail.setText("");
        tfTelefone.setText("");
        tfEndereco.setText("");
        tfDataNascimento.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarioUI();
            }
        });
    }
}
