package colecoesstream.CalculandoQuadradoNumeros;

import java.util.List;

public class Main {
    static void main() {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);
        List<Integer> numerosQuadrado = numeros
                .stream()
                .map(n -> n*n)
                .toList();

        System.out.println("números: " + numeros);
        System.out.println("números quadrado: " + numerosQuadrado);
    }
}
