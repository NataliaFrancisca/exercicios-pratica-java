package encapsulamento.SistemaPontos;

public class Main {
    static void main() {
        Aluno aluno = new Aluno("nat", 2);
        aluno.exibirStatus();
        aluno.ganharPontos(300);
        aluno.exibirStatus();
    }
}
