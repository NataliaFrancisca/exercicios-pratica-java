package encapsulamento.AgendaContatos;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> listaContatos = new ArrayList<>();

    public void adicionar(Contato contato){
        this.listaContatos.add(contato);
    }

    public void exibir(){
        for (int i = 0; i < listaContatos.size(); i++){
            var contato = listaContatos.get(i);
            System.out.println(i+1 + ". " + contato.getNome() + " - " + contato.getTelefone());
        }
    }
}
