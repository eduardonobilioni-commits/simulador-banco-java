import java.util.Scanner;

public class SimuladorDeBanco {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Conta conta = new Conta("Eduardo");

        int opcao = 0;
        while (opcao != 5) {
            conta.mostrarMenu();
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                conta.mostrarSaldo();
            } else if (opcao == 2) {
                System.out.print("Digite o valor para saque: R$ ");
                double valorSaque = leitor.nextDouble();
                conta.sacar(valorSaque);
            } else if (opcao == 3) {
                System.out.print("Digite o valor para depósito: R$ ");
                double valorDeposito = leitor.nextDouble();
                conta.depositar(valorDeposito);
            } else if (opcao == 4) {
                conta.mostrarExtrato();
            } else if (opcao == 5) {
                System.out.println("Saindo... Obrigado por usar nosso banco!");
            } else {
                System.out.println("***OPÇÃO INVÁLIDA***");
            }
        }

        leitor.close();
    }
}
