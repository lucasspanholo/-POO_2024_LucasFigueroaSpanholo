public class Conta {

    String nome;
    String numeroConta;
    Integer saldoAtual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Integer saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public void sacar(){
        //saque
//        saldoAtual = x - valorSaque;
    }
    public void getExtrato(numeroConta){
        return saldoAtual;
    }

    public void criarConta(nome){
        setNumeroConta();
    }
}
