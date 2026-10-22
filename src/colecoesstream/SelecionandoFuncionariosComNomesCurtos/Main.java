package colecoesstream.SelecionandoFuncionariosComNomesCurtos;

import java.util.List;

public class Main {
    static void main() {
        List<String> funcionarios =
                List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> funcionariosNomesCurtos = funcionarios
                .stream()
                .filter(n -> n.length() <= 5)
                .toList();

        System.out.println("funcionarios: " + funcionarios);
        System.out.println("funcionarios com nomes curtos: " + funcionariosNomesCurtos);
    }
}
