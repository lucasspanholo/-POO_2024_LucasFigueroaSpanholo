import java.lang.*;
public class Vestido extends Roupa {

    @Override
    public double calcularPrecoFinal(double acrescimo) {
        precoRoupa *= 0.80;
        precoRoupa += acrescimo;
        return precoRoupa;
    }
    public void defineVestido(String tamanho, String cor) {
        tamanhoRoupa = tamanho;
        corRoupa = cor;
    }

    @Override
    public String getNome(){
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

    @Override
    public String getMarca() {
        return null;
    }
}

