package lacos.EncontrarMaiorNumero;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite os números separados por espaço: ");
        String[] numerosStr = scanner.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < numerosStr.length; i++){
            int numero = Integer.parseInt(numerosStr[i]);

            if (numero > maior){
                maior = numero;
            }
        }

        System.out.println("o maior número é: " + maior);
    }
}
