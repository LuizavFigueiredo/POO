import java.util.Scanner;

/**
 * Classe principal para desenhar um padrão de borboleta com base na altura fornecida.
 */
public class Borboleta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura;

        // Limpa o terminal (para sistemas Unix/Linux/Mac e Windows)
        limparTerminal();

        // Solicita a entrada do usuário
        System.out.print("Digite um número ímpar entre 1 e 20 para a altura das asas da borboleta: ");
        altura = scanner.nextInt();

        // Verifica se a entrada é válida
        if (!isValido(altura)) {
            System.out.println("Número inválido. O número deve ser ímpar e estar entre 1 e 20.");
            return;
        }

        // Desenha o padrão da borboleta
        desenharBorboleta(altura);
    }

    /**
     * Limpa o terminal para uma exibição mais limpa.
     */
    private static void limparTerminal() {
        String sistema = System.getProperty("os.name");

        try {
            if (sistema.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.err.println("Não foi possível limpar o terminal.");
        }
    }

    /**
     * Verifica se o número fornecido é ímpar e está entre 1 e 20.
     *
     * @param numero Número a ser verificado.
     * @return true se o número for válido, false caso contrário.
     */
    private static boolean isValido(int numero) {
        return numero >= 1 && numero <= 20 && numero % 2 != 0;
    }

    /**
     * Desenha o padrão da borboleta com base na altura fornecida.
     *
     * @param n A altura das asas da borboleta.
     */
    private static void desenharBorboleta(int n) {
        int meio = n / 2;

        // Parte superior da borboleta
        for (int i = 0; i <= meio; i++) {
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("X");
            }
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

        // Parte inferior da borboleta
        for (int i = meio - 1; i >= 0; i--) {
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("X");
            }
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}

