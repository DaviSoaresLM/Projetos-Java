import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("* Calculadora *");

        // Solicitando primeira entrada do user:
        System.out.print("Digite o primeiro número: ");
        int n1 = scan.nextInt();

        // Solicitando segunda entrada do user:
        System.out.print("Digite o segundo número: ");
        int n2 = scan.nextInt();

        // Apresentando operações:
        System.out.println("Escolha uma operação ( + , - , * , / )");
        String operacao = scan.next();

        double resultado = 0; // Definindo resultado como 0 para evitar erro de compilação

        switch (operacao) { // Definindo os valores de cada operação dentro do switch case
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;

            default:
                System.out.println("Operação indisponivel. Tente novamente com um dos seguintes operadores: ");
                System.out.println(" + , - , * , / ");
                break;
        }
        // Saída do resultado

        System.out.println("O resultado da operação é: " + resultado);

        scan.close();

    }

}
