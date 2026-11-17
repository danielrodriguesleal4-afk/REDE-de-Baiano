package Exercicios13.Media;

import java.util.Scanner;

public class Calculadora13 {
    public static void main(String[] args) {

    try (Scanner leitor = new Scanner(System.in)) {

    int n = 0;

    System.out.print("Digite um número: ");
    n = leitor.nextInt();

    if ( n != 0 ) {

        for (int cc = 0; cc <= 10; cc++) {

            int r = n * cc;
            System.out.println(n + " x " + cc + " = " + r);
}

    } else {

        System.out.println("Número inválido.");
    }

        }
    }
}
