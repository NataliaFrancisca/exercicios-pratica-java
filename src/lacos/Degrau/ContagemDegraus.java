package lacos.Degrau;

import java.util.Scanner;

public class ContagemDegraus {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a quantidade de degraus: ");
        int quantidadeDegraus = scanner.nextInt();

        for (int i = 0; i < quantidadeDegraus; i++){
            System.out.println("subindo o degrau: " + (i+1));
        }

        System.out.println("você chegou ao topo!");
    }
}
