import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        System.out.println("Seja bem-vindo a loja de roupas");
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - CAMISA");
        System.out.println("2 - CALÇA");
        System.out.println("3 - VESTIDO");
        System.out.println("Outro número - Finalizar\n");

        Scanner scan = new Scanner(System.in);
        Integer opcao = scan.nextInt();

        if(opcao == 1){
            Camisa camisa = new Camisa();
            camisa.setPreco(40.00);
            System.out.println("Digite o tamanho: ");
            String tamanho = scan.next();
            System.out.println("Digite a cor: ");
            String cor = scan.next();
            camisa.defineCamisa(tamanho, cor);
            System.out.println("Cor: " + cor + "\nTamanho: " + tamanho);
            double valorFinal = camisa.calcularPrecoFinal(5.00);
            System.out.println("Camiseta comprado no valor " + valorFinal);
        }
        if (opcao == 2){
            Calca calca = new Calca();
            calca.setPreco(55.00);
            System.out.println("Digite o tamanho: ");
            String tamanho = scan.next();
            System.out.println("Digite a cor: ");
            String cor = scan.next();
            calca.defineCalca(tamanho,cor);
            double valorFinal = calca.calcularPrecoFinal(5.00);
            System.out.println("Calça comprada no valor: " + valorFinal);
        }
        if (opcao == 3){
            Vestido vestido = new Vestido();
            vestido.setPreco(90.00);
            System.out.println("Digite o tamanho: ");
            String tamanho = scan.next();
            System.out.println("Digite a cor: ");
            String cor = scan.next();
            vestido.defineVestido(tamanho, cor);
            double valorFinal = vestido.calcularPrecoFinal(5.00);
            System.out.println("Vestido comprado no valor de: " + valorFinal);
        }


    }
}