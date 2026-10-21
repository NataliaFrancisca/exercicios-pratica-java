package lacos.MonitorandoTentativasLogin;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        final String SENHA_CORRETA = "1234";

        for (int tentativas = 3; tentativas > 0; tentativas--){
            System.out.println("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (senha.equals(SENHA_CORRETA)){
                System.out.println("Senha correta! Acesso concedido!");
            } else if (tentativas > 1){
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas.");
            } else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }

        scanner.close();
    }
}
