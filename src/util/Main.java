import model.ContaCorrente;
import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o número da conta:");
    int numero = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite o nome do titular da conta:");
    String titular = scanner.nextLine();

    ContaCorrente conta = new ContaCorrente(numero, titular);

    int opcao = 0;

    while (opcao != 4) {

        System.out.println("-------- MENU --------");
        System.out.println("Escolha uma opção: ");
        System.out.println("1. Sacar um valor;");
        System.out.println("2. Depositar um valor;");
        System.out.println("3. Consultar o saldo;");
        System.out.println("4. Sair do programa.");
        System.out.println("----------------------");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do saque: ");
                float saque = scanner.nextFloat();
                conta.sacar(saque);
                break;
            case 2:
                System.out.println("Digite o valor do depósito:");
                float deposito = scanner.nextFloat();
                conta.depositar(deposito);
                break;
            case 3:
                System.out.println("Saldo atual: R$" + conta.consultarSaldo() + ".");
                break;
            case 4:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

    }

}
