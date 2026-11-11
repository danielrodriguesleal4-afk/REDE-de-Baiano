package Exercicios_12.Fácil.Difícil;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

    try (Scanner leitor = new Scanner(System.in)) {

    double saldo = 1000.0;
    int opcao;
    double depo;
    double saca;

    do {

    System.out.println("========= CAIXA ELETRÔNICO ========");
    System.out.println("[1] Consultar Saldo");
    System.out.println("[2] Depositar");
    System.out.println("[3] Sacar");
    System.out.println("[4] Sair");
    System.out.print("Escolha: ");
    opcao = leitor.nextInt();

    switch (opcao) {
        case 1:
            System.out.println("Seu saldo é: R$ " + saldo);
            break;

        case 2:
            System.out.print("Quantos você deseja depositar? ");
            depo = leitor.nextDouble();
            saldo += depo;
            break;

        case 3:
            System.out.print("Quantos você deseja sacar? ");
            saca = leitor.nextDouble();
            if (saca > saldo) {
                System.out.println("Você não possuí dinheiro suficiente!!!");
            } else {
                System.out.println("Você sacou: " + saca);

                saldo -= saca;

                System.out.println("Você possuí atualmente: " + saldo);
            }
            break;

        case 4:

            break;

        default:
            System.out.println("Opção inválida!");
            break;

    }
    } while (opcao != 4);

    System.out.println("Obrigado por usar nosso caixa! Até logo.");

}
    }
}
