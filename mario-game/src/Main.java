import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Jogador> jogadorList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(jogadorList.size() < 2) {
            System.out.println("Nome Jogador: ");
            String nomeJogador = scanner.next();
            System.out.println("ID: ");
            Integer id = scanner.nextInt();
            System.out.println("Nivel: ");
            Integer nivelJogador = scanner.nextInt();
            System.out.println("Pontuacao: ");
            Integer pontuacaoJogador = scanner.nextInt();
            System.out.println("Moedas: ");
            Integer moedasJogador = scanner.nextInt();
            Jogador novoJogador = criarJogador(id, nomeJogador, nivelJogador, pontuacaoJogador, moedasJogador);
            jogadorList.add(novoJogador);
            System.out.println("Jogador adicionado ");
        }
        System.out.println("Digite o ID do jogador para alterar: ");
        Integer currentPlayerId = scanner.nextInt();


        for (Jogador jogador : jogadorList){
            if (jogador.getId() == currentPlayerId){
                System.out.println("Digite a nova pontuacao: ");
                Integer novaPontuacao = scanner.nextInt();
                jogador.setPontuacao(novaPontuacao);
                System.out.println("Nova pontuacao: " + novaPontuacao);
            }
        }

        Integer pontMax = 0;
        for (Jogador player : jogadorList){
            if(pontMax < player.getPontuacao()){
                pontMax = player.getPontuacao();
            }
        }
        System.out.println("Maior pontuacao: " + pontMax);

        Integer sum = 0;
        System.out.println("Insira o nivel para ver a soma de moedas: ");
        Integer nivel = scanner.nextInt();
        for (Jogador player1 : jogadorList){
            if (player1.getNivel() == nivel){
                sum += player1.getMoedas();
            }
        }
        System.out.println("Soma moedas:" + sum);
    }

    private static Jogador criarJogador(Integer id, String nome, Integer nivel, Integer pontuacao, Integer moedas){
        Jogador jogador = new Jogador(id);
        return jogador;
    }
}