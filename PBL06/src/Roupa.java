import java.lang.*;
public abstract class Roupa implements Produto{
    private char tamanhoRoupa;
    private String corRoupa;

    private String nomeRoupa;
    private String marcaRoupa;
    private Double precoRoupa;


    public abstract double calcularPrecoFinal(double acrescimo);
}
