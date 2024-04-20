import static java.lang.System.*;

public class Camisa extends Roupa{

    @Override
    public double calcularPrecoFinal(double acrescimo) {
        precoRoupa *= 0.9;
        precoRoupa += acrescimo;
        return precoRoupa;
    }

    public void defineCamisa(String tamanho, String cor) {
        tamanhoRoupa = tamanho;
        corRoupa = cor;
    }

    @Override
    public String getNome(){
        return null;
    }

    @Override
    public String getMarca() {
        return null;
    }

    @Override
    public Double getPreco() {
        return null;
    }

    @Override
    public void setPreco(double preco) {
        precoRoupa = preco;
    }


}
