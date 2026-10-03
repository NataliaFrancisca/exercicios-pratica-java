package encapsulamento.CadastroProdutos;

public class Main {
    static void main() {
        Produto mouse = new Produto();
        mouse.setNome("mouse");
        mouse.setPreco(50);
        mouse.exibirDetalhes();

        Produto notebook = new Produto();
        notebook.setNome("notebook");
        notebook.setPreco(-12);
        notebook.exibirDetalhes();
    }
}
