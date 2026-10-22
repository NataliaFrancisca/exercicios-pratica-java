package colecoesstream.ElementosUnicosLista;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void main() {
        List<String> eventos = new ArrayList<>();

        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        System.out.println("lista de eventos: " + eventos);

        // podemos passar a lista para a coleção e ela consegue identificar os valores unicos
        Set<String> eventosUnicos = new HashSet<>(eventos);
        System.out.println("lista de eventos (únicos): " + eventosUnicos);
    }
}
