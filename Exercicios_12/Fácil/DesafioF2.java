package Exercicios_12.Fácil;

    import java.util.Scanner;

    public class DesafioF2 {
        public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {

        int S = 1234;
        int T = 0;

        do {
            System.out.print("Digite a senha (Só números): ");
            T = leitor.nextInt();

            if (T != S) {
                System.out.println("Senha incorreta!!! tente novamente.");

            }

        } while (S != T);
          System.out.println("Senha correta, bem vindo.");

        }
        }
    }
