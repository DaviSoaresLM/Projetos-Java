import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorSenhas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Definindo o tamanho da senha:
        System.out.println("Digite o tamanho desejado para a senha: ");
        int tamanhoSenha = scan.nextInt();

        // Gerar a senha:
        String senhaGerada = gerarSenha(tamanhoSenha); // Passa o tamanho da senha como argumento para o método
                                                       // 'gerarSenha' retornar uma senha aleatória

        // Exibir a senha gerada:
        System.out.println("Senha gerada: " + senhaGerada);

        scan.close(); // Fechar o Scanner após o uso
    }

    // Método para gerar a senha:
    public static String gerarSenha(int tamanho) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&";

        SecureRandom random = new SecureRandom(); // Utilizado para gerar números aleatórios seguros

        StringBuilder senha = new StringBuilder(); // Utilizado para construir a senha caractere por caractere de forma
                                                   // eficiente

        // Gerando caracteres aleatórios:
        for (int i = 0; i < tamanho; i++) {
            int randomIndex = random.nextInt(caracteres.length()); // Gera um índice aleatório dentro do comprimento da
                                                                   // string 'caracteres'
            senha.append(caracteres.charAt(randomIndex)); // Adiciona o caractere aleatório à 'StringBuilder senha'
        }

        return senha.toString(); // Retorna a senha gerada como uma string
    }
}
