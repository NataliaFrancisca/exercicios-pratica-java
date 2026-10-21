package lacos.PedindoNomeValido;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final int TENTATIVAS = 3;

        for (int i = 0; i < TENTATIVAS; i++){
            System.out.println("Digite o seu nome: ");
            var nome = scanner.nextLine();

            if (nome.length() >= 3){
                System.out.println("Nome " + nome + " cadastrado com sucesso!");
                break;
            } else if (nome.length() < 3){
                System.out.println("Nome inválido. Digite novamente.");
            }
        }
    }
}
