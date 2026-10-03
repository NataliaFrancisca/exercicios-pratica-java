package encapsulamento.AvaliacaoFilme;

public class Main {
    static void main() {
        Filme filmeA = new Filme("Matrix");
        filmeA.adicionarAvaliacao(5);
        filmeA.adicionarAvaliacao(2);
        filmeA.adicionarAvaliacao(2);
        filmeA.adicionarAvaliacao(3);
        filmeA.exibirMedia();

        Filme filmeB = new Filme("Homem Arranha");
        filmeB.adicionarAvaliacao(5);
        filmeB.adicionarAvaliacao(5);
        filmeB.adicionarAvaliacao(5);
        filmeB.adicionarAvaliacao(5);
        filmeB.adicionarAvaliacao(5);
        filmeB.adicionarAvaliacao(4);
        filmeB.exibirMedia();
    }
}
