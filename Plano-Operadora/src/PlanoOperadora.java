import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Plano Telefônico");
        System.out.println("Digite 'B' para o plano Básico, 'M' para o plano Midia ou 'T' para o plano Turbo: ");
        String plano = scan.nextLine();
        plano = plano.toUpperCase();

        switch (plano) {
            case "B": // Para plano Básico
                System.out.println("Seu plano atual é 'Básico' e inclui:");
                System.out.println("-> 100 minutos de ligação.");
                break;

            case "M": // Para plano Mídia
                System.out.println("Seu plano atual é 'Mídia' inclui: ");
                System.out.println("-> 100 minutos de ligação.");
                System.out.println("-> Whatsapp + Instagram gratuitos.");
                break;

            case "T": // Para plano Turbo
                System.out.println("Seu plano atual é 'Turbo' e inclui: ");
                System.out.println("-> 100 minutos de ligação.");
                System.out.println("-> Whatsapp + Instagram gratuitos.");
                System.out.println("-> 5GB para Youtube.");
                break;

            default: // caso o valor digitado seja inválido
                System.out.println(
                        "Plano inválido. Tente novamente com 'B' para Basic, 'M' para Midia e 'T' para Turbo.");
                break;

        }
        scan.close();
    }

}
