package colecoesstream.CalculandoTotalComImposto;

import java.util.List;

public class Main {
    static void main() {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double somaProdutos = precosProdutos.stream().reduce(0.0, Double::sum);
        double somaProdutosMaisImposto = somaProdutos + ((somaProdutos * 8) / 100);

        System.out.println("soma: " + String.format("%.2f", somaProdutos));
        System.out.println("soma + imposto: " + String.format("%.2f", somaProdutosMaisImposto));
    }
}
