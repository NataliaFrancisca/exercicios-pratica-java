package lacos.SistemaControleAcessoConvidados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<String> listaConvidados = new ArrayList<>();


        while(true){
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista), 'sair' para terminar");
            String entrada = scanner.nextLine();

            if (entrada.equals("ver")){
                System.out.println(listaConvidados);
            } else if (entrada.equals("sair")){
                System.out.println("programa finalizado.");
                break;
            } else{
                var convidadoJaExiste = listaConvidados.contains(entrada);

                if (convidadoJaExiste){
                    System.out.println(entrada + " já está na lsita de convidados.");
                } else{
                    listaConvidados.add(entrada);
                    System.out.println(entrada + " foi adicionado à list ade convidados.");
                }
            }
        }
    }
}
