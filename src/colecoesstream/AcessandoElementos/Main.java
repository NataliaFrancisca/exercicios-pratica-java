package colecoesstream.AcessandoElementos;


import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<String> jogadores = new ArrayList<>();

        jogadores.add("joão");
        jogadores.add("maria");
        jogadores.add("vitor");
        jogadores.add("ana");

        System.out.println("a segunda jogadora da lista: " + jogadores.getFirst());
    }
}
