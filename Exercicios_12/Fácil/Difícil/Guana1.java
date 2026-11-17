package Exercicios_12.Fácil.Difícil;

import java.util.Scanner;

public class Guana1 {
    public static void main(String[] args) {

    // ---------------- Leitor de Entrada ---------------- //
    try (Scanner leitor = new Scanner(System.in)) {

    // Valores a serem lidos.
    int valor = 0;
    int total = 0;
    int pares = 0;
    int impares = 0;
    int acima100 = 0;
    int soma = 0;

    do {

    System.out.print("Informe um valor ( 0 interrompe ):");
    valor = leitor.nextInt();

    if (valor != 0) {

        total++;

        soma += valor;

        if (valor % 2 == 0) {
            pares++;
        } else {
            impares++;
        }

        if (valor > 100) {
            acima100++;
        }
    }

    } while (valor != 0);

    System.out.println(" ======== Resultado ========");
    System.out.println("Total de números digitados: " + total);
    System.out.println("Total de números pares: " + pares);
    System.out.println("Total de números ímpares: " + impares);
    System.out.println("Total de números acima de 100: " + acima100);
    System.out.println("Soma dos números digitados: " + soma);

}
    }
}
