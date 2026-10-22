package colecoesstream.CadastroClientes;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "nat");
        clientes.put(2, "josé");
        clientes.put(3, "paulina");

        System.out.println("clientes: " + clientes);
        System.out.println("cliente id 2: " + clientes.get(2));
    }
}
