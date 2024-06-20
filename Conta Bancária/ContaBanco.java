import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ler me do cliente
        System.out.println("Conta Bancária");
        System.out.println("Digite seu nome: ");
        String nomeDoCliente = scan.nextLine();
        System.out.println("------------------------------------");

        // Ler Número da Agência
        System.out.println("Digite o número da agência: ");
        String numeroDaAgencia = scan.nextLine();
        System.out.println("------------------------------------");

        // Ler Número da Conta
        System.out.println("Digite o número da conta: ");
        int numeroDaConta = scan.nextInt();
        System.out.println("------------------------------------");

        // Ler Saldo Atual
        System.out.println("Digite seu saldo atual: ");
        double saldo = scan.nextDouble();
        System.out.println("------------------------------------");

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "
                + numeroDaAgencia + ", conta: " + numeroDaConta + "e seu saldo R$ " + saldo + " já está disponível para saque!");

        scan.close();

    }

}