package colecoesstream.CalculandoEstatisticasNotas;

import java.util.List;

public class Main {
    static void main() {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double somaNotas = notas.stream()
                .reduce(0.00, Double::sum);
        double media = somaNotas / notas.size();
        double menorNota = notas.stream().min(Double::compare).get();
        double maiorNota = notas.stream().max(Double::compare).get();

        System.out.println("a média das notas: " + media);
        System.out.println("a menor nota: " + menorNota);
        System.out.println("a maior nota: " + maiorNota);

    }
}
