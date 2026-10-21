package lacos.PulandoNumeroCinco;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++){

            if (i % 10 == 5){
                continue;
            }

            System.out.println(i + " ");
        }
    }
}
