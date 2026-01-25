import java.util.Scanner;
import java.util.ArrayList; // Importante para usar listas!

public class SimuladorDeBanco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);// Scanner para ler a entrada do usuário
        double saldo = 1000.00;
        int opcao = 0;

        // 1. Criando uma lista para armazenar o histórico de transações
        ArrayList<String> historico = new ArrayList<>();

        while (opcao != 5) { // 5 é a opção de sair
            System.out.println("\n--- MENU ---");// Menu do banco
            System.out.println("1 - Saldo | 2 - Sacar | 3 - Depositar | 4 - Extrato | 5 - Sair");
            opcao = leitor.nextInt();

            if (opcao == 1) {// Ver saldo
                System.out.println("Saldo atual: R$ " + saldo);
            }
            else if (opcao == 2) {// Sacar dinheiro
                System.out.print("Valor do saque: ");
                double valorSaque = leitor.nextDouble();
                if (valorSaque > saldo) {
                    System.out.println("Erro: Saldo insuficiente!");//
                } else {
                    saldo -= valorSaque;//

                    historico.add("Saque: - R$ " + valorSaque);
                    System.out.println("Saque realizado!");
                }
            }
            else if (opcao == 3) {// Depositar dinheiro
                System.out.print("Valor do depósito: ");
                double valorDeposito = leitor.nextDouble();
                saldo += valorDeposito;
                // Adicionando ao histórico de transações
                historico.add("Depósito: + R$ " + valorDeposito);
                System.out.println("Depósito realizado!");
            }
            else if (opcao == 4) {
                // Mostrar extrato bancário
                System.out.println("\n=== EXTRATO BANCÁRIO ===");
                if (historico.isEmpty()) {
                    System.out.println("Nenhuma transação realizada.");
                } else {
                    for (String transacao : historico) {
                        System.out.println(transacao);
                    }
                }
                System.out.println("========================");
            }
        }
        leitor.close();// Fechando o scanner
        System.out.println("Obrigado por usar o nosso banco!");
    }
}