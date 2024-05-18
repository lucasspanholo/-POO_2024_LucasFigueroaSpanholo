package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroUsuarioUI extends JFrame {
    private JTextField tfNome;
    private JTextField tfEmail;
    private JButton btnCadastrar;

    private UsuarioDAO usuarioDAO;

    public CadastroUsuarioUI() {
        usuarioDAO = new UsuarioDAO();

        setTitle("Cadastro de Usuário");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        panel.add(new JLabel("Nome:"));
        tfNome = new JTextField();
        panel.add(tfNome);

        panel.add(new JLabel("Email:"));
        tfEmail = new JTextField();
        panel.add(tfEmail);

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

        if (nome.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario novoUsuario = new Usuario(0, nome, email);
        usuarioDAO.inserir(novoUsuario);

        JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        tfNome.setText("");
        tfEmail.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarioUI();
            }
        });
    }
}
