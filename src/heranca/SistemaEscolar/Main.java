package br.com.nat.SistemaEscolar;

public class Main {
    public static void main(String[] args) {
        Pessoa alunoA = new Aluno("julia", 16, 8.5);
        Pessoa alunoB = new Aluno("caio", 17, 5.5);

        Pessoa docenteA = new Docente("julia", 24, "Matemática");
        Pessoa docenteB = new Docente("caio", 36, "História");
    
        alunoA.exibirDados();
        alunoB.exibirDados();
        docenteA.exibirDados();
        docenteB.exibirDados();
    }
}
