package Exercicios_12.Fácil.Médio;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
    try (Scanner leitor = new Scanner(System.in)) {

    int r = 0;
    int resposta = 0;

        do {

            System.out.print("Digite um número: ");
            int n = leitor.nextInt();

            resposta += n;

            System.out.print("Deseja continuar? Sim [1] Não [2] ");
            r = leitor.nextInt();

        } while (r != 2);

        System.out.println("A soma dos números digitados é: " + resposta);
    }
    }
}
