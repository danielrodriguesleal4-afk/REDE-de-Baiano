package Exercicios13.Media;

import java.util.Scanner;

public class Cal13 {
    public static void main(String[] args) {

    try (Scanner leitor = new Scanner(System.in)) {

    // ------ Código para calcular total. ------- //

    int total = 0;
    int resposta = 0;

    for (int n = 0; resposta != 1; n += 0 ) {

        System.out.print("Digite um número: ");
        n = leitor.nextInt();
        total += n;
        
        System.out.print("Deseja continuar? Sim [0] Não [1]: ");
        resposta = leitor.nextInt();
    }

    System.out.println("Total: " + total);
}

    }
}
