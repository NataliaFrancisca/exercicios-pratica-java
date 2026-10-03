package cam;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInformacoes(){
        System.out.println("cam.Produto: " + nome);
        System.out.println("Preço: R$.2f\n");
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}
