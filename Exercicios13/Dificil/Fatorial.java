package Exercicios13.Dificil;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

    try (Scanner leitor = new Scanner(System.in)) {

        System.out.print("Digite um número: ");
        int n = leitor.nextInt();
        int fatorial = 1;

        for (int i = n; i > 0; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);
        
}
    }
}
