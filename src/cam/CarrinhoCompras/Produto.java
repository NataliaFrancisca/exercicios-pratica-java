package cam.CarrinhoCompras;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularPrecoTotal(){
        return this.quantidade * preco;
    }

    public void exibirDetalhes(){
        System.out.println("Total da compra: " + calcularPrecoTotal());
    }
}
