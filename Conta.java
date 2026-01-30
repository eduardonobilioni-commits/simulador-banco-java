import java.util.ArrayList;

public class Conta {

    String titular;
    double saldo;
    ArrayList<String> historico;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.historico = new ArrayList<>();
    }

    void mostrarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("***VALOR INVÁLIDO PARA DEPÓSITO***");
            return;
        }
        saldo += valor;
        historico.add("Depósito: + R$ " + valor);
        System.out.println("Depósito realizado com sucesso");
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("***SALDO INSUFICIENTE***");
        } else {
            saldo -= valor;
            historico.add("Saque: - R$ " + valor);
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        }
    }

    void mostrarExtrato() {
        System.out.println("=== EXTRATO ===");
        System.out.println("Titular: " + titular);

        if (historico.isEmpty()) {
            System.out.println("NENHUMA MOVIMENTAÇÃO");
        } else {
            for (String item : historico) {
                System.out.println(item);
            }
        }
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        System.out.println("===============");
    }

    void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Extrato");
        System.out.println("5 - Sair");
    }
}
