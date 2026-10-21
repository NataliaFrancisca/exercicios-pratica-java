package lacos.ContandoNumerosPositivosNegativos;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int numerosPositivos = 0;
        int numerosNegativos = 0;

        while(true){
            System.out.println("Digite um número (ou 'fim' para encerrar):  ");
            String entrada = scanner.nextLine();

           if (entrada.equals("fim")){
               break;
           }

           int numero = Integer.parseInt(entrada);

            if (numero < 0){
                numerosPositivos++;
            } else {
                numerosNegativos++;
            }
        }

        System.out.println("números positivos: " + numerosPositivos);
        System.out.println("números negativos: " + numerosNegativos);
    }
}
