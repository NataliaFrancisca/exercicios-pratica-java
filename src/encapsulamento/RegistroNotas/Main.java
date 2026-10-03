package encapsulamento.RegistroNotas;

public class Main {
    static void main() {
        Disciplina disciplina = new Disciplina("Matematica");
        disciplina.adicionar(10);
        disciplina.adicionar(5);
        disciplina.adicionar(33);
        disciplina.adicionar(20);
        disciplina.detalhes();
    }
}
