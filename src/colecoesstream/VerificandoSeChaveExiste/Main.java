package colecoesstream.VerificandoSeChaveExiste;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "ana");
        clientes.put(2, "joana");
        clientes.put(3, "pedro");
        clientes.put(4, "luana");
        clientes.put(5, "luiz");
        clientes.put(7, "amanda");

        if (clientes.containsKey(7)){
            System.out.println("cliente com ID 7: " + clientes.get(7));
        } else{
            System.out.println("cliente não foi cadastrado.");
        }
    }
}
