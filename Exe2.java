import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
    
    try (Scanner leitor = new Scanner(System.in)) {

    int n, s = 0;

    String resp;

    do {

       System.out.print("Digite um número: ");
       n = leitor.nextInt();

       s += n; // s = s + n;

       System.out.print("Quer continuar? [S/N]: ");
       resp = leitor.next();

    } while (resp.equals("S"));

    System.out.println("A soma de todos os valores é: " + s);
    
        }
    }
}
