package org.example;

public abstract class Cliente extends Usuario {

    public Cliente(String nome, String email, String telefone, String endereco, String dataNascimento) {
        super(nome, email, telefone, endereco, dataNascimento);
    }

    public Cliente(int id, String nome, String email, String telefone, String endereco, String dataNascimento) {
        super(id, nome, email, telefone, endereco, dataNascimento);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Cliente [ID: " + getId() + ", Nome: " + getNome() + ", Email: " + getEmail() + ", Telefone: " + getTelefone() + ", Endereço: " + getEndereco() + ", Data de Nascimento: " + getDataNascimento() + "]");
    }

    @Override
    public void atualizarInformacoes(String nome, String email, String telefone, String endereco, String dataNascimento) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setEndereco(endereco);
        setDataNascimento(dataNascimento);
    }

    public abstract void ativarConta();
    public abstract void desativarConta();
}
