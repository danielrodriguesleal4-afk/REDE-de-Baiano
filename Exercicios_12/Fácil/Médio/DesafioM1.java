package Exercicios_12.Fácil.Médio;

import java.util.Scanner;

public class DesafioM1 {
    public static void main(String[] args) {

// ============= Verificação de Números ============== //

// ---------------- Leitor de Entrada ---------------- //
    try (Scanner leitor = new Scanner(System.in)) {

    int numero, maior = 0, menor = 0, contador = 0, resposta;

    do { 
        System.out.print("Digite um número: ");
        numero = leitor.nextInt();
        contador++;

        if (contador == 1) {
        maior = numero;
        menor = numero; 
    } else {

        if (numero > maior) {
            maior = numero;
        }

        if (numero < menor) {
            menor = numero;
        }
    }

    System.out.print("Deseja continuar? (1 - Sim / 2 - Não): ");
    resposta = leitor.nextInt();    

    } while (resposta == 1);

    // Depois do loop, mostra os resultados
    System.out.println("Maior valor: " + maior);
    System.out.println("Menor valor: " + menor);
    System.out.println("Total de números: " + contador);
    }

    }
}
