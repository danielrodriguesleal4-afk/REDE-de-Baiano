package Exercicios13.Dificil;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

    int n = 1;
    int cc = 1;

    System.out.print("Você deseja ativar o programa? Sim [1] Não [2]: ");
    int ativar = leitor.nextInt();

        if (ativar == 1) {

        for (n = 1; n <= 10; n++) {

            System.out.println(" === Tabuada do " + n + ": === ");

            for (cc = 1; cc <= 10; cc++) {

                int r = n * cc;
                System.out.println(n + " x " + cc + " = " + r);
            }

        }

        } else {

            System.out.println("Programa não iniciado.");

        }
}
    }
}
