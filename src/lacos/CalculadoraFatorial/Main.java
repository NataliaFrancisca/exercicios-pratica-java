package lacos.CalculadoraFatorial;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println("o fatorial de " + numero + " é: " + fatorial);
    }
}
