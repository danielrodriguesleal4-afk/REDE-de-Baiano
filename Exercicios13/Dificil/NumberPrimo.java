package Exercicios13.Dificil;

import java.util.Scanner;

public class NumberPrimo {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {

            int q = 0;

            System.out.println("================================");
            System.out.println("       VERIFICADOR DE PRIMOS");
            System.out.println("================================");

            System.out.print("Digite um número: ");
            int n = leitor.nextInt();

            if (n <= 1) {

                System.out.println("Número inválido para ser primo.");

            } else {

                System.out.println("\nDivisores de " + n + ":");

                for (int cc = 1; cc <= n; cc++) {

                    if (n % cc == 0) {

                        q++;
                        System.out.println(" - " + cc);

                    }
                }

                System.out.println("\n================================");

                if (q == 2) {

                    System.out.println(n + " é um número PRIMO!");

                } else {

                    System.out.println(n + " NÃO é um número primo.");

                }

                System.out.println("Quantidade de divisores: " + q);
                System.out.println("================================");

            }
}
    }
}
