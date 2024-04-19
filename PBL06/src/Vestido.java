import java.lang.*;
public class Vestido extends Roupa {

    private String _tipoDecote;
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

    public String getTipoDecote() {
        return _tipoDecote;
    }

    public void setTipoDecote(String tipoDecote) {
        _tipoDecote = tipoDecote;
    }

    public Vestido(String _tipoDecote) {
        _tipoDecote = _tipoDecote;
    }
}
