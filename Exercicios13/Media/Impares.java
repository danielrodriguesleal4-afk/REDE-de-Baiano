package Exercicios13.Media;

import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {

    try (Scanner leitor = new Scanner(System.in)) {

        int i = 0;

        System.out.print("Digite um número: ");
        int n = leitor.nextInt();

        for (int cc = n; cc > 0; cc--) {

            if (cc % 2 != 0) {
                i++;
            }

        }

        System.out.println("Total de números ímpares: " + i);
}        
    }
}