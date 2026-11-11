package Exercicios_12.Fácil;

import java.util.Scanner;

public class DesafioF1 {
    public static void main(String[] args) {

    try (Scanner leitor = new Scanner(System.in)) {

    System.out.print("Me fale um número: ");
    int N = leitor.nextInt();

    do {

        System.out.println(N);
        N--;

    } while ( N > -1);

    System.out.println("Finalizado!!!");

    }
    }
}
