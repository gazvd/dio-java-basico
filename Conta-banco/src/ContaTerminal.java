import java.util.Scanner;

public class ContaTerminal {
    // TODO: Requisitar que o usuário insira o número da agência, tipo String e
    // formate o número com o formato ###-#;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        String conta = scanner.nextLine();

        System.out.println("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + titular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + " e sua conta é " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");

    }

}
