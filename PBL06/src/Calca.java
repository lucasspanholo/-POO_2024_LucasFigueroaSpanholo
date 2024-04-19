public class Calca extends Roupa{

    private String _tipoCalca;
    @Override
    public double calcularPrecoFinal(double acrescimo) {
        return getPreco() + acrescimo;
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

    }

    @Override
    public String getMarca() {
        return null;
    }

    public String getTipoCalca() {
        return _tipoCalca;
    }

    public void setTipoCalca(String tipoCalca) {
        _tipoCalca = tipoCalca;
    }

    public Calca(String _tipoCalca) {
        _tipoCalca = _tipoCalca;
    }
}
