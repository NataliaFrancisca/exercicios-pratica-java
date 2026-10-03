package cam.CalculaNota;

public class Main {
    static void main() {
        CalculaNota calculaNota = new CalculaNota(7);

        Aluno a = new Aluno("nat", 7, 6.7);
        Aluno b = new Aluno("luiz", 10, 8);
        Aluno c = new Aluno("gustavo", 10, 4.5);

        calculaNota.exibirSituacaoNota(a);
        calculaNota.exibirSituacaoNota(b);
        calculaNota.exibirSituacaoNota(c);
    }
}
