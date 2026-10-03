package encapsulamento.ValidacaoLogin;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Usuario aluno = new Usuario("nat123", "1234");
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0){
            System.out.println("Digite o usuário: ");
            String usuario = scanner.nextLine();

            System.out.println("Digite a sua senha: ");
            String senha = scanner.nextLine();

            if (aluno.validarSenha(usuario, senha)){
                System.out.println("Login bem-sucedido!");
                break;
            } else{
                tentativasRestantes--;

                if (tentativasRestantes == 0){
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else{
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }
        scanner.close();
    }
}
