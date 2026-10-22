package colecoesstream;

import java.util.*;

public class Colecoes {
    static void main() {
        List<String> funcionarios = new ArrayList<>();

        // adicionar funcionarios na lista
        // permite funcionarios duplicados
        // mantem a ordem de inserção
        funcionarios.add("nat");
        funcionarios.add("joão");
        funcionarios.add("jaq");
        funcionarios.add("joão");

        System.out.println(funcionarios);
        System.out.println(funcionarios.getFirst());

        // não mantem ordenação da lista
        // não permite valores duplicados, não lança erro, mas não adiciona um valor duas vezes
        Set<String> produtos = new HashSet<>();
        produtos.add("Água");
        produtos.add("Coca-cola");
        produtos.add("Água");

        System.out.println(produtos);


        // em coleções não usamos os tipos primitivos
        // se a chave for repetida, ele vai sobrescrever o valor anterior
        // não tem ordenação
        // permite a chave null
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "nat");
        clientes.put(2, "joão");
        clientes.put(2, "paulo");
        clientes.put(3, "nat");
        clientes.put(null, "paula");

        System.out.println(clientes);
    }
}
