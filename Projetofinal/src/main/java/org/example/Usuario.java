package org.example;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String dataNascimento;

    public Usuario(String nome, String email, String telefone, String endereco, String dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public Usuario(int id, String nome, String email, String telefone, String endereco, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void exibirDetalhes() {
        System.out.println("Usuario [ID: " + id + ", Nome: " + nome + ", Email: " + email + ", Telefone: " + telefone + ", Endereço: " + endereco + ", Data de Nascimento: " + dataNascimento + "]");
    }

    public void atualizarInformacoes(String nome, String email, String telefone, String endereco, String dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
}
