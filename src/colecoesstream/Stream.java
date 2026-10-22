package colecoesstream;

import java.util.List;

public class Stream {
    static void main() {
        List<String> funcionarios = List.of("ana", "bruno", "carlos", "amanda");

        // funcionarios que começam com a letra A
        // no caso não estamos tratando letras maiusculas e minusculas
        List<String> funcionariosLetraA = funcionarios
                .stream()
                .filter(f -> f.startsWith("a"))
                        .toList();

        System.out.println(funcionarios);
        System.out.println(funcionariosLetraA);

        // percorremos uma lista e de acordo com cada valor, multiplicados com uma comissao de cada venda
        List<Double> valoresVenda = List.of(120.3, 300.00, 550.40, 2.300);
        List<Double> comissao = valoresVenda.stream()
                .map(v -> v * 0.05)
                .toList();

        System.out.println(valoresVenda);
        System.out.println(comissao);

        // somando todos os valores de uma lista de venda
        // passamos o valor inicial e depois uma lambda de Double::sum
        double totalVenda = valoresVenda.stream().reduce(0.00, Double::sum);
        System.out.println(totalVenda);
    }
}
