import java.lang.*;
public abstract class Roupa implements Produto{
    public String tamanhoRoupa;
    public String corRoupa;

    public Double precoRoupa;


    public abstract double calcularPrecoFinal(double acrescimo);
}
