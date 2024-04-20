public class Calca extends Roupa{

    public void defineCalca(String tamanho, String cor) {
        tamanhoRoupa = tamanho;
        corRoupa = cor;
    }
    public Calca(){

    }

    @Override
    public double calcularPrecoFinal(double acrescimo) {
        precoRoupa *= 0.85;
        precoRoupa += acrescimo;
        return precoRoupa;
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


    public Calca(String _tipoCalca) {
        _tipoCalca = _tipoCalca;
    }
}
