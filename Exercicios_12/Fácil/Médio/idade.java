package Exercicios_12.Fácil.Médio;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
    try (Scanner leitor = new Scanner(System.in)) {

    int idade = 0, opcao = 0;
    
    do {

        System.out.print("Digite sua idade: ");
        idade = leitor.nextInt();

        if (idade < 0) {
            System.out.println("Idade invalida.");
        } else if (idade < 18) {

            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade < 65) {

            System.out.println("Você é maior de idade.");
        } else {
            
            System.out.println("Você é veio.");
        }

        System.out.print("Deseja continuar? (1 - Sim / 2 - Não): ");
        opcao = leitor.nextInt();

    } while (opcao == 1);

    System.out.println("Sua idade é: " + idade);
    System.out.println("Programa encerrado.");

    }
    }
}
