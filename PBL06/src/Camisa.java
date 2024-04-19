import static java.lang.System.*;

public class Camisa extends Roupa{


    private boolean mangaCamisa;
    @Override
    public void calcularPrecoFinal(double acrescimo) {
        System.out.println();
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

    public boolean isMangaCamisa() {
        return mangaCamisa;
    }

    public void setMangaCamisa(boolean mangaCamisa) {
        this.mangaCamisa = mangaCamisa;
    }
}
