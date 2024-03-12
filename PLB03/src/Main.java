import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Escolha a operaçao \n 1.Criar conta \n 2.Extrato \n 3.Saque \n 4.Depósito \n 5.Sair");
            Integer opcao = scan.nextInt();

            if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            }
            if (opcao == 3 || opcao == 4) {
                System.out.println("Digite o valor desejado: ");
                Integer valor = scan.nextInt();
            }

            System.out.println("Digite a operação desejada: ");
            Double num1 = scan.nextDouble();
            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + criarConta(nome));
                    break;
                case 2:
                    System.out.println("Resultado: " + getExtrato(numeroConta));
                    break;
                case 3:
                    System.out.println("Resultado: " + sacar(valor));
                    break;
                case 4:
                    System.out.println("Resultado: " + depositar(valor));
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }
        }
}