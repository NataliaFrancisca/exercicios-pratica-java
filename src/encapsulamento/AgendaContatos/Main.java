package encapsulamento.AgendaContatos;

public class Main {
    static void main() {
        Agenda agenda = new Agenda();

        agenda.adicionar(new Contato("João Silva", "(11) 99999-11222"));
        agenda.adicionar(new Contato("Maria Clara", "(11) 23232-64432"));
        agenda.adicionar(new Contato("Pedro Paulo", "(11) 87876-23432"));

        agenda.exibir();
    }
}
